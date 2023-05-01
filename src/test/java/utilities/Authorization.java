package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authorization {
    public static void main(String[] args) {
        System.out.println(generateToken());
    }

    public static String generateToken() {

        Map<String, String> body = new HashMap<>();
        body.put("password", ConfigReader.getProperty("adminpassword"));
        body.put("username", ConfigReader.getProperty("admin"));

        String autUrl = "http://164.92.252.42:8080/auth/login";

        Response response = given().contentType(ContentType.JSON).body(body).when().post(autUrl);
        return response.jsonPath().getString("token");
    }

}
