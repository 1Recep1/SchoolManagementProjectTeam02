package stepDefinitions.api_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_05_07_08Pojos.US_05PostPojo;
import pojos.US_05_07_08Pojos.US_05ResponsePojo;
import utilities.ConfigReader;

import java.util.List;

import static baseUrl.ManagementSchoolUrl.setup;
import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;

public class Us_05_ApiStepDefs {

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

    @Given ("Admin kayitli dean verilerinin ID numaralarini alir ve dean verilerinin oldugunu dogrularMsk")
    public void kullaniciKayitliDeanVerilerininIDNumaralariniAlirVeDeanVerilerininOldugunuDogrular() {
        spec.pathParams("first", "dean", "second", "getAll");
        Response response = given(spec).when().get("{first}/{second}");

        JsonPath json = response.jsonPath();
        List<Integer> userIdList = json.getList("findAll{it.ssn}.userId");
        //System.out.println("userIdList = " + userIdList);

        Assert.assertTrue(userIdList.size() != 0);

    }
    Faker faker = new Faker();

    private static US_05PostPojo expectedData;
    private static Response response;
    private static String fakerPhoneNumber;

    @Then ("Kullanici path params olustururMsk.")
    public void adminSayfayaGiderMsk() {
        spec.pathParams("first", "dean", "second", "update","third",176);
    }

    @And("MskKullanici expected data olusturur. {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void kullaniciExpectedDataOlusturur(String username, String password, String name, String surname, String birthDay, String ssn, String birthPlace, String gender,String phoneNumber) {
        //fakerPhoneNumber = faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(100, 999) + " " + faker.number().numberBetween(1000, 9999);
        expectedData = new US_05PostPojo(username, password, name, surname, birthDay, ssn, birthPlace, gender, phoneNumber);

    }

    @And("Kullanici request gonderir ve response alirMsk")
    public void kullaniciRequestGonderirVeResponseAlir() {
        response = given(spec).body(expectedData).when().put("{first}/{second}/{third}");
    }

    @Then("Kullanici dogrulama yaparMsk")
    public void kullaniciDogrulamaYapar() {
        US_05ResponsePojo actualData = response.as(US_05ResponsePojo.class);
        System.out.println("actualData = " + actualData);

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(expectedData.getUsername(), actualData.getObject().getUsername());
        Assert.assertEquals(expectedData.getName(), actualData.getObject().getName());
        Assert.assertEquals(expectedData.getSurname(), actualData.getObject().getSurname());
        //Assert.assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        Assert.assertEquals(expectedData.getSsn(), actualData.getObject().getSsn());
        Assert.assertEquals(expectedData.getBirthPlace(), actualData.getObject().getBirthPlace());
        Assert.assertEquals(expectedData.getGender(), actualData.getObject().getGender());
        //Assert.assertEquals(expectedData.getPhoneNumber(), actualData.getObject().getPhoneNumber());

        //Assert.assertEquals("Dean updated Successful", actualData.getMessage());

    }

}
