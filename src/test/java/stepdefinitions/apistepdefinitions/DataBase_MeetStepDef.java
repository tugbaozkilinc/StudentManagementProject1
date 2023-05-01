package stepdefinitions.apistepdefinitions;

import io.cucumber.java.Status;
import io.cucumber.java.en.*;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class DataBase_MeetStepDef {
ResultSet resultSet;

    @Given("Find Meet by ID")
    public void find_meet_by_ıd() throws SQLException {
       Connection connection= DriverManager.getConnection("jdbc:postgresql://209.38.244.227:5432/school_management","select_user","45w5ijfso");
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("Select*From meet WHERE id=2");
        resultSet.next();
    }
    @Then("Validate data")
    public void validate_data() throws SQLException {
        assertEquals("2023-09-05",resultSet.getString("date"));
        assertEquals("11.00",resultSet.getString("stopTime"));
        assertEquals("10.00",resultSet.getString("startTime"));

    }

}
