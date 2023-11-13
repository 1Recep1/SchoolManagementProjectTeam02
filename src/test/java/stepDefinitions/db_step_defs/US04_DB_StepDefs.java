package stepDefinitions.db_step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US04_DB_StepDefs {



        Connection connection;
        Statement statement;
        ResultSet resultSet;




    @Given("Dean sends information")
    public void dean_sends_information() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
            statement = connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM dean WHERE id = 2857");
            resultSet.next();


        }
    @Then("Dean verifies the datas")
    public void dean_verifies_the_datas() throws SQLException {
            String actUsername = resultSet.getString("username");
            String actSsn = resultSet.getString("ssn");
            String actName = resultSet.getString("name");
            String actSurname = resultSet.getString("surname");
            String actBirthPlace = resultSet.getString("birth_place");
            String actBirthDay = resultSet.getString("birth_day");
            String actPhoneNumber = resultSet.getString("phone_number");
            String actGender = resultSet.getString("gender");

            assertEquals("priscila.erdman",actUsername);
            assertEquals("Reynaldo",actName);
            assertEquals("Davis",actSurname);
            assertEquals("1991-03-30",actBirthDay);
            assertEquals("001-77-0228",actSsn);
            assertEquals("Pattiefort",actBirthPlace);
            assertEquals("336-039-7101",actPhoneNumber);
            assertEquals("0",actGender);



        }



}
/*
{
    "object": {
        "userId": 2857,
        "username": "priscila.erdman",
        "name": "Reynaldo",
        "surname": "Davis",
        "birthDay": "1991-03-30",
        "ssn": "001-77-0228",
        "birthPlace": "Pattiefort",
        "phoneNumber": "336-039-7101",
        "gender": "MALE"
    },
    "message": "Dean Saved",
    "httpStatus": "CREATED"
}

 */