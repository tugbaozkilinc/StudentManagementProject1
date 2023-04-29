package utilities;

import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.register.RegisterPojo;

import java.util.Locale;

import static io.restassured.RestAssured.given;

public class ReusableApiMethods extends BaseUrl {

    static Faker faker = new Faker(Locale.US);

    public static void postRequest(RegisterPojo expectedData, int statusCode, String message) {
        spec.pathParams("first", "guestUser", "second", "register");
        Response response = given(spec).body(expectedData).contentType(ContentType.JSON).post("/{first}/{second}");
        RegisterPojo actualData = response.as(RegisterPojo.class);

        response.prettyPrint();
        Assert.assertEquals(statusCode, response.statusCode());
        Assert.assertEquals(expectedData.getObject().getUsername(), actualData.getObject().getUsername());
        Assert.assertEquals(expectedData.getObject().getName(), actualData.getObject().getName());
        Assert.assertEquals(expectedData.getObject().getSurname(), actualData.getObject().getSurname());
        //Assert.assertEquals(expectedData.getObject().getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(expectedData.getObject().getSsn(), actualData.getObject().getSsn());
        //Assert.assertEquals(expectedData.getObject().getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(expectedData.getObject().getPhoneNumber(), actualData.getObject().getPhoneNumber());
        Assert.assertEquals(expectedData.getObject().getGender(), actualData.getObject().getGender());
        Assert.assertEquals(message, actualData.getMessage());

    }

}
