package stepDefinitions.api_step_defs;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Us_07_ApiStepDefs {
    Response response;

    @Given("Mesajlari almak icin Get request hazirligi yapilirMsk")
    public void mesajlari_almak_icin_get_request_hazirligi_yapilirMsk() {
        //https://managementonschools.com/app/contactMessages/getAll?page=0&size=10&sort=date&type=desc

        spec.pathParams("first", "contactMessages", "second", "getAll")
                .queryParam("size", "5000");
        response = given(spec).when().get("{first}/{second}");

    }

    @Then("Verify Body : name={string}, email={string}, subject={string},message={string},date={string}\"")
    public void verify_body_name_email_subject_message_date(String name, String email, String subject, String message, String date) {
        JsonPath json = response.jsonPath();
        String actName = json.getList("content.findAll{it.email=='yusuf123@gmail.com'}.name").get(0).toString();
        String actEmail = json.getList("content.findAll{it.email=='yusuf123@gmail.com'}.email").get(0).toString();
        String actSubject = json.getList("content.findAll{it.email=='yusuf123@gmail.com'}.subject").get(0).toString();
        String actMessage = json.getList("content.findAll{it.email=='yusuf123@gmail.com'}.message").get(0).toString();
        String actDate = json.getList("content.findAll{it.email=='yusuf123@gmail.com'}.date").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(actName, name);
        assertEquals(actEmail, email);
        assertEquals(actSubject, subject);
        assertEquals(actMessage, message);
        assertEquals(actDate, date);

    }
}
