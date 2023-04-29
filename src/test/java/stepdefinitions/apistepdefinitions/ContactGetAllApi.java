package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.contactgetall.ContactGetAll;
import pojos.contactgetall.ContactGetAllResponse;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ContactGetAllApi extends BaseUrl {

    Faker faker = new Faker();
    static String email;
    static String message;
    static String name;
    static String subject;
    @When("user sends POST request and do the assertion for reading contact messages by dean")
    public void userSendsPOSTRequestAndDoTheAssertionForReadingContactMessagesByDean() {
        email = faker.internet().emailAddress();
        message = faker.lorem().sentence(5);
        name = faker.name().fullName();
        subject = "The beauty";
        spec.pathParams("first", "contactMessages", "second", "save");
        ContactGetAll expectedData = new ContactGetAll(email, message, name, subject);
        Response response = given(spec).body(expectedData).contentType(ContentType.JSON).when().post("/{first}/{second}");
        ContactGetAllResponse actualData = response.as(ContactGetAllResponse.class);
        assertEquals(200, response.statusCode());
        assertEquals("Contact Message Created Successfully", actualData.getMessage());
    }

    @When("user sends GET request and do the assertion for reading contact messages by dean")
    public void user_sends_get_request_and_do_the_assertion_for_reading_contact_messages_by_dean() {
        spec.pathParams("first", "contactMessages", "second", "searchByEmail").queryParams("email", email);
        Response response = given(spec).when().get("/{first}/{second}");
        JsonPath jsonPath = response.jsonPath();
        List<String> nameList = jsonPath.getList("content.name");
        assert nameList.contains(name);
        List<String> emailList = jsonPath.getList("content.email");
        assert emailList.contains(email);
        List<String> subjectList = jsonPath.getList("content.subject");
        assert subjectList.contains(subject);
        List<String> messageList = jsonPath.getList("content.message");
        assert messageList.contains(message);
    }

}
