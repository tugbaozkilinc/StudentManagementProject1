package stepdefinitions.apistepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import pojos.register.RegisterObject;
import pojos.register.RegisterPojo;
import utilities.ReusableApiMethods;

import java.util.Locale;

public class RegisterStepDefinitionsApi {

    Faker faker = new Faker(Locale.US);

    @When("user sends POST request and do the assertion")
    public void user_sends_post_request_and_do_the_assertion() {
        String phoneNumber = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
        RegisterObject objectData = new RegisterObject(
                "1998-05-11",
                "Ankara",
                "MALE",
                "Ali",
                "12345678",
                phoneNumber,
                faker.idNumber().ssnValid(),
                "Veli",
                faker.name().username());

        RegisterPojo expectedData = new RegisterPojo(objectData, "Guest User registered.", "CREATED");
        System.out.println(expectedData);
        ReusableApiMethods.postRequest(expectedData, 200, "Guest User registered.");
    }

}
