package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojos.contact.ContactPostPojo;


public class ContactApi extends BaseUrl {

    private static String name;
    private static String email;
    private static String subject;
    private static String message;
    private static Response response;
    Faker faker = new Faker();

    @When("user sends the POST request to send a message_US03")
    public void user_sends_the_post_request_to_send_a_message_us03() {
        //contactMessages/save
        spec.pathParams("first", "contactMessages","second","save");

        // Expected Data
        name = faker.name().firstName();
        email = "team09_" + name + "@gmail.com";
        System.out.println("email = " + email);
        subject = faker.lorem().characters(16);
        message = faker.lorem().sentence(3);

        ContactPostPojo expectedData = new ContactPostPojo(name,email,subject,message);

        response = RestAssured.given().spec(spec).body(expectedData).post("{first}/{second}");
        response.prettyPrint();

    }
    @Then("user gets the response and do assertion_US03")
    public void user_gets_the_response_and_do_assertion_us03() {

        //contactMessages/searchByEmail?email=email
//        spec.pathParams("first", "contactMessages","second","searchByEmail").queryParam("email", email);
//        response = RestAssured.given(spec).get("{first}{second}");
//        response.prettyPrint();





    }




}
