package stepDefinitions.api_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US03Pojo.US03ObjectPojo;
import pojos.US03Pojo.US03PostPojo;
import pojos.US03Pojo.US03ResponsePojo;
import utilities.ObjectMapperUtils;

import static baseUrl.ManagementSchoolUrl.spec;
import static io.restassured.RestAssured.given;

public class US03_API {
    US03ObjectPojo us03ObjectPojo;
    US03PostPojo expectedData;
    US03ResponsePojo us03ResponsePojo;

    Response response;
    Faker faker;

    @Given("User sends the post request")
    public void user_sends_the_post_request() {

        //https://managementonschools.com/app/contactMessages/save
        spec.pathParams("first", "contactMessages", "second", "save");

        expectedData = new US03PostPojo(faker.instance().name().firstName() + "@gmail.com", "Hello Java$$$", "John", "Techpro");
        response = given(spec).when().body(expectedData).post("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("User verify the response")
    public void user_verify_the_response() {

        US03ResponsePojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), US03ResponsePojo.class);
        System.out.println("actualData = " + actualData);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(expectedData.getName(), actualData.getObject().getName());
        Assert.assertEquals(expectedData.getEmail(), actualData.getObject().getEmail());
        Assert.assertEquals(expectedData.getMessage(), actualData.getObject().getMessage());
        Assert.assertEquals(expectedData.getSubject(), actualData.getObject().getSubject());
        Assert.assertEquals("Contact Message Created Successfully", actualData.getMessage());
        Assert.assertEquals("CREATED", actualData.getHttpStatus());

    }

    @Given("User sends the post request without name")
    public void user_sends_the_post_request_without_name() {
        spec.pathParams("first", "contactMessages", "second", "save");
        expectedData = new US03PostPojo(Faker.instance().internet().emailAddress(), "Hello Java$$$", "", "Techpro");
        response = given(spec).when().body(expectedData).post("/{first}/{second}");
    }

    @Then("User verify the status code should be 400ER")
    public void user_verify_the_status_code_should_be_400er() {

    }

    @Given("User sends the post request email without .\\(point)")
    public void user_sends_the_post_request_email_without_point() {

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User verify the response without point")
    public void user_verify_the_response_without_point() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User sends the post request email without @")
    public void user_sends_the_post_request_email_without() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User verify the response without @")
    public void user_verify_the_response_without() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User sends the post request without subject")
    public void user_sends_the_post_request_without_subject() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User verify the response without subject")
    public void user_verify_the_response_without_subject() {

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User sends the post request without message")
    public void user_sends_the_post_request_without_message() {

        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User verify the response without message")
    public void user_verify_the_response_without_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
