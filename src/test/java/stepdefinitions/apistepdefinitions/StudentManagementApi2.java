package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.studentmanagement.CreateStudentBodyPojo;
import pojos.studentmanagement.CreateStudentResponsePojo;

import static baseurl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class StudentManagementApi2 {

    CreateStudentBodyPojo expectedData = new CreateStudentBodyPojo();
    Response response;
    Integer userId;

    @When("user sends POST request and do the assertion for creating student by vice dean")
    public void user_sends_post_request_and_do_the_assertion_for_creating_student_by_vice_dean() {
        spec.pathParams("first", "students", "second", "save");
        response = given(spec).body(expectedData).when().post("/{first}/{second}");

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
        Assert.assertEquals("Student saved Successfully", actualData.getMessage());

        userId = actualData.getObject().getUserId();
    }

    @When("user sends PUT request and do the assertion for updating student by vice dean")
    public void user_sends_put_request_and_do_the_assertion_for_updating_student_by_vice_dean() {
        spec.pathParams("first", "students", "second", "update", "third", userId);
        expectedData.setName("Mahmut");
        response = given(spec).body(expectedData).when().put("/{first}/{second}/{third}");

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
        Assert.assertEquals("Student saved Successfully", actualData.getMessage());

    }

    @When("user sends DELETE request and do the assertion for deleting student by vice dean")
    public void user_sends_delete_request_and_do_the_assertion_for_deleting_student_by_vice_dean() {
        spec.pathParams("first", "students", "second", "delete", "third", userId);
        response = given(spec).body(expectedData).when().delete("/{first}/{second}/{third}");

        CreateStudentResponsePojo actualData = response.as(CreateStudentResponsePojo.class);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals("Student Deleted", actualData.getMessage());

    }

    @When("user sends GET request and do the assertion for getting student by vice dean")
    public void user_sends_get_request_and_do_the_assertion_for_getting_student_by_vice_dean() {
        spec.pathParams("first", "students", "second", "getStudentById").queryParams("id", userId);
        response = given(spec).body(expectedData).when().delete("/{first}/{second}");

        CreateStudentResponsePojo actualData = response.as(CreateStudentResponsePojo.class);
        Assert.assertEquals(404, response.statusCode());
        Assert.assertEquals("Error: User with SSN " + userId + " not found", actualData.getMessage());

    }

}

