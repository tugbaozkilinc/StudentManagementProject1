package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.register.RegisterObject;
import pojos.register.RegisterPojo;

import java.text.SimpleDateFormat;

public class GuestUserStepDefsApi extends BaseUrl {

    static Faker faker = new Faker();
    Response response;

    static int userId;

    @When("user sends the POST request to create a guest user account US02")
    public void user_sends_the_post_request_to_create_a_guest_user_account_us02() {
       // {{baseUrl}}/guestUser/register

        spec.pathParams("first", "guestUser","second","register");

        RegisterObject expectedData = createRegisterObject();
        response = RestAssured.given(spec).body(expectedData).post("{first}/{second}");
    }
    @Then("verifies user has created successfully US02")
    public void verifies_user_has_created_successfully_us02() {

        RegisterPojo actualData = response.as(RegisterPojo.class);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals("Guest User registered.", actualData.getMessage());
        Assert.assertEquals("CREATED", actualData.getHttpStatus());
        userId = actualData.getObject().getUserId();
    }
    @Then("user sends the DELETE request US02")
    public void user_sends_the_delete_request_us02() {
        //{{baseUrl}}/guestUser/delete/userId

        spec.pathParams("first","guestUser","second","delete","third",userId);
        response = RestAssured.given(spec).delete("{first}/{second}/{third}");

    }
    @Then("user gets the response and do the assertion US02")
    public void user_gets_the_response_and_do_the_assertion_us02() {

      JsonPath jsonPath = response.jsonPath();

      Assert.assertEquals(200, response.statusCode());
      Assert.assertEquals(" Guest User deleted Successful", jsonPath.getString("message"));
      Assert.assertEquals("OK", jsonPath.getString("httpStatus"));

    }


    public static RegisterObject createRegisterObject(){

        return new RegisterObject("1990-01-01",
                "Istanbul",
                "MALE",
                "Ali",
                "87654321",
                faker.numerify("###-###-####"),
                faker.numerify("###-##-####"),
                "Veli",
                faker.name().username());
    }



}
