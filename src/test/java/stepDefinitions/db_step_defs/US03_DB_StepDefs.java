package stepDefinitions.db_step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US03_DB_StepDefs {
    Connection connection ;
    Statement statement ;
    ResultSet resultSet ;
    @Given("User sees messages")
    public void user_sees_messages() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from public.contact_message where" +
                "    email = 'dave@gmail.com'");
        resultSet.next();

    }
    @Then("User Validate data by email")
    public void user_validate_data_by_email() throws SQLException {

        assertEquals("2023-11-08",resultSet.getString("date"));
        assertEquals("Hello Java$$$",resultSet.getString("message"));
        assertEquals("Techpro",resultSet.getString("subject"));
        assertEquals("dave@gmail.com",resultSet.getString("email"));
        assertEquals("John",resultSet.getString("name"));

        connection.close();
        statement.close();
        resultSet.close();
    }
}

/*
{
    "object": {
        "name": "John",
        "email": "dave@gmail.com",
        "subject": "Techpro",
        "message": "Hello Java$$$",
        "date": "2023-11-08"
    },
    "message": "Contact Message Created Successfully",
    "httpStatus": "CREATED"
}
*/
