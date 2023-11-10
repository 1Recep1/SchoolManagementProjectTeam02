package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US09Pojo.US09DeleteLessonPojo;
import pojos.US09Pojo.US09LessonPostPojo;
import pojos.US09Pojo.US09ObjectPojo;
import pojos.US09Pojo.US09ResponsePojo;
import org.testng.Assert;

import java.util.List;

import static baseUrl.ManagementSchoolUrl.spec;
import static baseUrl.ManagementSchoolUrl.viceDeanSetup;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US09_API_StepDefs {
    US09LessonPostPojo payload;
    Response response;
    US09ResponsePojo actualData;
    String lessonName = "Dutch";
    US09ObjectPojo object;
    US09ResponsePojo expectedData;
    US09DeleteLessonPojo expectingData;
    static int lessonId;
    @Given("Vice Dean is on {string}IO")
    public void viceDeanIsOnIO(String arg0) {
        viceDeanSetup();


    }

    @Given("Editing the URL for Creating a LessonIO")
    public void editingTheURLForCreatingALessonIO() {
        //https://managementonschools.com/app/lessons/save
        spec.pathParams("first","lessons","second","save");
    }

    @And("Preparing the payload for Creating a LessonIO")
    public void preparingThePayloadForCreatingALessonIO() {
        payload = new US09LessonPostPojo(true,8,lessonName);


    }

    @When("Sending a POST Request for Creating a Lesson and Receiving a ResponseIO")
    public void sendingAPOSTRequestForCreatingALessonAndReceivingAResponseIO() {
         response = given(spec).body(payload).when().post("{first}/{second}");
         response.prettyPrint();
        actualData = response.as(US09ResponsePojo.class);
    }

    @Then("Verifying that the Status Code is {int}IO")
    public void verifyingThatTheStatusCodeIsIO(int statusCode) {

        assertEquals(statusCode, response.statusCode());
    }

    @And("Verifying the Response Body for Created LessonIO")
    public void verifyingTheResponseBodyForCreatedLessonIO() {
        assertEquals(payload.getLessonName(),actualData.getObject().getLessonName());
        assertEquals(payload.getCreditScore(),actualData.getObject().getCreditScore());
        assertEquals(payload.isCompulsory(),actualData.getObject().isCompulsory());
    }

    @Given("Get ID number of the saved lesson")
    public void getIDNumberOfTheSavedLesson() {
        //https://managementonschools.com/app/lessons/getAll
        spec.pathParams("first","lessons","second","getAll");
       response = given(spec).when().get("{first}/{second}");
        JsonPath json = response.jsonPath();
        List<Object> lessonIDList = json.getList("findAll{it.lessonName=='Dutch'}.lessonId");
       lessonId = (int) lessonIDList.get(0);
        if (!lessonIDList.isEmpty()) {
            lessonId = (int) lessonIDList.get(0);
            System.out.println("Lesson ID: " + lessonId);
        } else {
            System.out.println("Lesson ID not found in the response.");
        }
    }

    @And("Editing the URL for getAllLessonByLessonIdIO")
    public void editingTheURLForGetAllLessonByLessonIdIO() {
        //https://managementonschools.com/app/lessons/getAllLessonByLessonId?lessonId=3053


        spec.pathParams("first","lessons","second","getAllLessonByLessonId","third",lessonId);
       //spec.pathParams("first","lessons","second","getLessonByName","third",lessonName);

       // spec.basePath("/lessons/getAllLessonByLessonId/" + lessonId);
    }

    @And("Preparing the expected data for getLessonByIdIO")
    public void preparingTheExpectedDataForGetLessonByLessonIdIO() {
        object = new US09ObjectPojo(lessonId,"Dutch",8,true);
       expectedData = new US09ResponsePojo(object,"Lesson Created","OK");


    }

    @When("Sending a GET Request to View the Created Lesson and Receiving a ResponseIO")
    public void sendingAGETRequestToViewTheCreatedLessonAndReceivingAResponseIO() {
        response = given(spec).when().get("{first}/{second}/{third}");
        response.prettyPrint();
        actualData = response.as(US09ResponsePojo.class);

    }

    @And("Verifying the Response Body for the Created LessonIO")
    public void verifyingTheResponseBodyForTheCreatedLessonIO() {
        assertEquals(expectedData.getObject().getLessonName(),actualData.getObject().getLessonName());
        assertEquals(expectedData.getObject().getCreditScore(),actualData.getObject().getCreditScore());
        assertEquals(expectedData.getObject().getLessonId(),actualData.getObject().getLessonId());
        assertEquals(expectedData.getObject().isCompulsory(),actualData.getObject().isCompulsory());
      //  assertEquals(expectedData.getMessage(),actualData.getMessage());
     //   assertEquals(expectedData.getHttpStatus(),actualData.getHttpStatus());
    }

    @Given("Editing the URL for delete the created lessonIO")
    public void editingTheURLForDeleteTheCreatedLessonIO() {
        spec.pathParams("first","lessons","second","delete", "third",lessonId);


    }

    @When("Sending a DELETE Request to delete the created lesson and receiving a responseID")
    public void sendingADELETERequestToDeleteTheCreatedLessonAndReceivingAResponseID() {
        response = given(spec).when().delete("{first}/{second}/{third}");
        actualData = response.as(US09ResponsePojo.class);

        
    }

    @And("Preparing the expected data for deleteLessonByIdIO")
    public void preparingTheExpectedDataForDeleteLessonByIdIO() {
        expectingData = new US09DeleteLessonPojo("Lesson Deleted","OK");

    }
    @And("Verifying the response body for the deletion of the lessonIO")
    public void verifyingTheResponseBodyForTheDeletionOfTheLessonIO() {
        assertEquals(expectingData.getMessage(),actualData.getMessage());
        assertEquals(expectingData.getHttpStatus(),actualData.getHttpStatus());

    }



}
