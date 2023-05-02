package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pages.StudentManagement;
import pojos.deanmanagementpojo.DeanObjectPojo;
import pojos.deanmanagementpojo.DeanResponsePojo;
import pojos.meetmanagementpojo.MeetManagementObjectPojo;
import pojos.meetmanagementpojo.MeetManagementStudentPojo;
import pojos.meetmanagementpojo.MeetResponsePojo;


import java.sql.Array;
import java.util.ArrayList;

import static baseurl.BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class MeetManagementStepDefinitionsApi {
    /*

    {
  "date": "2023-05-01",
  "description": "great",
  "startTime": "11:00",
  "stopTime": "13:00",
  "studentIds": [
300
  ]
}
When I post request to the url

Then status code 200

And
Response Body is like ;
    {
    "object": {
        "id": 441,
        "description": "great",
        "date": "2023-05-01",
        "startTime": "11:00",
        "stopTime": "13:00",
        "advisorTeacherId": 76,
        "teacherName": "Team09",
        "teacherSsn": "147-89-5547",
        "students": [
            {
                "id": 300,
                "username": "deneme4321",
                "ssn": "189-75-3468",
                "name": "deneme123",
                "surname": "123",
                "birthDay": "1999-12-12",
                "birthPlace": "adana",
                "phoneNumber": "145-864-5278",
                "gender": "MALE",
                "motherName": "ada",
                "fatherName": "ali",
                "studentNumber": 1282,
                "email": "fdn@xfgh",
                "active": true
            }
        ]
    },
    "message": "Meet Saved Successfully",
    "httpStatus": "CREATED"
}
     */

    Response response;

    @Given("user sends a POST request as teacher_advisor to create a meet")
    public void user_sends_a_post_request_as_teacher_advisor_to_create_a_meet() {
        spec.pathParams("first", "meet", "second", "getMeetById", "third", 8);
        response = given(spec).when().get("/{first}/{second}/{third}");
    }

    @Then("user verifies the result of meet creation as teacher_advisor")
    public void user_verifies_the_result_of_meet_creation_as_teacher_advisor() {
        Assert.assertEquals(200, response.statusCode());
    }


}
