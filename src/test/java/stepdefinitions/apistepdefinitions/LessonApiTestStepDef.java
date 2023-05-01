package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class LessonApiTestStepDef extends BaseUrl {

    @Given("send get request to get lesson")
    public void send_get_request_to_get_lesson() {

        //Set the url
        //{{baseUrl}}/lessons/getAllLessonByLessonId?lessonId=273
     spec.pathParams("first","lessons","second","getAllLessonByLessonId").queryParam("lessonId",273);


     Response response=given(spec).contentType(ContentType.JSON).get("{first}/{second}");
     response.prettyPrint();

    }

    @Then("validate lesson body")
    public void validate_lesson_body() {


    }


    @When("user send get request and do the assertion for lesson by vicedean")
    public void userSendGetRequestAndDoTheAssertionForLessonByVicedean() {


            // Set API endpoint URL

            spec.pathParams("first","lessons","second","getAll");
            // Send GET request and get response
            Response response =given(spec)
                    .contentType(ContentType.JSON).get("/{first}/{second}");


            // Verify response status code
            int statusCode = response.getStatusCode();
            assert statusCode == 401 : "Expected status code 401 but found " + statusCode;

            // Verify response body
            String responseBody = response.getBody().asString();
            assert responseBody.contains("Unauthorized") : "Expected response body to contain 'Unauthorized' but found " + responseBody;
            assert responseBody.contains("Full authentication is required to access this resource") : "Expected response body to contain 'Full authentication is required to access this resource' but found " + responseBody;



        }
}
