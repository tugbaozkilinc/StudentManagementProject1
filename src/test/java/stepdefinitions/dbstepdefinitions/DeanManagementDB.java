package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import stepdefinitions.apistepdefinitions.DeanManagementApi;
import utilities.DBReusableMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static stepdefinitions.apistepdefinitions.DeanManagementApi.actualData;

public class DeanManagementDB {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @When("user send the query with the user id to the database")
    public void user_send_the_query_with_the_user_id_to_the_database() throws SQLException {
        connection = DBReusableMethods.connectToDatabase();
        statement = DBReusableMethods.createStatement();
        resultSet = statement.executeQuery("select * from public.dean where id = " + DeanManagementApi.deanID + ";");
        resultSet.next();
    }

    @Then("user verifies the dean data")
    public void user_verifies_the_dean_data() throws SQLException {

        Assert.assertEquals(actualData.getObject().getName(),resultSet.getString("name"));
        Assert.assertEquals(actualData.getObject().getBirthDay(),resultSet.getString("birth_day"));
        Assert.assertEquals(actualData.getObject().getBirthPlace(),resultSet.getString("birth_place"));
        Assert.assertEquals(actualData.getObject().getPhoneNumber(),resultSet.getString("phone_number"));
        Assert.assertEquals(actualData.getObject().getSsn(),resultSet.getString("ssn"));
        Assert.assertEquals(actualData.getObject().getUsername(),resultSet.getString("username"));
        Assert.assertEquals(actualData.getObject().getSurname(),resultSet.getString("surname"));
        Assert.assertEquals(Integer.toString(actualData.getObject().getUserId()),resultSet.getString("id"));

        DBReusableMethods.closeConnectionAndStatement();
    }
}

