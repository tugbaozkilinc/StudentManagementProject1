package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.*;
import utilities.DBReusableMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.apistepdefinitions.ViceDeanManagementByAdminApi.expectedData;
import static stepdefinitions.apistepdefinitions.ViceDeanManagementByAdminApi.viceDeanUserId;

public class ViceDeanManagementByDeanDB {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @When("user sends the query with the id to the database by dean")
    public void user_sends_the_query_with_the_id_to_the_database_by_dean() {
        connection = DBReusableMethods.connectToDatabase();
        statement = DBReusableMethods.createStatement();
        String sql = "select * from vice_dean where id=" + viceDeanUserId + "";
        try {
            resultSet = statement.executeQuery(sql);
            resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("user verifies the vice dean account can be created by dean")
    public void user_verifies_the_vice_dean_account_can_be_created_by_dean() {
        try {
            assertEquals(viceDeanUserId, resultSet.getInt("id"));
            assertEquals(expectedData.getBirthDay(), resultSet.getString("birth_day"));
            assertEquals(expectedData.getBirthPlace(), resultSet.getString("birth_place"));
            assertEquals(expectedData.getGender(), resultSet.getString("gender"));
            assertEquals(expectedData.getName(), resultSet.getString("name"));
            assertEquals(expectedData.getPhoneNumber(), resultSet.getString("phone_number"));
            assertEquals(expectedData.getSsn(), resultSet.getString("ssn"));
            assertEquals(expectedData.getSurname(), resultSet.getString("surname"));
            assertEquals(expectedData.getUsername(), resultSet.getString("username"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBReusableMethods.closeConnectionAndStatement();
    }

}
