package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.studentmanagement.CreateStudentInvalidDataPojo;
import pojos.studentmanagement.CreateStudentDataPojo;
import pojos.studentmanagement.CreateStudentPojo;

import java.util.Locale;

import static io.restassured.RestAssured.given;
import static utilities.ReusableApiMethods.getARandomAdvisorTeacherId;
import static utilities.ReusableMethods.generateCurrentDate;
import static utilities.ReusableMethods.generateTomorrowsDate;


public class StudentManagementStepDefinitionsApi extends BaseUrl {

    CreateStudentDataPojo expectedData;
    CreateStudentInvalidDataPojo actualData;
    Faker faker = new Faker(Locale.US);
    String email = faker.internet().emailAddress();
    String ssn = faker.idNumber().ssnValid();
    String username = faker.name().username();
    String phone = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
    Integer randomAdvisorTeacherId = getARandomAdvisorTeacherId();
    Response response;

    @When("user sends a POST request as vice dean to create a student")
    public void user_sends_a_post_request_as_vice_dean_to_create_a_student() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
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
        expectedData = new CreateStudentDataPojo(
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
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
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
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
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
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
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
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
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
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
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

    @When("user sends a POST request as vice dean to create a student without gender")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutGender() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                null,
                "Ayse",
                "Emin",
                "12345678",
                phone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without birth day")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutBirthDay() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                null,
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

    @When("user sends a POST request as vice dean to create a student without ssn")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutSsn() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                phone,
                null,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without username")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutUsername() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
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
                null);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without father name")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutFatherName() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                email,
                null,
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

    @When("user sends a POST request as vice dean to create a student without mother name")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutMotherName() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                null,
                "Emin",
                "12345678",
                phone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student without password")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithoutPassword() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                null,
                phone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }


    @Then("user verifies the validations part has the {string} key and {string} message")
    public void userVerifiesTheValidationsPartHasTheKeyAndMessage(String key, String message) {
        switch (key) {
            case "advisorTeacherId":
                Assert.assertEquals(message, actualData.validations.getAdvisorTeacherId());
                break;
            case "name":
                Assert.assertEquals(message, actualData.validations.getName());
                break;
            case "surname":
                Assert.assertEquals(message, actualData.validations.getSurname());
                break;
            case "birthPlace":
                Assert.assertEquals(message, actualData.validations.getBirthPlace());
                break;
            case "phoneNumber":
                Assert.assertEquals(message, actualData.validations.getPhoneNumber());
                break;
            case "email":
                Assert.assertEquals(message, actualData.validations.getEmail());
                break;
            case "gender":
                Assert.assertEquals(message, actualData.validations.getGender());
                break;
            case "BirthDay":
                Assert.assertEquals(message, actualData.validations.getBirthDay());
                break;
            case "ssn":
                Assert.assertEquals(message, actualData.validations.getSsn());
                break;
            case "username":
                Assert.assertEquals(message, actualData.validations.getUsername());
                break;
            case "fatherName":
                Assert.assertEquals(message, actualData.validations.getFatherName());
                break;
            case "motherName":
                Assert.assertEquals(message, actualData.validations.getMotherName());
                break;
            case "password":
                Assert.assertEquals(message, actualData.validations.getPassword());
                break;
        }
    }

    @Then("user verifies that the student creation is successfull as vice dean")
    public void userVerifiesThatTheStudentCreationIsSuccessfullAsViceDean() {
        CreateStudentPojo actualData = response.as(CreateStudentPojo.class);
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


    @When("user sends a POST request as vice dean to create a student with an invalid email {string}")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithAnInvalidEmail(String invalidEmail) {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                invalidEmail,
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

    @When("user sends a POST request as vice dean to create a student with an invalid phone {string}")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithAnInvalidPhone(String invalidPhone) {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                invalidPhone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }


    @When("user sends a POST request as vice dean to create a student with a future date")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithAFutureDate() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                generateTomorrowsDate("yyyy-MM-dd"),
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

    @When("user sends a POST request as vice dean to create a student with the current date")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithTheCurrentDate() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                generateCurrentDate("yyyy-MM-dd"),
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

    @When("user sends a POST request as vice dean to create a student with an invalid ssn {string}")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithAnInvalidSsn(String invalidSsn) {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "12345678",
                phone,
                invalidSsn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }

    @When("user sends a POST request as vice dean to create a student with an invalid password")
    public void userSendsAPOSTRequestAsViceDeanToCreateAStudentWithAnInvalidPassword() {
        spec.pathParams("first", "students", "second", "save");
        expectedData = new CreateStudentDataPojo(
                randomAdvisorTeacherId,
                "1985-05-26",
                "Ankara",
                email,
                "Ali",
                "MALE",
                "Ayse",
                "Emin",
                "1234567",
                phone,
                ssn,
                "Emin",
                username);
        response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
    }


}

