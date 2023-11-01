package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ContactGetAllPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US03_StepDefs {

    ContactGetAllPage contactGetAllPage = new ContactGetAllPage();

    Faker faker = new Faker();

    @Given("User goes to {string}")
    public void userGoesTo(String String) {
        Driver.getDriver().get(String);
    }

    @When("User enters Contact button")
    public void userEntersContactButton() {
        contactGetAllPage.contactButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollDownJs();

    }

    @And("User enters a valid value of {string} in the Your Name text box.")
    public void userEntersAValidValueOfInTheYourNameTextBox(String string) {
        contactGetAllPage.contactYourName.sendKeys(string);
//        String yourName = faker.name().firstName();
//        contactGetAllPage.contactYourName.sendKeys(yourName);
        // ReusableMethods.waitFor(2);
    }

    @And("User enters a valid value of {string} in the Your Mail text box.")
    public void userEntersAValidValueOfInTheYourMailTextBox(String string) {
        //contactGetAllPage.contactYourMail.sendKeys(string);
        String yourEmail = faker.internet().emailAddress();
        contactGetAllPage.contactYourMail.sendKeys(yourEmail);
        ReusableMethods.waitFor(2);

    }

    @And("User enters a valid value of {string} in the Subject text box.")
    public void userEntersAValidValueOfInTheSubjectTextBox(String string) {
        contactGetAllPage.contactSubject.sendKeys(string);
        // ReusableMethods.waitFor(2);
    }

    @And("User enters a valid Message {string} in the Message text box.")
    public void userEntersAValidMessageInTheMessageTextBox(String string) {
        contactGetAllPage.contactMessage.sendKeys(string);
        // ReusableMethods.waitFor(2);
    }

    @And("User clicks the Send Message button")
    public void userClicksTheSendMessageButton() {
      ReusableMethods.clickWithJS(contactGetAllPage.sendMessageButton);
        ReusableMethods.waitFor(2);

    }

    @Then("User verifies that the message has been sent")
    public void userVerifiesThatTheMessageHasBeenSent() {
        System.out.println("Message= " + contactGetAllPage.createdMessage.getText());


    }
    @And("User leaves the Your Name box blank")
    public void userLeavesTheYourNameBoxBlank()  {
        contactGetAllPage.contactYourName.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(2);
    }
    @Then("User confirms that the required message has been received")
    public void userConfirmsThatTheRequiredMessageHasBeenReceived() throws IOException {
        ReusableMethods.getScreenshot("Required text is displayed!");
        //ReusableMethods.waitFor(2);

    }
    @Then("User confirms that the error message has been received")
    public void userConfirmsThatTheErrorMessageHasBeenReceived() {
        Assert.assertTrue(contactGetAllPage.contactErrorMessage.isDisplayed());
        // ReusableMethods.waitFor(2);
    }

    @Then("User confirms that Contact Message Created Successfully")
    public void userConfirmsThatContactMessageCreatedSuccessfully() {
        Assert.assertTrue(contactGetAllPage.createdMessage.isDisplayed());
        //ReusableMethods.waitFor(2);
    }

    @And("User leaves the Subject box blank")
    public void userLeavesTheSubjectBoxBlank() {
        contactGetAllPage.contactSubject.sendKeys(Keys.TAB);
        // ReusableMethods.waitFor(2);
    }

    @And("User leaves the Message box blank")
    public void userLeavesTheMessageBoxBlank() {
        contactGetAllPage.contactMessage.sendKeys(Keys.TAB);
        // ReusableMethods.waitFor(2);
    }

    @Then("User close the page")
    public void userCloseThePage() {
        // Driver.closeDriver();
    }

}