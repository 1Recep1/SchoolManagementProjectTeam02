package stepDefinitions.api_step_defs;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;

public class US_05_TC_02_API {
    Response response;
   static int userId;
    @Given("Delete request is prepared to delete DeanMsk")
    public void deleteRequestIsPreparedToDeleteDean() {
        // Set the URL
        spec.pathParams("first","dean","second","delete","third",userId); //https://managementonschools.com/app/dean/delete/2838 swagger daki Dean bolumundeki Delete islemindeki Request url
        given(spec).when().delete("{first}/{second}/{third}");
    }

}
