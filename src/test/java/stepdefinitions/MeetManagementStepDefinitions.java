package stepdefinitions;

import com.github.javafaker.Faker;
import pages.HomePage;
import pages.LoginPage;
import pages.MainMenu;
import pages.MeetManagement;

import java.util.Locale;

public class MeetManagementStepDefinitions {

    HomePage homePage=new HomePage();

    LoginPage loginPage=new LoginPage();

    MainMenu mainMenu=new MainMenu();

    MeetManagement meetManagement =new MeetManagement();

    Faker faker = new Faker(Locale.US);







}
