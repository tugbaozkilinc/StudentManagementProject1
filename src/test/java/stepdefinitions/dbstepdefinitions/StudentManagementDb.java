package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.sql.*;
import static stepdefinitions.uistepdefinitions.StudentManagementStepDefinitions.*;
import static utilities.DBReusableMethods.*;

public class StudentManagementDb {
    ResultSet resultSet;

    @When("user sends the query with the student number to the database_US15_US25")
    public void user_sends_the_query_with_the_student_number_to_the_database_us15_us25() throws SQLException {
        connectToDatabase();
        Statement statement = createStatement();
        resultSet = statement.executeQuery("select * from student where student_number =" + lastStudentNumber_US15_US25);
    }

    @Then("user do the assertion_US15_US25")
    public void user_do_the_assertion_us15_us25() {
        try {
            resultSet.next();
            Assert.assertEquals(lastStudentNumber_US15_US25, String.valueOf(resultSet.getInt("student_number")));
            Assert.assertEquals(lastStudentName_US15_US25, resultSet.getString("name") + " " + resultSet.getString("surname"));
            Assert.assertEquals(lastStudentPhoneNumber_US15_US25, resultSet.getString("phone_number"));
            Assert.assertEquals(lastStudentUsername_US15_US25, resultSet.getString("username"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        closeConnectionAndStatement();
    }

}
