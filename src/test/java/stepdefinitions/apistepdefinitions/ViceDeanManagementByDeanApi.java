package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.vicedeanmanagement.ViceDeanManagement;
import pojos.vicedeanmanagement.ViceDeanManagementResponse;

import java.util.Locale;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class ViceDeanManagementByDeanApi extends BaseUrl {

    Faker faker = new Faker(Locale.US);
    String phoneNumber = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4) + "";
    String ssn = faker.idNumber().ssnValid() + "";
    String userName = faker.name().username();
    static int userId;

    @When("user sends POST request and do the assertion for creating vice dean by dean")
    public void user_sends_post_request_and_do_the_assertion_for_creating_vice_dean_by_dean() {
        spec.pathParams("first", "vicedean", "second", "save");
        ViceDeanManagement expectedData = new ViceDeanManagement("1990-04-17", "Paris", "MALE", "Natalia", "12345678", phoneNumber, ssn,
                "Karima", userName);
        Response response = given(spec).body(expectedData).contentType(ContentType.JSON).when().post("/{first}/{second}");
        ViceDeanManagementResponse actualData = response.as(ViceDeanManagementResponse.class);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
        assertEquals("Vice dean Saved", actualData.getMessage());
        userId = actualData.getObject().getUserId();
    }

    @And("user sends PUT request and do the assertion for creating vice dean by dean")
    public void userSendsPUTRequestAndDoTheAssertionForCreatingViceDeanByDean() {
        spec.pathParams("first", "vicedean", "second", "update", "third", userId);
        ViceDeanManagement expectedData = new ViceDeanManagement("1994-05-17", "Italy", "FEMALE", "Suzie", "12345678", phoneNumber, ssn,
                "Alter", userName);
        Response response = given(spec).body(expectedData).contentType(ContentType.JSON).when().put("/{first}/{second}/{third}");
        ViceDeanManagementResponse actualData = response.as(ViceDeanManagementResponse.class);
        assertEquals(200, response.statusCode());
        assertEquals(userId, (int) actualData.getObject().getUserId());
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        assertEquals(expectedData.getName(), actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
        assertEquals("Vice dean Updated Successful", actualData.getMessage());
    }

    @And("user sends DELETE request and do the assertion for creating vice dean by dean")
    public void userSendsDELETERequestAndDoTheAssertionForCreatingViceDeanByDean() {
        spec.pathParams("first", "vicedean", "second", "delete", "third", userId);
        Response response = given(spec).when().delete("/{first}/{second}/{third}");
        response.then().statusCode(200).body("message", equalTo("Vice dean Deleted"), "httpStatus", equalTo("OK"));
    }

    @And("user sends GET request and do the assertion for creating vice dean by dean")
    public void userSendsGETRequestAndDoTheAssertionForCreatingViceDeanByDean() {
        spec.pathParams("first", "vicedean", "second", "getViceDeanById", "third", userId);
        Response response = given(spec).when().get("/{first}/{second}/{third}");
        response.prettyPrint();
        response.then().statusCode(400).body("message", equalTo("Error: User with SSN " + userId + " not found"));
    }

}

