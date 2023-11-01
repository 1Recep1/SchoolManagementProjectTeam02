package stepDefinitions.uiStepDef;

import org.openqa.selenium.interactions.Actions;
import pages.LessonPage;
import pages.LoginPage;
import pages.StudentPage;
import utilities.Driver;

public class US05_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    StudentPage studentPage = new StudentPage();
    Actions actions = new Actions(Driver.getDriver());


}
