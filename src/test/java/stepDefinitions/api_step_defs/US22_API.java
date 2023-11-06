package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.admin_management.AdminPostPojo;

import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;

public class US22_API {
    AdminPostPojo payload;
    @Given("Admin Save icin URL duzenlenirRA")
    public void adminSaveIcinURLDuzenlenirRA() {
        //https://managementonschools.com/app/admin/save
        spec.pathParams("first","admin", "second","save");}

    @And("Admin Save icin payload duzenlenirRA")
    public void adminSaveIcinPayloadDuzenlenirRA() {
     payload=new AdminPostPojo("1907-11-11,", "Ankara","MALE","Ramazan","Ramazan1.","122-182-3322","222-11-1211","Batch171","RamazanB1");
    }

    @When("Admin Save icn POST Request gonderilir ve Response alinirRA")
    public void adminSaveIcnPOSTRequestGonderilirVeResponseAlinirRA() {
        Response response=given(spec).body(payload).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Status kodun {int} oldugu dogrulanirRA")
    public void statusKodunOlduguDogrulanirRA(int arg0) {
    }

    @And("Admin Save icin gelen Response body dogrulanirRA")
    public void adminSaveIcinGelenResponseBodyDogrulanirRA() {
    }
}
