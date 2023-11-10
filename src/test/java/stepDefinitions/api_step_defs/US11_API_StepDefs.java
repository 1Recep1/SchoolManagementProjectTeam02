package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US10Pojo.*;

import java.util.List;

import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.api_step_defs.US10_API_StepDefs.lessonProgramId;

public class US11_API_StepDefs {
    US10LessonProgramObjectPojo object;
    US10LessonProgramLessonNamePojo lessonNameObject;
    US11LessonProgramGetResponsePojo expectedData;
    US10LessonProgramResponsePojo actualData;
    Response response;
    @Given("Editing the URL to view a lesson programIO")
    public void editingTheURLToViewALessonProgramIO() {
        //https://managementonschools.com/app/lessonPrograms/getById/1
        spec.pathParams("first","lessonPrograms","second","getById","third",lessonProgramId);

    }
    @And("Preparing the expected data for getLessonProgramByIdIO")
    public void preparingTheExpectedDataForGetLessonProgramByIdIO() {
        lessonNameObject = new US10LessonProgramLessonNamePojo(3104,"Dutch101",8,true);
        object = new US10LessonProgramObjectPojo(lessonProgramId,"13:00:00","15:00:00", (List<US10LessonProgramLessonNamePojo>) lessonNameObject,"TUESDAY");
        expectedData = new US11LessonProgramGetResponsePojo(lessonProgramId,"13:00:00","15:00:00", (List<LessonNamePojo>) lessonNameObject,null,null,"TUESDAY");



    }

        /*
      {
    "lessonProgramId": 2185,
    "startTime": "13:00:00",
    "stopTime": "15:00:00",
    "lessonName": [
        {
            "lessonId": 3104,
            "lessonName": "Dutch101",
            "creditScore": 8,
            "compulsory": true
        }
    ],
    "teachers": [],
    "students": [],
    "day": "TUESDAY"
}*/


    @When("Sending a GET request to view the lesson program detailsIO")
    public void sendingAGETRequestToViewTheLessonProgramDetailsIO() {
        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.as(US10LessonProgramResponsePojo.class);

    }

    @And("Verifying the response body for the lesson programIO")
    public void verifyingTheResponseBodyForTheLessonProgramIO() {
        assertEquals(expectedData.getLessonProgramId(),actualData.getObject().getLessonProgramId());
        assertEquals(expectedData.getStartTime() ,actualData.getObject().getStartTime());
        assertEquals(expectedData.getStopTime() ,actualData.getObject().getStopTime());
        assertTrue(expectedData.getLessonName().get(0).toString().contains(actualData.getObject().getLessonName().get(0).toString()));
        assertEquals(expectedData.getDay(),actualData.getObject().getDay());
    }


}
