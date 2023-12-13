package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
//import static stepdefinitions.APIStepDefinitions.US17.expectedData;

public class US17_DB_StepDefs {


    Connection connection ;
    Statement statement ;
    ResultSet resultSet ;


    @Then("Student_id ile data kontrol edilir")
    public void student_id_ile_data_kontrol_edilir() throws SQLException {

        connection = DriverManager.getConnection("jdbc:postgresql://164.92.252.42:5432/school_management", "select_user", "43w5ijfso");
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from public.student_info where id = 547;");
        resultSet.next();


        //assertEquals(expectedData.getAbsentee(), resultSet.getInt("absentee"));
        // assertEquals(expectedData.getFinalExam(), resultSet.getDouble("final_exam"));
       // assertEquals(expectedData.getInfoNote(), resultSet.getString("info_note"));
         //assertEquals(expectedData.getMidtermExam(), resultSet.getInt("midterm_exam"));
         //assertEquals(expectedData.getEducationTermId(), resultSet.getInt("education_term_id"));
         //assertEquals(expectedData.getLessonId(), resultSet.getInt("lesson_lesson_id"));



    }


}
