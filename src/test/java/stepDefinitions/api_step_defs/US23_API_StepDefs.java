package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US06Pojo.US06ObjectPojo;
import pojos.US06Pojo.US06PostPojo;
import pojos.US06Pojo.US06ResponsePojo;
import pojos.US23Pojo.US23ObjectPojo;
import pojos.US23Pojo.US23PostPojo;
import pojos.US23Pojo.US23ResponsePojo;

import java.util.List;

import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US23_API_StepDefs {

    US23PostPojo payload;
    Response response;
    US23ResponsePojo actualData;
    public static US23ObjectPojo object;
    public static US23ResponsePojo expectedData;
    static int userId;
    @And("Vice Dean kayit islemi icin payload duzenlenir\\(Admin)")
    public void viceDeanKayitIslemiIcinPayloadDuzenlenirAdmin() {
        payload = new US23PostPojo("1989-02-16", "Sherman Oaks", "FEMALE", "Elizabeth", "Eli12345", "224-875-9205", "531-42-2352", "Olsen", "WandaVision");
    }

    @When("Vice Dean kayit islemi icin POST Request gonderilir ve Response alinir\\(Admin)")
    public void viceDeanKayitIslemiIcinPOSTRequestGonderilirVeResponseAlinirAdmin() {
        response = given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
        actualData = response.as(US23ResponsePojo.class);
    }

    @And("Vice Dean GetViceDeanById icin beklenen veriler duzenlenir\\(Admin)")
    public void viceDeanGetViceDeanByIdIcinBeklenenVerilerDuzenlenirAdmin() {
        object = new US23ObjectPojo(userId, "WandaVision", "Elizabeth", "Olsen", "1989-02-16", "531-42-2352", "Sherman Oaks", "224-875-9205", "FEMALE");
        expectedData = new US23ResponsePojo(object, "Vice dean successfully found", "OK");
    }

    @And("Vice Dean GetViceDeanById icin URL duzenlenir\\(Admin)")
    public void viceDeanGetViceDeanByIdIcinURLDuzenlenirAdmin() {
        spec.pathParams("first", "vicedean", "second", "getViceDeanById", "third", userId);
    }

    @When("Vice Dean GetViceDeanById icin GET Request gonderilir ve Response alinir\\(Admin)")
    public void viceDeanGetViceDeanByIdIcinGETRequestGonderilirVeResponseAlinirAdmin() {
        response = (Response) given(spec).when().get("{first}/{second}/{third}");
        actualData = response.as(US23ResponsePojo.class);
    }

    @Then("Status kodun {int} oldugu dogrulanir\\(Admin)")
    public void statusKodunOlduguDogrulanirAdmin(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }

    @And("Kayitli Vice Dean hesab bilgisinin ID nosu alinir\\(Admin)")
    public void kayitliViceDeanHesabBilgisininIDNosuAlinirAdmin() {
        spec.pathParams("first", "vicedean", "second", "getAll");
        response = given(spec).when().get("{first}/{second}");

        JsonPath json = response.jsonPath();
        List<Integer> userIdList = json.getList("findAll{it.username=='WandaVision'}.userId");
        userId = userIdList.get(0);
    }

    @And("Vice Dean kayit islemi icin gelen Response body dogrulanir\\(Admin)")
    public void viceDeanKayitIslemiIcinGelenResponseBodyDogrulanirAdmin() {
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }

    @And("Vice Dean GetViceDeanById icin gelen Response body dogrulanir\\(Admin)")
    public void viceDeanGetViceDeanByIdIcinGelenResponseBodyDogrulanirAdmin(){
            assertEquals(object.getUserId(), actualData.getObject().getUserId());
            assertEquals(object.getUsername(), actualData.getObject().getUsername());
            assertEquals(object.getName(), actualData.getObject().getName());
            assertEquals(object.getSurname(), actualData.getObject().getSurname());
            assertEquals(object.getBirthDay(), actualData.getObject().getBirthDay());
            assertEquals(object.getSsn(), actualData.getObject().getSsn());
            assertEquals(object.getBirthPlace(), actualData.getObject().getBirthPlace());
            assertEquals(object.getPhoneNumber(), actualData.getObject().getPhoneNumber());
            assertEquals(object.getGender(), actualData.getObject().getGender());
            assertEquals(expectedData.getMessage(), actualData.getMessage());
            assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());
    }

    @And("Vice Dean Delete icin URL duzenlenir\\(Admin)")
    public void viceDeanDeleteIcinURLDuzenlenirAdmin() {
        spec.pathParams("first", "vicedean", "second", "delete", "third", userId);
    }

    @When("Vice Dean Delete icin DELETE Request gonderilir ve Response alinir\\(Admin)")
    public void viceDeanDeleteIcinDELETERequestGonderilirVeResponseAlinirAdmin() {
        response = given(spec).when().delete("{first}/{second}/{third}");
    }
}
