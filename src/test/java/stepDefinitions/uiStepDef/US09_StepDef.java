package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.LessonPage;
import pages.LoginPage;
import pages.StudentPage;
import pages.ViceDeanPage;
import utilities.Driver;

public class US09_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @Given("Vice Dean is on {string}")
    public void viceDeanIsOn(String arg0) {
    }

    @And("Vice Dean clicks on the login button")
    public void viceDeanClicksOnTheLoginButton() {
    }

    @And("Vice Dean enters a valid username {string}")
    public void viceDeanEntersAValidUsername(String arg0) {
    }

    @And("Vice Dean enters a valid password {string}")
    public void viceDeanEntersAValidPassword(String arg0) {
    }

    @And("Vice Dean clicks on the {string} section on the opened page")
    public void viceDeanClicksOnTheSectionOnTheOpenedPage(String arg0) {
    }

    @And("Vice Dean adds a lesson named {string}")
    public void viceDeanAddsALessonNamed(String arg0) {
    }

    @And("Vice Dean specifies if the lesson is compulsory: {string}")
    public void viceDeanSpecifiesIfTheLessonIsCompulsory(String arg0) {
    }

    @And("Vice Dean enters the credit score as {string}")
    public void viceDeanEntersTheCreditScoreAs(String arg0) {
    }

    @And("Vice Dean submits the lesson")
    public void viceDeanSubmitsTheLesson() {
    }

    @And("Vice Dean navigates to the last page")
    public void viceDeanNavigatesToTheLastPage() {
    }

    @Then("The information of the created lesson {string} is displayed")
    public void theInformationOfTheCreatedLessonIsDisplayed(String arg0) {
    }

    @And("Verify if the displayed information matches the created lesson details")
    public void verifyIfTheDisplayedInformationMatchesTheCreatedLessonDetails() {
    }

    @When("Vice Dean scrolls down to reach the page numbers")
    public void viceDeanScrollsDownToReachThePageNumbers() {
    }

    @And("Vice Dean clicks the last page {string} button")
    public void viceDeanClicksTheLastPageButton(String arg0) {
    }

    @And("Vice Dean selects the lesson named {string} to be deleted")
    public void viceDeanSelectsTheLessonNamedToBeDeleted(String arg0) {
    }

    @And("Vice Dean clicks the trash bin icon for the lesson to be deleted")
    public void viceDeanClicksTheTrashBinIconForTheLessonToBeDeleted() {
    }

    @Then("Vice Dean verifies that the lesson {string} has been deleted successfully")
    public void viceDeanVerifiesThatTheLessonHasBeenDeletedSuccessfully(String arg0) {
    }
}
