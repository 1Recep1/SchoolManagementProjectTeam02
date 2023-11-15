package stepDefinitions.db_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.api_step_defs.US23_API_StepDefs.object;

public class US23_DB_StepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("Database baglantisi kurulur\\(Admin)")
    public void databaseBaglantisiKurulurAdmin() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
    }

    @When("Kayitli Vice Dean bilgisini almak icin Query gonderilir\\(Admin)")
    public void kayitliViceDeanBilgisiniAlmakIcinQueryGonderilirAdmin() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from vice_dean where username='WandaVision'");

    }
    @Then("Kayitli Vice Dean bilgisi dogrulanir\\(Admin)")
    public void kayitliViceDeanBilgisiDogrulanirAdmin() throws SQLException {
        resultSet.next();
        assertEquals(object.getBirthDay(), resultSet.getString("birth_day"));
        assertEquals(object.getBirthPlace(), resultSet.getString("birth_place"));
        assertEquals(1, resultSet.getInt("gender"));
        assertEquals(object.getName(), resultSet.getString("name"));
        assertEquals(object.getSsn(), resultSet.getString("ssn"));
        assertEquals(object.getPhoneNumber(), resultSet.getString("phone_number"));
        assertEquals(object.getSurname(), resultSet.getString("surname"));
        assertEquals(object.getUsername(), resultSet.getString("username"));
    }


    @And("Baglanti kesilir\\(Admin)")
    public void baglantiKesilirAdmin() throws SQLException {
        statement.close();
        connection.close();
    }
}
