package stepDefinitions.uiStepDef;

import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.LessonPage;
import pages.LoginPage;
import pages.ViceDeanPage;
import utilities.Driver;

public class US11_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    ViceDeanPage viceDeanPage = new ViceDeanPage();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();
    Select select;
    @And("Vice Dean logs in with a valid username and a valid password")
    public void viceDeanLogsInWithAValidUsernameAndAValidPassword() {
    }

    @And("Vice Dean selects a lesson from the dropdown menu")
    public void viceDeanSelectsALessonFromTheDropdownMenu() {
    }

    @And("Vice Dean selects a day from the dropdown menu")
    public void viceDeanSelectsADayFromTheDropdownMenu() {
    }

    @And("Vice Dean selects the Education Term from the dropdown menu")
    public void viceDeanSelectsTheEducationTermFromTheDropdownMenu() {
    }

    @And("Vice Dean enters the start time of the lesson")
    public void viceDeanEntersTheStartTimeOfTheLesson() {
    }

    @And("Vice Dean enters the stop time of the lesson")
    public void viceDeanEntersTheStopTimeOfTheLesson() {
    }

    @And("Verify if the displayed information matches the created lesson program")
    public void verifyIfTheDisplayedInformationMatchesTheCreatedLessonProgram() {
    }

    @Then("Vice Dean can not {string}")
    public void viceDeanCanNot(String arg0) {
    }
}
