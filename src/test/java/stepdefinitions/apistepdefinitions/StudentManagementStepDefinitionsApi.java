package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.studentmanagement.CreateStudentInvalidDataPojo;
import pojos.studentmanagement.CreateStudentPojo;
import pojos.studentmanagement.StudentPojo;

import java.util.Locale;

import static io.restassured.RestAssured.given;


public class StudentManagementStepDefinitionsApi extends BaseUrl {

    CreateStudentPojo expectedData;
    CreateStudentInvalidDataPojo actualData;
    Faker faker = new Faker(Locale.US);
    String email = faker.internet().emailAddress();
    String ssn = faker.idNumber().ssnValid();
    String username = faker.name().username();
    String phone = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
    Response response;

    @When("user sends a POST request as vice dean to create a student")
    public void user_sends_a_post_request_as_vice_dean_to_create_a_student() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentPojo(
                107,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                phone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without advisor teacher")
    public void user_sends_a_post_request_as_vice_dean_to_create_a_student_without_advisor_teacher() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentPojo(
                null,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                phone,
                ssn,
                "Emin",
                username
        );
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without name")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutName() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentPojo(
                107,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                null,
                "12345678",
                phone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without surname")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutSurname() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentPojo(
                107,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                phone,
                ssn,
                null,
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without birth place")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutBirthPlace() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentPojo(
                107,
                "1985-05-26",
                null,
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                phone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without phone number")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutPhoneNumber() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentPojo(
                107,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                null,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without email")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutEmail() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentPojo(
                107,
                "1985-05-26",
                "Ankara",
                null,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                phone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @Then("user verifies the validations part has the {string} key and {string} message")
    public void userVerifiesTheValidationsPartHasTheKeyAndMessage(String key, String message) {
        if (key.equals("advisorTeacherId")) {
            Assert.assertEquals(message, actualData.validations.getAdvisorTeacherId());
        } else if (key.equals("name")) {
            Assert.assertEquals(message, actualData.validations.getName());
        } else if (key.contains("surname")) {
            Assert.assertEquals(message, actualData.validations.getSurname());
        } else if (key.contains("birthPlace")) {
            Assert.assertEquals(message, actualData.validations.getBirthPlace());
        } else if (key.contains("phoneNumber")) {
            Assert.assertEquals(message, actualData.validations.getPhoneNumber());
        } else if (key.contains("email")) {
            Assert.assertEquals(message, actualData.validations.getEmail());
        }
    }

    @Then("user verifies the result of student creation as vice dean")
    public void user_verifies_the_result_of_student_creation_as_vice_dean() {
        StudentPojo actualData = response.as(StudentPojo.class);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals("Student saved Successfully", actualData.getMessage());
    }

    @Then("user verifies the message is {string} for student creation POST request")
    public void user_verifies_the_message_is_for_student_creation_post_request(String string) {
        actualData = response.as(CreateStudentInvalidDataPojo.class);
        Assert.assertEquals(string, actualData.message);
    }

    @Then("user verifies the status code is {string} for student creation POST request")
    public void user_verifies_the_status_code_is_for_student_creation_post_request(String string) {
        Assert.assertEquals(400, response.statusCode());
    }


}
