package stepDefinitions.api_step_defs;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.US_05_07_08Pojos.US_08CreateLessonPojo;
import pojos.US_05_07_08Pojos.US_08CreateLessonResponsePojo;

import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Us_08_ApiStepDefs {
    US_08CreateLessonPojo expectedData;
    Response response;
    US_08CreateLessonResponsePojo actualData;

    @Given("Lesson eklemek icin Post request hazirligi yapilirMsk")
    public void lesson_eklemek_icin_post_request_hazirligi_yapilir_msk() {
        // Write code here that turns the phrase above into concrete actions
        spec.pathParams("first","lessons","second","save");
    }

    @Given("Gonderilecek lesson bilgileri hazirlanirMsk")
    public void gonderilecek_lesson_bilgileri_hazirlanir_msk() {
        // Write code here that turns the phrase above into concrete actions
        expectedData = new US_08CreateLessonPojo(true,70,"UmmanDinari");
    }

    @When("Lesson eklemek icin Post request gonderilirMsk")
    public void lesson_eklemek_icin_post_request_gonderilir_msk() {
        // Write code here that turns the phrase above into concrete actions
        //Send the request and get the expected data
        response = given(spec).body(expectedData).post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(US_08CreateLessonResponsePojo.class);
    }

    @Then("Lesson bilgileri dogrulanirMsk")
    public void lesson_bilgileri_dogrulanir_msk() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getLessonName(),actualData.getObject().getLessonName());
        assertEquals(expectedData.getCreditScore(),actualData.getObject().getCreditScore());
        assertEquals(expectedData.isCompulsory(),actualData.getObject().isCompulsory());
    }

}
