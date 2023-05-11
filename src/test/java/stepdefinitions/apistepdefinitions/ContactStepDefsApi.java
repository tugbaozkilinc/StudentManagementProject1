package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.contact.ContactNegativeResponse;
import pojos.contact.ContactPostPojo;
import pojos.contact.ContactResponsePojo;
import java.util.Map;

public class ContactStepDefsApi extends BaseUrl {

    private static String name;
    private static String email;
    private static String subject;
    private static String message;
    Response response;
    static Faker faker = new Faker();

    @When("user sends the POST request to send a message_US03")
    public void user_sends_the_post_request_to_send_a_message_us03() {
        //contactMessages/save

        spec.pathParams("first", "contactMessages","second","save");

        // Expected Data
        ContactPostPojo expectedData = createContactPostPojo();
        response = RestAssured.given().spec(spec).body(expectedData).contentType(ContentType.JSON).when().post("{first}/{second}");

    }
    @Then("user gets the response and do assertion_US03")
    public void user_gets_the_response_and_do_assertion_us03() {
        ContactResponsePojo actualData = response.as(ContactResponsePojo.class);

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(name, actualData.getObject().getName());
        Assert.assertEquals(email, actualData.getObject().getEmail());
        Assert.assertEquals(subject, actualData.getObject().getSubject());
        Assert.assertEquals(message, actualData.getObject().getMessage());
      //  Assert.assertEquals(String.valueOf(LocalDate.now()), actualData.getObject().getDate());
        Assert.assertEquals("Contact Message Created Successfully", actualData.getMessage());
        Assert.assertEquals("CREATED", actualData.getHttpStatus());

    }
    @Then("user gets the response and do assertion by email US03")
    public void user_gets_the_response_and_do_assertion_by_email_us03() {
        //contactMessages/searchByEmail?email=email
        spec.pathParams("first", "contactMessages","second","searchByEmail").queryParam("email", email);
        response = RestAssured.given(spec).get("{first}/{second}");

        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(name,jsonPath.getString("content[0].name"));
        Assert.assertEquals(email,jsonPath.getString("content[0].email"));
        Assert.assertEquals(subject,jsonPath.getString("content[0].subject"));
        Assert.assertEquals(message,jsonPath.getString("content[0].message"));
      //  Assert.assertEquals(String.valueOf(LocalDate.now()),jsonPath.getString("content[0].date"));

    }

    @Then("user gets the response and do assertion by subject US03")
    public void user_gets_the_response_and_do_assertion_by_subject_us03() {
        //{{baseUrl}}/contactMessages/searchBySubject?subject=subject

        spec.pathParams("first", "contactMessages","second","searchBySubject").queryParam("subject", subject);
        response = RestAssured.given(spec).get("{first}/{second}");

        JsonPath jsonPath = response.jsonPath();
        Map<Object, Object> actualData = jsonPath.getMap("content[0]");

        Assert.assertEquals(name,actualData.get("name"));
        Assert.assertEquals(email,actualData.get("email"));
        Assert.assertEquals(subject,actualData.get("subject"));
        Assert.assertEquals(message,actualData.get("message"));
       // Assert.assertEquals(String.valueOf(LocalDate.now()),actualData.get("date"));

    }

    @When("user sends the POST request to send a message by empty {string} and sees the {string} US03")
    public void user_sends_the_post_request_to_send_a_message_by_empty_and_sees_the_us03(String value, String errorMessage) {

        ContactPostPojo expectedData = createContactPostPojo();

        spec.pathParams("first", "contactMessages","second","save");

        if (value.equalsIgnoreCase("name")){
            expectedData.setName(null);
            response = RestAssured.given().spec(spec).body(expectedData).when().post("{first}/{second}");
            JsonPath jsonPath = response.jsonPath();
            Assert.assertEquals(errorMessage, jsonPath.getString("validations.name"));
        }
        else if (value.equalsIgnoreCase("email")){
            expectedData.setEmail(null);
            response = RestAssured.given().spec(spec).body(expectedData).when().post("{first}/{second}");
            JsonPath jsonPath = response.jsonPath();
            Assert.assertEquals(errorMessage, jsonPath.getString("validations.email"));
        }

        else if (value.equalsIgnoreCase("subject")){
            expectedData.setSubject(null);
            response = RestAssured.given().spec(spec).body(expectedData).when().post("{first}/{second}");
            JsonPath jsonPath = response.jsonPath();
            Assert.assertEquals(errorMessage, jsonPath.getString("validations.subject"));
        }
        else if (value.equalsIgnoreCase("message")){
            expectedData.setMessage(null);
            response = RestAssured.given().spec(spec).body(expectedData).when().post("{first}/{second}");
            JsonPath jsonPath = response.jsonPath();
            Assert.assertEquals(errorMessage, jsonPath.getString("validations.message").trim());
        }

    }




    @When("user sends the POST request to send a message by invalid {string} US03")
    public void user_sends_the_post_request_to_send_a_message_by_invalid_us03(String string) {
            //{{baseUrl}}/contactMessages/save

        spec.pathParams("first", "contactMessages","second","save");
        ContactPostPojo expectedData = createContactPostPojo();
        expectedData.setEmail(string);
        response = RestAssured.given(spec).body(expectedData).when().post("{first}/{second}");

    }
    @Then("user gets the response and sees the {string} US03")
    public void user_gets_the_response_and_sees_the_us03(String string) {

        ContactNegativeResponse actualData = response.as(ContactNegativeResponse.class);

        Assert.assertEquals(400, actualData.getStatusCode());
        Assert.assertEquals("/contactMessages/save", actualData.getPath());
        Assert.assertEquals(string, actualData.getValidations().getEmail());
    }



    public static ContactPostPojo createContactPostPojo() {
        Faker faker = new Faker();
        String name = faker.regexify("[A-Za-z]{7}").toUpperCase();
        String email = "team09" + faker.number().digits(4) + "@gmail.com";
        String subject = "Subject " + faker.lorem().characters(16);
        String message = faker.lorem().sentence(3);
        return new ContactPostPojo(name, email, subject, message);
    }







}
