package stepdefinitions.apistepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.deanmanagementpojo.DeanNegativeResponsePojo;
import pojos.deanmanagementpojo.DeanObjectPojo;
import pojos.deanmanagementpojo.DeanResponsePojo;

import static baseurl.BaseUrl.spec;
import static io.restassured.RestAssured.given;

public class DeanManagementApi {


    Response response;
    public static Integer deanID;
    DeanObjectPojo expectedData;


    @Given("user sends post request for Dean")
    public void user_sends_post_request_for_dean() {
        setSpecForDeanPost();
        expectedData = new DeanObjectPojo();
        response = given(spec).body(expectedData).when().post("/{first}/{second}");
    }


    @Then("user gets the dean post request response and assert {string} and {string}")
    public void userGetsTheDeanPostRequestResponseAndAssertAnd(String arg0, String arg1) {
        DeanResponsePojo actualData = response.as(DeanResponsePojo.class);
        deanID = actualData.getObject().getUserId();

        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals(expectedData.getName(), actualData.getObject().getName());
        Assert.assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        Assert.assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
        Assert.assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        Assert.assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        Assert.assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(arg0, actualData.getMessage());
        Assert.assertEquals(arg1, actualData.getHttpStatus());
    }


    @Given("user sends a post request {string} the DateOfBirth field")
    public void userSendsAPostRequestTheDateOfBirthField(String arg0) {
        setSpecForDeanPost();
        expectedData = new DeanObjectPojo();
        expectedData.setBirthDay(arg0);
        response = given(spec).body(expectedData).when().post("/{first}/{second}");
    }

    @Then("user gets the dean post request response and assert message {string} DateOfBirth")
    public void userGetsTheDeanPostRequestResponseAndAssertMessageDateOfBirth(String arg0) {
        DeanNegativeResponsePojo deanNegativeResponsePojo = response.as(DeanNegativeResponsePojo.class);
        Assert.assertEquals(400, deanNegativeResponsePojo.getStatusCode());
        Assert.assertEquals(arg0, deanNegativeResponsePojo.getValidations().getBirthDay());
    }


    @Given("user sends a post request {string} the password field")
    public void userSendsAPostRequestThePasswordField(String password) {
        setSpecForDeanPost();
        expectedData = new DeanObjectPojo();
        expectedData.setPassword(password);
        response = given(spec).body(expectedData).when().post("/{first}/{second}");
    }


    @Then("user gets the dean post request response and assert message {string} password")
    public void userGetsTheDeanPostRequestResponseAndAssertMessagePassword(String message) {
        DeanNegativeResponsePojo negativeResponsePojo = response.as(DeanNegativeResponsePojo.class);
        Assert.assertEquals(400, negativeResponsePojo.getStatusCode());
        Assert.assertEquals(message, negativeResponsePojo.getValidations().getPassword());
    }


    @Given("user sends a post request {string} the phone field")
    public void userSendsAPostRequestThePhoneField(String arg0) {
        setSpecForDeanPost();
        expectedData = new DeanObjectPojo();
        expectedData.setPhoneNumber(arg0);
        response = given(spec).body(expectedData).when().post("/{first}/{second}");
    }

    @Then("user gets the dean post request response and assert message {string}  or {string} SSN")
    public void userGetsTheDeanPostRequestResponseAndAssertMessageOrSSN(String arg0, String arg1) {
        DeanNegativeResponsePojo negativeResponsePojo = response.as(DeanNegativeResponsePojo.class);
        Assert.assertEquals(400, negativeResponsePojo.getStatusCode());
        if (arg0.equals(negativeResponsePojo.getValidations().getPhoneNumber())||arg1.equals(negativeResponsePojo.getValidations().getPhoneNumber())){
            assert true;
        }else {
            throw new RuntimeException("Phone Field Alert Message");
        }
    }

    @Given("user sends a post request {string} the SSN field")
    public void userSendsAPostRequestTheSSNField(String arg0) {
        setSpecForDeanPost();
        expectedData = new DeanObjectPojo();
        expectedData.setSsn(arg0);
        response = given(spec).body(expectedData).when().post("/{first}/{second}");
    }

    @Then("user gets the dean post request response and assert message {string} SSN")
    public void userGetsTheDeanPostRequestResponseAndAssertMessageSSN(String arg0) {
        DeanNegativeResponsePojo negativeResponsePojo = response.as(DeanNegativeResponsePojo.class);
        Assert.assertEquals(400, negativeResponsePojo.getStatusCode());
        Assert.assertEquals(arg0, negativeResponsePojo.getValidations().getSsn());
    }

    private static void setSpecForDeanPost() {
        spec.pathParams("first", "dean",
                "second", "save");
    }

}
