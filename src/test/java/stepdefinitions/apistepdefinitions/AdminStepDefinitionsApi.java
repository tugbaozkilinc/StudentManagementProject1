package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.admin_creat.AdminPojo;
import pojos.admin_creat.Adminbody;

import static io.restassured.RestAssured.given;


public class AdminStepDefinitionsApi extends BaseUrl {
    Faker faker = new Faker();
    String ssn = faker.idNumber().ssnValid();
    String userName=faker.name().username();
    String phoneNumber = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
    Adminbody expectedData;
    Response response;

    @When("user sends POST request and do the assertion admin page")
    public void user_sends_post_request_and_do_the_assertion_admin_page() {

        spec.pathParams("first", "admin", "second", "save");

        expectedData = new Adminbody("2000-06-06",
                "Bursa",
                "TRUE",
                "MALE",
                "Ercan",
                "12345678",
                phoneNumber,ssn,
                "ercan123",
                userName);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("user verifies the result of admin creation as adminnn")
    public void user_verifies_the_result_of_admin_creation_as_admin() {
        AdminPojo actualData = response.as(AdminPojo.class);
        Assert.assertEquals(200, response.statusCode());
    }


    @When("user sends POST request as admin to create without name")
    public void userSendsPOSTRequestAsAdminToCreateWithoutName() {
        expectedData = new Adminbody("2000-06-06",
                "Bursa",
                "TRUE",
                "MALE",
                null,
                "12345678",
                phoneNumber,ssn,
                "ercan123",userName);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("{first}/{second}");
        response.prettyPrint();
    }



    @When("user sends POST request as admin to create without surname")
    public void userSendsPOSTRequestAsAdminToCreateWithoutSurname() {

        expectedData = new Adminbody("2000-06-06",
                "Bursa",
                "TRUE",
                "MALE",
                "Ercan",
                "12345678",
                phoneNumber,ssn,
                null,
                userName);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("{first}/{second}");
        response.prettyPrint();
    }


}
