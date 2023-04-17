package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.vicedeanmanagement.ViceDeanManagement;
import pojos.vicedeanmanagement.ViceDeanManagementResponse;

import java.util.Locale;

import static io.restassured.RestAssured.given;

public class ViceDeanManagementApi extends BaseUrl {

    Faker faker = new Faker(Locale.US);
    String phoneNumber = faker.number().digits(3)+ "-" + faker.number().digits(3) + "-" + faker.number().digits(4) + "";
    String ssn = faker.idNumber().ssnValid() + "";
    String userName = faker.name().username();
    static int userId;
    @When("user sends POST request and do the assertion for creating vice dean by dean")
    public void user_sends_post_request_and_do_the_assertion_for_creating_vice_dean_by_dean() {
        //Set the url
        spec.pathParams("first", "vicedean", "second", "save");

        //Set the expected data
        ViceDeanManagement expectedData = new ViceDeanManagement("1990-04-17", "Paris", "MALE", "Natalia", "12345678", phoneNumber, ssn, "Karima", userName);
        System.out.println("Expected Data: " + expectedData);

        //Send the request and get the response
        Response response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
        response.prettyPrint();

        //Do assertion
        ViceDeanManagementResponse actualData = response.as(ViceDeanManagementResponse.class);
        System.out.println("Actual Data: " + actualData);
    }

}

/*
{
    "object": {
        "userId": 873,
        "username": "antonio.muller",
        "name": "Natalia",
        "surname": "Karima",
        "birthDay": "1990-04-17",
        "ssn": "716-61-5867",
        "birthPlace": "Paris",
        "phoneNumber": "718-935-9871",
        "gender": "MALE"
    },
    "message": "Vice dean Saved",
    "httpStatus": "CREATED"
}

 */
