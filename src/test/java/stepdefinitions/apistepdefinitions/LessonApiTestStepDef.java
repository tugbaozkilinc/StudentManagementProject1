package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.lessons.LessonAddPojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;


public class LessonApiTestStepDef extends BaseUrl {

    Response response;
    LessonAddPojo lessonAddPojo;

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


     response.then().statusCode(200).
             body("lessonId[0]",equalTo(lessonAddPojo.getLessonId()),

                     "lessonName[0]", equalTo(lessonAddPojo.getLessonName()),
                     "creditScore[0]",equalTo(lessonAddPojo.getCreditScore()),
                     "compulsory[0]",equalTo(lessonAddPojo.isCompulsory()));
//2.yol

        JsonPath jsonPath=response.jsonPath();

        assertEquals(200,response.getStatusCode());
        assertEquals(lessonAddPojo.getLessonId(),jsonPath.getInt("lessonId[0]"));
        assertEquals(lessonAddPojo.getLessonName(),jsonPath.getString("lessonName[0]"));
        assertEquals(lessonAddPojo.getCreditScore(),jsonPath.getInt("creditScore[0]"));
        assertEquals(lessonAddPojo.isCompulsory(),jsonPath.getBoolean("compulsory[0]"));

        //3.yol





    }


    @When("user send get request and do the assertion for lesson by vicedean")
    public void userSendGetRequestAndDoTheAssertionForLessonByVicedean() {



        }
}

