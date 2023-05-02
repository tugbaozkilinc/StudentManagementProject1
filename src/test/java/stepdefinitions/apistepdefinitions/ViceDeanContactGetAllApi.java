package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.contactgetall.ContactGetAll;

import java.util.Locale;

import static baseurl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class ViceDeanContactGetAllApi {

    Response response;
    ContactGetAll expectedData;
    Faker faker = new Faker(Locale.US);
    String email;
    @When("user sends the POST request to send a message_US16")
    public void user_sends_the_post_request_to_send_a_message_us16() {
        spec.pathParams("first", "contactMessages", "second", "save");
        expectedData = new ContactGetAll(
                "emin" + faker.number().digits(3) + "@gmail.com",
                faker.lorem().sentence(),
                "Emin",
                "subject");
        response = given(spec).body(expectedData).when().post("/{first}/{second}");
        email = response.jsonPath().getString("object.email");
    }
    @When("user sends the GET request to get the message by using email_US16")
    public void user_sends_the_get_request_to_get_the_message_by_using_email_us16() {
        spec.pathParams("first", "contactMessages", "second", "searchByEmail").queryParam("email", email);
        response = given(spec).when().get("/{first}/{second}");
        response.prettyPrint();
    }
    @Then("user gets the response and do assertion to check if the sent message is visible to the vice dean_US16")
    public void user_gets_the_response_and_do_assertion_to_check_if_the_sent_message_is_visible_to_the_vice_dean_us16() {

    }

}
