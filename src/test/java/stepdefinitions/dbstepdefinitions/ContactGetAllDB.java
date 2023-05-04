package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.*;
import utilities.DBReusableMethods;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.apistepdefinitions.ContactGetAllApi.*;

public class ContactGetAllDB {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @When("user sends the query with the email to the database")
    public void user_sends_the_query_with_the_email_to_the_database() {
        connection = DBReusableMethods.connectToDatabase();
        statement = DBReusableMethods.createStatement();
        String sql = "select * from contact_message where email='" + contactGetAllEmail + "'";
        try {
            resultSet = statement.executeQuery(sql);
            resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("user verifies the contact messages can be read by dean")
    public void user_verifies_the_contact_messages_can_be_read_by_dean() {
        try {
            assertEquals(contactGetAllEmail, resultSet.getString("email"));
            assertEquals(contactGetAllMessage, resultSet.getString("message"));
            assertEquals(contactGetAllName, resultSet.getString("name"));
            assertEquals(contactGetAllSubject, resultSet.getString("subject"));
            assertEquals(String.valueOf(contactGetAllDate), resultSet.getString("date"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        DBReusableMethods.closeConnectionAndStatement();
    }

}
