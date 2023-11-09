package stepDefinitions.api_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US04Pojo.US04ObjectPojo;
import pojos.US04Pojo.US04PostPojo;
import pojos.US04Pojo.US04ResponsePojo;
import utilities.ObjectMapperUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static baseUrl.ManagementSchoolUrl.adminSetup;
import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US04_API_StepDefs {
    US04PostPojo expectedData;
    Response response;
    US04ObjectPojo object;
    US04ResponsePojo responseData;
    Faker faker = new Faker();
    String name;
    String surname;
    String birthPlace;
    String birthDay;
    String phoneNumber;
    String ssn;
    String username;
    String password;

    String gender="MALE";
    int fake = Faker.instance().number().numberBetween(1000, 9999);

    @Given("User sends the post requestEr")
    public void user_sends_the_post_request_er() throws ParseException {
        adminSetup();
        //https://managementonschools.com/app/dean/save
        spec.pathParams("first","dean","second","save");

        name = faker.name().firstName();
        surname = faker.name().lastName();
        birthPlace = faker.address().city();
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = inputFormat.parse("1991-03-30");
        birthDay = inputFormat.format(date);

        phoneNumber = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
        ssn = faker.idNumber().ssnValid();
        username = faker.name().username();
        password = faker.internet().password(6,20,true,false,true)+ "1Aa";

        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,password,phoneNumber,ssn,surname,username);

        response = given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();

//        Faker faker = new Faker();
//        String username = faker.name().username();

//        expectedData=new US04PostPojo("1960-05-05","London","MALE","Dave","xyz@#$45A","256-365-2547","236-25-5698","John","+username+");
//        response=given(spec).when().body(expectedData).post("{first}/{second}");
//        response.prettyPrint();
    }
    @Then("User verify the responseEr")
    public void user_verify_the_response_er() {
        responseData=new US04ResponsePojo(object,"Dean Saved","CREATED");
        US04ResponsePojo actualData= ObjectMapperUtils.convertJsonToJava(response.asString(),US04ResponsePojo.class);
        assertEquals(expectedData.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
        assertEquals(expectedData.getGender(),actualData.getObject().getGender());
        assertEquals(expectedData.getName(),actualData.getObject().getName());
        assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
        assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
        assertEquals(expectedData.getSurname(),actualData.getObject().getSurname());
        assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());
        assertEquals(responseData.getMessage(),actualData.getMessage());
        assertEquals(responseData.getHttpStatus(),actualData.getHttpStatus());
    }

    @When("UserEr sends the post request without name")
    public void user_er_sends_the_post_request_without_name() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,null,password,phoneNumber,ssn,surname,username);
    }
    @Then("UserEr verify the status code should be {int}")
    public void usererVerifyTheStatusCodeShouldBe(int statusCode) {
       // Assert.assertEquals(statusCode,response.statusCode());
        //Assert.assertEquals(400,response.statusCode());
    }
    @When("User sends the post request without Surname")
    public void user_sends_the_post_request_without_surname() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,password,phoneNumber,ssn,null,username);
    }

    @When("User sends the post request without birthPlace")
    public void user_sends_the_post_request_without_birth_place() {
        expectedData = new US04PostPojo(birthDay,null,gender,name,password,phoneNumber,ssn,surname,username);
    }

    @When("User sends the post request without Gender")
    public void user_sends_the_post_request_without_gender() {
        expectedData = new US04PostPojo(birthDay,birthPlace,null,name,password,phoneNumber,ssn,surname,username);
    }

    @When("User sends the post request without DateOfBirth")
    public void user_sends_the_post_request_without_date_of_birth() {
        expectedData = new US04PostPojo(null,birthPlace,gender,name,password,phoneNumber,ssn,surname,username);
    }

    @When("User sends the post request invalid_Birth_Date")
    public void user_sends_the_post_request_invalid_birth_date() {
        expectedData = new US04PostPojo("1200-01-01",birthPlace,gender,name,password,phoneNumber,ssn,surname,username);
    }

    @When("User sends the post request without phone number")
    public void user_sends_the_post_request_without_phone_number() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,password,null,ssn,surname,username);
    }

    @When("User sends the post request invalid phone number")
    public void user_sends_the_post_request_invalid_phone_number() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,password,"12-25-"+fake+"",ssn,surname,username);
    }

    @When("User sends the post request without SSN")
    public void user_sends_the_post_request_without_ssn() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,password,phoneNumber,null,surname,username);
    }

    @When("User sends the post request invalid SSN without -")
    public void user_sends_the_post_request_invalid_ssn_without() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,password,phoneNumber,"12525"+fake+"",surname,username);
    }

    @When("User sends the post request invalid eleven digits of SSN")
    public void user_sends_the_post_request_invalid_eleven_digits_of_ssn() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,password,phoneNumber,"4521767"+fake+"",surname,username);
    }

    @When("User sends the post request without Username")
    public void user_sends_the_post_request_without_username() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,password,phoneNumber,ssn,surname,null);
    }

    @When("User sends the post request without Password")
    public void user_sends_the_post_request_without_password() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,null,phoneNumber,ssn,surname,username);
    }

    @When("User sends the post request invalid seven characters of password")
    public void user_sends_the_post_request_invalid_seven_characters_of_password() {
        expectedData = new US04PostPojo(birthDay,birthPlace,gender,name,"25698A2",phoneNumber,ssn,surname,username);
    }


}
