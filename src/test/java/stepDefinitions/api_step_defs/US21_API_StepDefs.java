package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.US21_student_choose_lesson.ResponsePojo;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.ManagementSchoolUrl.*;
import static io.restassured.RestAssured.given;

public class US21_API_StepDefs {
    Response response;
    ResponsePojo expectedData;
    String lessonName;
    String teacherName;
    String startTime;
    String stopTime;
    String day;



    @Given("Student Choose Lesson icin Url duzenlenirRA")
    public void studentChooseLessonIcinUrlDuzenlenirRA() {
        setup(ConfigReader.getProperty("studentUsername"), ConfigReader.getProperty("studentPassword"));
        //https://managementonschools.com/app/lessonPrograms/getAll
        spec.pathParams("first", "lessonPrograms", "second", "getAll");
    }

    @When("Student Choose Lesson icin GET Request gonderilir ve Response alinirRA")
    public void studentChooseLessonIcinGETRequestGonderilirVeResponseAlinirRA() {
        response = given(spec).when().get("{first}/{second}");


        JsonPath json=response.jsonPath();
        lessonName= json.getString("findAll{it.lessonProgramId==1552}.lessonName.lessonName");
        System.out.println("lessonName = " + lessonName);
        teacherName= json.getString("findAll{it.lessonProgramId==1552}.teachers.name");//+" "+json.getString("findAll{it.lessonProgramId==1552}.teachers.surname");
        System.out.println("teacherName = " + teacherName);
        startTime= json.getString("findAll{it.lessonProgramId==1552}.startTime");
        System.out.println("startTime = " + startTime);
        stopTime= json.getString("findAll{it.lessonProgramId==1552}.stopTime");
        System.out.println("stopTime = " + stopTime);
        day= json.getString("findAll{it.lessonProgramId==1552}.day");
        System.out.println("day = " + day);

    }
    @And("Student Choose Lesson icin expected data duzenlenirRA")
    public void studentChooseLessonIcinExpectedDataDuzenlenirRA() {
       // adminSetup();
       // System.out.println(56);
       // spec.pathParams("first", "lessonPrograms", "second", "getById","third",1552);
       // System.out.println(58);
       // response = given(spec).when().get("{first}/{second}/{third}");
       // System.out.println(60);
       // expectedData=response.as(ResponsePojo.class);
       // System.out.println(62);
    }
    @And("Student Choose Lesson icin gelen Response body dogrulanirRA")
    public void studentChooseLessonIcinGelenResponseBodyDogrulanirRA() {
        System.out.println("expectedData = " + expectedData);
        Assert.assertTrue(startTime.contains("13:30:00"));
        Assert.assertTrue(stopTime.contains("17:30:00"));
        Assert.assertTrue(day.contains("THURSDAY"));
        Assert.assertTrue(lessonName.contains("stlc1"));
        Assert.assertTrue(teacherName.contains("Teacher John "));

    }


}