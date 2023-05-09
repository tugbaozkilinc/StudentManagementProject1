package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.studentmanagement.CreateStudentBodyPojo;
import pojos.studentmanagement.CreateStudentResponsePojo;

import static baseurl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class StudentManagementApi {

    Response response;
    CreateStudentBodyPojo body = new CreateStudentBodyPojo();
    CreateStudentResponsePojo actualData;
    public static int studentUserId;

    @When("user sends the POST request to create student as vice dean_(US15)")
    public void user_sends_the_post_request_to_create_student_as_vice_dean_us15() {
        spec.pathParams("first", "students", "second", "save");
        response = given(spec).body(body).when().post("/{first}/{second}");
        studentUserId = response.jsonPath().getInt("object.userId");
    }

    @Then("user gets the response and do assertion_(US15)")
    public void user_gets_the_response_and_do_assertion_us15() {
        actualData = response.as(CreateStudentResponsePojo.class);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(body.getUsername(), actualData.getObject().getUsername());
        Assert.assertEquals(body.getName(), actualData.getObject().getName());
        Assert.assertEquals(body.getSurname(), actualData.getObject().getSurname());
        Assert.assertEquals(body.getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(body.getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(body.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(body.getGender(), actualData.getObject().getGender());
        Assert.assertEquals(body.getMotherName(), actualData.getObject().getMotherName());
        Assert.assertEquals(body.getFatherName(), actualData.getObject().getFatherName());

        Assert.assertEquals("Student saved Successfully", actualData.getMessage());
        Assert.assertTrue(actualData.getObject().isActive());
    }

    @Then("user sends GET request with userId to check if the student is created successfully_(US15)")
    public void userSendsGETRequestWithUserIdToCheckIfTheStudentIsCreatedSuccessfully_us15() {
        spec.pathParams("first", "students", "second", "getStudentById").queryParam("id", studentUserId);
        response = given(spec).body(body).when().get("/{first}/{second}");

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(studentUserId, actualData.getObject().getUserId());
        Assert.assertEquals(body.getUsername(), actualData.getObject().getUsername());
        Assert.assertEquals(body.getName(), actualData.getObject().getName());
        Assert.assertEquals(body.getSurname(), actualData.getObject().getSurname());
        Assert.assertEquals(body.getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(body.getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(body.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(body.getGender(), actualData.getObject().getGender());
        Assert.assertEquals(body.getMotherName(), actualData.getObject().getMotherName());
        Assert.assertEquals(body.getFatherName(), actualData.getObject().getFatherName());
        Assert.assertTrue(actualData.getObject().isActive());
    }

    @When("user sends the POST request to create student as admin_(US25)")
    public void user_sends_the_post_request_to_create_student_as_admin_us25() {
        spec.pathParams("first", "students", "second", "save");
        response = given(spec).body(body).when().post("/{first}/{second}");
        studentUserId = response.jsonPath().getInt("object.userId");
    }

    @Then("user gets the response and do assertion_(US25)")
    public void user_gets_the_response_and_do_assertion_us25() {
        actualData = response.as(CreateStudentResponsePojo.class);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(body.getUsername(), actualData.getObject().getUsername());
        Assert.assertEquals(body.getName(), actualData.getObject().getName());
        Assert.assertEquals(body.getSurname(), actualData.getObject().getSurname());
        Assert.assertEquals(body.getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(body.getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(body.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(body.getGender(), actualData.getObject().getGender());
        Assert.assertEquals(body.getMotherName(), actualData.getObject().getMotherName());
        Assert.assertEquals(body.getFatherName(), actualData.getObject().getFatherName());

        Assert.assertEquals("Student saved Successfully", actualData.getMessage());
        Assert.assertTrue(actualData.getObject().isActive());
    }

    @Then("user sends GET request with userId to check if the student is created successfully_(US25)")
    public void userSendsGETRequestWithUserIdToCheckIfTheStudentIsCreatedSuccessfully_us25() {
        spec.pathParams("first", "students", "second", "getStudentById").queryParam("id", studentUserId);
        response = given(spec).body(body).when().get("/{first}/{second}");

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(studentUserId, actualData.getObject().getUserId());
        Assert.assertEquals(body.getUsername(), actualData.getObject().getUsername());
        Assert.assertEquals(body.getName(), actualData.getObject().getName());
        Assert.assertEquals(body.getSurname(), actualData.getObject().getSurname());
        Assert.assertEquals(body.getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(body.getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(body.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(body.getGender(), actualData.getObject().getGender());
        Assert.assertEquals(body.getMotherName(), actualData.getObject().getMotherName());
        Assert.assertEquals(body.getFatherName(), actualData.getObject().getFatherName());
        Assert.assertTrue(actualData.getObject().isActive());
    }

    @Then("user do GET request with studentUserID to check if the student is created successfully")
    public void userDoGETRequestWithStudentUserIDToCheckIfTheStudentIsCreatedSuccessfully() {
        spec.pathParams("first", "students", "second", "getStudentById").queryParam("id", studentUserId);
        response = given(spec).when().get("/{first}/{second}");
        Assert.assertEquals(200, response.statusCode());



    }
}

