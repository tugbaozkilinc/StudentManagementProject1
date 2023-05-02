package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.lessons.LessonAddPojo;
import pojos.lessons.LessonResponsePojo;

import java.lang.reflect.Array;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class LessonApiTestStepDef extends BaseUrl {

    Response response;
    LessonAddPojo lessonAddPojo;
    LessonResponsePojo lessonResponsePojo;
    @Given("send get request to get lesson")
    public void send_get_request_to_get_lesson() {

        //Set the url

     spec.pathParams("first","lessons","second","getAllLessonByLessonId").queryParam("lessonId",273);

//set the expected data
      lessonAddPojo=new LessonAddPojo(273,"Python3207",4,true);


     response=given(spec).contentType(ContentType.JSON).get("{first}/{second}");
     response.prettyPrint();

    }

    @Then("validate lesson body")
    public void validate_lesson_body() {

        //1.yol

        Array[] actualData  =response.as(Array[].class);
     response.then().statusCode(200).body("lessonId",equalTo(actualData));



//                "lessonName",lessonAddPojo.getLessonName(),"creditScore",lessonAddPojo.getCreditScore(),"compulsory",lessonAddPojo.isCompulsory());

    }


    @When("user send get request and do the assertion for lesson by vicedean")
    public void userSendGetRequestAndDoTheAssertionForLessonByVicedean() {

//
//            // Set API endpoint URL
//
//            spec.pathParams("first","lessons","second","getAll");
//            // Send GET request and get response
//            Response response =given(spec)
//                    .contentType(ContentType.JSON).get("/{first}/{second}");
//
//
//            // Verify response status code
//            int statusCode = response.getStatusCode();
//            assert statusCode == 401 : "Expected status code 401 but found " + statusCode;
//
//            // Verify response body
//            String responseBody = response.getBody().asString();
//            assert responseBody.contains("Unauthorized") : "Expected response body to contain 'Unauthorized' but found " + responseBody;
//            assert responseBody.contains("Full authentication is required to access this resource") : "Expected response body to contain 'Full authentication is required to access this resource' but found " + responseBody;
//


        }
}

