package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.studentmanagement.CreateStudentBodyPojo;
import pojos.studentmanagement.CreateStudentInvalidPojo;
import pojos.studentmanagement.CreateStudentResponsePojo;

import static baseurl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class StudentManagementApi {

    Response response;
    CreateStudentBodyPojo expectedData = new CreateStudentBodyPojo();

    @Given("user sends post request to create student as Vice Dean")
    public void user_sends_post_request_to_create_student_as_vice_dean() {
        spec.pathParams("first", "students", "second", "save");
        response = given(spec).body(expectedData).when().post("/{first}/{second}");
    }

    @Then("user gets the vice dean create student POST request response and assert {string} message")
    public void userGetsTheViceDeanCreateStudentPOSTRequestResponseAndAssertMessage(String string) {
        CreateStudentResponsePojo actualData = response.as(CreateStudentResponsePojo.class);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(expectedData.getName(), actualData.getObject().getName());
        Assert.assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
        Assert.assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        Assert.assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        Assert.assertEquals(expectedData.getMotherName(), actualData.getObject().getMotherName());
        Assert.assertEquals(expectedData.getFatherName(), actualData.getObject().getFatherName());
        Assert.assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        Assert.assertTrue(actualData.getObject().isActive());
        Assert.assertEquals(string, actualData.getMessage());
    }

    @Given("user sends a post request as vice dean to create student without {string}")
    public void userSendsAPostRequestAsViceDeanToCreateStudentWithout(String emptyField) {
        spec.pathParams("first", "students", "second", "save");

        switch (emptyField) {
            case "advisorTeacherId":
                expectedData.setAdvisorTeacherId(null);
                break;
            case "name":
                expectedData.setName(null);
                break;
            case "surname":
                expectedData.setSurname(null);
                break;
            case "birthPlace":
                expectedData.setBirthPlace(null);
                break;
            case "email":
                expectedData.setEmail(null);
                break;
            case "phoneNumber":
                expectedData.setPhoneNumber(null);
                break;
            case "gender":
                expectedData.setGender(null);
                break;
            case "birthDay":
                expectedData.setBirthDay(null);
                break;
            case "ssn":
                expectedData.setSsn(null);
                break;
            case "username":
                expectedData.setUsername(null);
                break;
            case "fatherName":
                expectedData.setFatherName(null);
                break;
            case "motherName":
                expectedData.setMotherName(null);
                break;
            case "password":
                expectedData.setPassword(null);
                break;
        }

        response = given(spec).body(expectedData).when().post("/{first}/{second}");
    }

    @Then("user gets the vice dean create student POST request response and assert message {string} for advisorTeacherId")
    public void userGetsTheViceDeanCreateStudentPOSTRequestResponseAndAssertMessageAdvisorForTeacherId(String message) {
        CreateStudentInvalidPojo actualData = response.as(CreateStudentInvalidPojo.class);
        Assert.assertEquals(400, response.statusCode());
        Assert.assertEquals(message, actualData.getValidations().getAdvisorTeacherId());
    }

    @Then("user gets the vice dean create student POST request response and assert message {string} for name")
    public void userGetsTheViceDeanCreateStudentPOSTRequestResponseAndAssertMessageForName(String message) {
        CreateStudentInvalidPojo actualData = response.as(CreateStudentInvalidPojo.class);
        Assert.assertEquals(400, response.statusCode());
        Assert.assertEquals(message, actualData.getValidations().getName());
    }

    @Then("user gets the vice dean create student POST request response and assert message {string} for surname")
    public void userGetsTheViceDeanCreateStudentPOSTRequestResponseAndAssertMessageForSurname(String message) {
        CreateStudentInvalidPojo actualData = response.as(CreateStudentInvalidPojo.class);
        Assert.assertEquals(400, response.statusCode());
        Assert.assertEquals(message, actualData.getValidations().getSurname());
    }

    @Then("user gets the vice dean create student POST request response and assert message {string} for birthPlace")
    public void userGetsTheViceDeanCreateStudentPOSTRequestResponseAndAssertMessageForBirthPlace(String message) {
        CreateStudentInvalidPojo actualData = response.as(CreateStudentInvalidPojo.class);
        Assert.assertEquals(400, response.statusCode());
        Assert.assertEquals(message, actualData.getValidations().getBirthPlace());
    }

    @Then("user gets the vice dean create student POST request response and assert message {string} for email")
    public void userGetsTheViceDeanCreateStudentPOSTRequestResponseAndAssertMessageForEmail(String message) {
        CreateStudentInvalidPojo actualData = response.as(CreateStudentInvalidPojo.class);
        Assert.assertEquals(400, response.statusCode());
        Assert.assertEquals(message, actualData.getValidations().getEmail());
    }

    @Then("user gets the vice dean create student POST request response and assert message {string} for phone number")
    public void userGetsTheViceDeanCreateStudentPOSTRequestResponseAndAssertMessageForPhoneNumber(String message) {
        CreateStudentInvalidPojo actualData = response.as(CreateStudentInvalidPojo.class);
        Assert.assertEquals(400, response.statusCode());
        Assert.assertEquals(message, actualData.getValidations().getPhoneNumber());
    }
}

