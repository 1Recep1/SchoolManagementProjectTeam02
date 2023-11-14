package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US09Pojo.US09DeleteLessonPojo;
import pojos.US09Pojo.US09ResponsePojo;
import pojos.US10Pojo.US10LessonProgramDeleteResponsePojo;
import pojos.US10Pojo.US10LessonProgramPostPojo;
import pojos.US10Pojo.US10LessonProgramResponsePojo;

import java.util.ArrayList;
import java.util.List;

import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US10_API_StepDefs {
    US10LessonProgramPostPojo payload;
    Response response;
    US10LessonProgramResponsePojo actualData;
    public static int lessonProgramId;
    US10LessonProgramDeleteResponsePojo expectingData;




    @Given("Editing the URL to create a lesson programIO")
    public void editingTheURLToCreateALessonProgramIO() {
        //https://managementonschools.com/app/lessonPrograms/save
        spec.pathParams("first","lessonPrograms","second","save");

    }

    @And("Preparing the payload for the Lesson ProgramIO")
    public void preparingThePayloadForTheLessonProgramIO() {
        List<Integer> lessonIdList = new ArrayList<>();
        lessonIdList.add(3104);
        payload = new US10LessonProgramPostPojo("TUESDAY",15,lessonIdList,"13:00","15:00");


        /*
        {
  "day": "TUESDAY",
  "educationTermId": 15,
  "lessonIdList": [
    3104
  ],
  "startTime": "13:00",
  "stopTime": "15:00"
}
         */
    }

    @When("Sending a POST request for creating the Lesson ProgramIO")
    public void sendingAPOSTRequestForCreatingTheLessonProgramIO() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(US10LessonProgramResponsePojo.class);
    }

    @And("Verifying the response body for the created lesson programIO")
    public void verifyingTheResponseBodyForTheCreatedLessonProgramIO() {
        assertEquals(payload.getDay(),actualData.getObject().getDay());
        assertEquals(3104,actualData.getObject().getLessonName().get(0).getLessonId());
        assertTrue(actualData.getObject().getStartTime().contains(payload.getStartTime()));
        assertTrue(actualData.getObject().getStopTime().contains(payload.getStopTime()));
        assertTrue(actualData.getObject().getLessonName().get(0).isCompulsory());
        assertEquals(8,actualData.getObject().getLessonName().get(0).getCreditScore());
        lessonProgramId = actualData.getObject().getLessonProgramId();
        System.out.println("lessonProgramId - "+lessonProgramId);
        assertTrue(actualData.getMessage().contains("Created Lesson Program"));
        assertTrue(actualData.getHttpStatus().contains("CREATED"));
    }

    @Given("Editing the URL to delete a created lesson programIO")
    public void editingTheURLToDeleteACreatedLessonProgramIO() {
       // spec.pathParams("first","lessons","second","delete", "third",lessonProgramId);

        spec.pathParams("first", "lessonPrograms", "second", "delete", "third",  lessonProgramId);

    }

    @When("Sending a DELETE request to delete the created Lesson ProgramIO")
    public void sendingADELETERequestToDeleteTheCreatedLessonProgramIO() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        actualData = response.as(US10LessonProgramResponsePojo.class);
    }

    @And("Preparing the expected data for deleteLessonProgramByIdIO")
    public void preparingTheExpectedDataForDeleteLessonProgramByIdIO() {
        expectingData = new US10LessonProgramDeleteResponsePojo("Lesson Program Deleted","OK");
    }
    @Then("Verifying the response body for the deletion of the Lesson ProgramIO")
    public void verifyingTheResponseBodyForTheDeletionOfTheLessonProgramIO() {
        assertEquals(actualData.getMessage(),expectingData.getMessage());
        assertEquals(actualData.getHttpStatus(),expectingData.getHttpStatus());



    }

    @Then("Verifying that the Status Code is {int}-IO")
    public void verifyingThatTheStatusCodeIsIO(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }
}
