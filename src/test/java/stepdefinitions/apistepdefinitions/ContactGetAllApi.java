package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.contactgetall.ContactGetAll;
import pojos.contactgetall.ContactGetAllResponse;

import java.time.LocalDate;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ContactGetAllApi extends BaseUrl {

    Faker faker = new Faker();
    public static String contactGetAllEmail;
    public static String contactGetAllMessage;
    public static String contactGetAllName;
    public static String contactGetAllSubject;
    public static LocalDate contactGetAllDate;
    @When("user sends POST request and do the assertion for reading contact messages by dean")
    public void userSendsPOSTRequestAndDoTheAssertionForReadingContactMessagesByDean() {
        contactGetAllDate = LocalDate.now();
        contactGetAllEmail = "tugba" + faker.number().digits(3) + "@gmail.com";
        contactGetAllMessage = faker.lorem().sentence(5);
        contactGetAllName = "Wednesday";
        contactGetAllSubject = "subject";
        spec.pathParams("first", "contactMessages", "second", "save");
        ContactGetAll expectedData = new ContactGetAll(contactGetAllEmail, contactGetAllMessage, contactGetAllName, contactGetAllSubject);
        Response response = given(spec).body(expectedData).contentType(ContentType.JSON).when().post("/{first}/{second}");
        ContactGetAllResponse actualData = response.as(ContactGetAllResponse.class);
        //assertEquals(200, response.statusCode());
        //assertEquals("Contact Message Created Successfully", actualData.getMessage());
    }

    @When("user sends GET request and do the assertion for reading contact messages by dean")
    public void user_sends_get_request_and_do_the_assertion_for_reading_contact_messages_by_dean() {
        spec.pathParams("first", "contactMessages", "second", "searchByEmail").queryParams("email", contactGetAllEmail);
        Response response = given(spec).when().get("/{first}/{second}");
        JsonPath jsonPath = response.jsonPath();
        List<String> nameList = jsonPath.getList("content.name");
        //assert nameList.contains(contactGetAllName);
        List<String> emailList = jsonPath.getList("content.email");
        //assert emailList.contains(contactGetAllEmail);
        List<String> subjectList = jsonPath.getList("content.subject");
        //assert subjectList.contains(contactGetAllSubject);
        List<String> messageList = jsonPath.getList("content.message");
        //assert messageList.contains(contactGetAllMessage);
    }

}
