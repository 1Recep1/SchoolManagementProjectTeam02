package stepDefinitions.uiStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.LessonPage;
import pages.LoginPage;
import pages.ViceDeanPage;
import utilities.Driver;

public class US10_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @And("Vice Dean navigates to the {string} section")
    public void viceDeanNavigatesToTheSection(String arg0) {
    }

    @When("Vice Dean selects the lesson {string} from the dropdown menu")
    public void viceDeanSelectsTheLessonFromTheDropdownMenu(String arg0) {
    }

    @And("Vice Dean selects the day {string} from the dropdown menu")
    public void viceDeanSelectsTheDayFromTheDropdownMenu(String arg0) {
    }

    @And("Vice Dean selects the Education Term {string} from the dropdown menu")
    public void viceDeanSelectsTheEducationTermFromTheDropdownMenu(String arg0) {
    }

    @And("Vice Dean enters the start time {string} of the lesson")
    public void viceDeanEntersTheStartTimeOfTheLesson(String arg0) {
    }

    @And("Vice Dean enters the stop time {string} of the lesson")
    public void viceDeanEntersTheStopTimeOfTheLesson(String arg0) {
    }

    @And("Vice Dean clicks on the {string} button")
    public void viceDeanClicksOnTheButton(String arg0) {
    }

    @And("Vice Dean scrolls down to reach the lesson program list's page numbers")
    public void viceDeanScrollsDownToReachTheLessonProgramListSPageNumbers() {
    }

    @Then("the information of the created lesson program is displayed on the opened page")
    public void theInformationOfTheCreatedLessonProgramIsDisplayedOnTheOpenedPage() {
    }

    @And("Vice Dean verifies if the displayed information matches the created lesson program details")
    public void viceDeanVerifiesIfTheDisplayedInformationMatchesTheCreatedLessonProgramDetails() {
    }

    @Then("the Vice Dean waits for {int} seconds")
    public void theViceDeanWaitsForSeconds(int arg0) {
    }

    @Then("the Vice Dean verifies the visibility of the required fields.")
    public void theViceDeanVerifiesTheVisibilityOfTheRequiredFields() {
    }



    @Then("the Vice Dean verifies the accessibility of the Select Lesson menu in the Add Lesson Program area")
    public void theViceDeanVerifiesTheAccessibilityOfTheSelectLessonMenuInTheAddLessonProgramArea() {
    }

    @Then("the Vice Dean selects the top lesson from the Select Lesson menu in the Add Lesson Program area")
    public void theViceDeanSelectsTheTopLessonFromTheSelectLessonMenuInTheAddLessonProgramArea() {
    }


    @Then("the Vice Dean enters {string} in the Start Time field in the Add Lesson Program area")
    public void theViceDeanEntersInTheStartTimeFieldInTheAddLessonProgramArea(String arg0) {
    }

    @Then("the Vice Dean enters {string} in the Stop Time field in the Add Lesson Program area")
    public void theViceDeanEntersInTheStopTimeFieldInTheAddLessonProgramArea(String arg0) {
    }

    @Then("the Vice Dean clicks on the Submit button")
    public void theViceDeanClicksOnTheSubmitButton() {
    }

    @Then("the Vice Dean verifies the visibility of the message {string}")
    public void theViceDeanVerifiesTheVisibilityOfTheMessage(String arg0) {
    }

    @Then("the Vice Dean captures a screenshot of the error message")
    public void theViceDeanCapturesAScreenshotOfTheErrorMessage() {
    }

    @Then("the Vice Dean selects {string} from the Choose Day menu in the Add Lesson Program area")
    public void theViceDeanSelectsFromTheChooseDayMenuInTheAddLessonProgramArea(String arg0) {
    }

    @Then("the Vice Dean verifies the accessibility of the Choose Education Term menu in the Add Lesson Program area")
    public void theViceDeanVerifiesTheAccessibilityOfTheChooseEducationTermMenuInTheAddLessonProgramArea() {
    }

    @Then("the Vice Dean selects {string} from the Choose Education Term menu in the Add Lesson Program area")
    public void theViceDeanSelectsFromTheChooseEducationTermMenuInTheAddLessonProgramArea(String arg0) {
    }

    @Then("the Vice Dean verifies the accessibility of the Choose Day menu in the Add Lesson Program area")
    public void theViceDeanVerifiesTheAccessibilityOfTheChooseDayMenuInTheAddLessonProgramArea() {
    }


}
