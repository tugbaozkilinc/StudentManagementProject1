package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;



import static utilities.Authorization.generateToken;

public class BaseUrl {


    public static RequestSpecification spec;

    public static void setUp() {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://school-management-v1.herokuapp.com")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", generateToken())
                .build();
    }

}