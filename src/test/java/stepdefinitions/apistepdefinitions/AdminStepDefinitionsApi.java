package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pojos.admin_creat.AdminDataPojo;
import pojos.admin_creat.AdminPojo;
import pojos.admin_creat.Adminbody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class AdminStepDefinitionsApi extends BaseUrl {
    Faker faker = new Faker();
    String ssn = faker.idNumber().ssnValid();
    String userName = faker.name().username();
    String phoneNumber = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
    Adminbody expectedData;
    AdminPojo actualData;
    Response response;
    static int userId;

    @When("user sends POST request and do the assertion admin page")
    public void user_sends_post_request_and_do_the_assertion_admin_page() {
        spec.pathParams("first", "admin", "second", "save");
        expectedData = new Adminbody("2000-06-06",
                "Bursa",
                "TRUE",
                "MALE",
                "Ercan",
                "12345678",
                phoneNumber, ssn,
                "ercan123",
                userName);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("{first}/{second}");
        actualData = response.as(AdminPojo.class);
        userId = actualData.getObject().getUserId();

        Assert.assertEquals(200, response.statusCode());
        //  Assert.assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        //   Assert.assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        Assert.assertEquals(expectedData.getName(), actualData.getObject().getName());
        Assert.assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        Assert.assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        Assert.assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
    }

    @And("user sends DELETE request and do the assertion for creating ADMIN")
    public void userSendsPUTRequestAndDoTheAssertionForCreatingADMIN() {
        spec.pathParams("first", "admin", "second", "delete", "third", userId);
        response = given(spec).when().delete("/{first}/{second}/{third}");
        response.then().statusCode(200);
    }


    @And("user sends getall request and sees created admin accounts")
    public void userSendsGetallRequestAndSeesCreatedAdminAccounts() {
        spec.pathParams("first", "admin", "second", "getAll");
        response = given(spec).when().get("/{first}/{second}");
        response.then().statusCode(200);
    }
}
