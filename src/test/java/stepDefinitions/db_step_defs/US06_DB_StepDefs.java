package stepDefinitions.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.api_step_defs.US06_API_StepDefs.object;

public class US06_DB_StepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    @Given("Database baglantisi kurulurRB")
    public void databaseBaglantisiKurulurRB() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @When("Kayitli Vice Dean bilgisini almak icin Query gonderilirRB")
    public void kayitliViceDeanBilgisiniAlmakIcinQueryGonderilirRB() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from vice_dean where username='Mardinli47'");
    }


    @And("Baglanti kesilirRB")
    public void baglantiKesilirRB() throws SQLException {
        statement.close();
        connection.close();
    }

    @Then("Kayitli Vice Dean bilgisi dogrulanirRB")
    public void kayitliViceDeanBilgisiDogrulanirRB() throws SQLException {
        resultSet.next();
        assertEquals(object.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(object.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(0, resultSet.getInt("gender"));
        assertEquals(object.getName(), resultSet.getString("name"));
        assertEquals(object.getSsn(), resultSet.getString("ssn"));
        assertEquals(object.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(object.getSurname(), resultSet.getString("surname"));
        assertEquals(object.getUsername(), resultSet.getString("username"));
    }
}
