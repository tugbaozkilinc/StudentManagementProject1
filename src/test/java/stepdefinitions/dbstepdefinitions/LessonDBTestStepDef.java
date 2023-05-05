package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBReusableMethods;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LessonDBTestStepDef {
    ResultSet resultSet;
    Connection connection;
    Statement statement;
    @Given("findlesson by id")
    public void findlesson_by_id() {

        //SELECT * FROM lesson
        //WHERE lesson_id = 273
      connection= DBReusableMethods.connectToDatabase();
      statement=  DBReusableMethods.createStatement();
//       connection=DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management","select_user","43w5ijfso");
        //  statement= connection.createStatement();
        try {
            resultSet = statement.executeQuery("SELECT * FROM lesson\n" +
                    "WHERE lesson_id = 273");
            resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

     //   System.out.println(resultSet.getInt("lesson_id"));
    //273	4	true	"Python3207"


    }
    @Then("Validate data lesson by id")
    public void validate_data_lesson_by_id(){
try {
    assertEquals(273,resultSet.getInt("lesson_id"));
    assertEquals(4,resultSet.getInt("credit_score"));
    assertTrue(resultSet.getBoolean("is_compulsory"));
    assertEquals("Python3207",resultSet.getString("lesson_name"));
}catch (SQLException e) {
    throw new RuntimeException(e);
}

      DBReusableMethods.closeConnectionAndStatement();

    }

}
