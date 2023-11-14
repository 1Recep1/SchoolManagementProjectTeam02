package stepDefinitions.api_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_05_07_08Pojos.US05DeanPutPojo;
import pojos.US_05_07_08Pojos.US05ResponseEditDeanPojo;
import utilities.ConfigReader;

import static baseUrl.ManagementSchoolUrl.setup;
import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_05_TC_01_API {
    US05DeanPutPojo expectedData;
    Response response;
    US05ResponseEditDeanPojo actualData;

    @Given("Kullanici {string} olarak giris yaparMsk")
    public void olarakGirisYapilir(String user) {
        switch (user){
            case "Admin":
                setup(ConfigReader.getProperty("adminUsername"), ConfigReader.getProperty("adminPassword"));
                System.out.println("Admin yetkisi ile giriş yapıldı.");
                break;
            case "Dean":
                setup(ConfigReader.getProperty("deanUsername"), ConfigReader.getProperty("deanPassword"));
                System.out.println("Dean yetkisi ile giriş yapıldı.");
                break;
            case "Vice Dean":
                setup(ConfigReader.getProperty("viceDeanUsername"), ConfigReader.getProperty("viceDeanPassword"));
                System.out.println("Vice Dean yetkisi ile giriş yapıldı.");
                break;
            default:
                System.out.println("Geçersiz bir yetki ile giriş yapmaya çalıştınız.");
                break;
        }
    }

    @Given("Put request is prepared to edit Vice DeanMsk")
    public void putRequestIsPreparedToEditViceDean() {
        // Set the URL
        spec.pathParams("first","dean","second","update","third","2838");
        //https://managementonschools.com/app/dean/update/2838 swagger daki put methodunda ki request url
    }

    @And("Prepares Vice Dean new information to sendMsk")
    public void preparesViceDeanNewInformationToSend() {
        // Set the expected data
        expectedData=new US05DeanPutPojo("1991-03-30","East Rigoberto","MALE","Jimmie",
                "181-740-8845","018-98-6956","McDermott","annamaria.emard");
    }
/*
{
    "object": {
        "userId": 2838,
        "username": "annamaria.emard",
        "name": "Jimmie",
        "surname": "McDermott",
        "birthDay": "1991-03-30",
        "ssn": "018-98-6956",
        "birthPlace": "East Rigoberto",
        "phoneNumber": "181-740-8845",
        "gender": "MALE"
    },
 */
    @When("Put request is sent to edit Vice DeanMsk")
    public void putRequestIsSentToEditViceDean() {
        // Send the request and get the response
        response=given(spec).body(expectedData).when().put("{first}/{second}/{third}");
        actualData=response.as(US05ResponseEditDeanPojo.class);
    }

    @Then("Vice Dean new information is verifiedMsk")
    public void viceDeanNewInformationIsVerified() {
        // Do assertion
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getName(),actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());

    }
}
