package baseurl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static utilities.Authorization.generateToken;

public class BaseUrl {

    protected static RequestSpecification spec;

    public static void setUp() {
        spec = new RequestSpecBuilder()
                .addHeader("Authorization", generateToken())
                .setBaseUri("https://school-management-v1.herokuapp.com")
                .build();
    }

}
