package stepdefinitions.apistepdefinitions;

import baseurl.BaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.vicedeanmanagement.TeacherActualData;
import pojos.vicedeanmanagement.ViceDeanCreateTeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ViceDeanCreateTeacherStepDefinitions extends BaseUrl {


    Response response;
    ViceDeanCreateTeacher expextedData;
    List<Integer> id = new ArrayList<>();
    
    Faker faker= new Faker(Locale.US);


    @Given("user send to post request")
    public void user_send_to_post_request() {

        spec.pathParams("pr1", "teachers",
                "pr2", "save");
        id.add(1);

        expextedData = new ViceDeanCreateTeacher("2000-10-10",
                "Örenköy",
                "emin" + faker.number().digits(3) + "@gmail.com",
                "MALE", true, id,
                "Mr.",
                "1234_qASDASDa",
                faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4),
                faker.idNumber().ssnValid(),
                "Mr.Okumus",
                faker.name().username());

        response = given(spec).
                when().
                contentType(ContentType.JSON).
                body(expextedData).
                post("/{pr1}/{pr2}");
        response.prettyPrint();


    }

    @Then("validate the response body")
    public void validate_the_response_body() {

        TeacherActualData  actualData = response.as(TeacherActualData.class);
        System.out.println("actualData = " + actualData);
       

        assertEquals(200, response.statusCode());
        assertEquals(expextedData.getUsername(), actualData.getObject().getUsername());
        assertEquals(expextedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expextedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(expextedData.getGender(), actualData.getObject().getGender());
        assertEquals(expextedData.getName(), actualData.getObject().getName());
        assertEquals(expextedData.getEmail(), actualData.getObject().getEmail());
        assertEquals(expextedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(expextedData.getSsn(), actualData.getObject().getSsn());
        assertEquals(expextedData.getSurname(), actualData.getObject().getSurname());
        assertEquals("Teacher saved successfully", actualData.getMessage());
        assertEquals("CREATED", actualData.getHttpStatus());


    }

}
