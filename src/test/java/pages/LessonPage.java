package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonPage {
    public LessonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }










    //irem 20-100
















































































    //mustafa 101-180
















































































    //burak 182-240
























































//ramazan 241-270
     @FindBy(xpath = "(//span[text()='Teacher'])[1]")
    public WebElement teacherCheckRA;
     @FindBy(xpath = "(//span[text()='MONDAY'])[1]")
    public WebElement dayCheckRA;
     @FindBy(xpath = "(//span[text()='10:00:00'])[1]")
    public WebElement startTimeCheckRA;
     @FindBy(xpath = "(//span[text()='12:00:00'])[1]")
    public WebElement stopTimeCheckRA;
     @FindBy(xpath = "(//tbody)[1]//tr[1]//td[2]")
    public WebElement birinciDersRA; //dersin isminin locate' i
     @FindBy(xpath = "(//tbody)[1]//tr[2]//td[2]")
    public WebElement ikinciDersRA; //dersin isminin locate' i
    @FindBy (xpath = "(//*[@type='button'])[1]")
    public WebElement menuRa;
    @FindBy (xpath = "(//*[@role='button'])[6]")
    public WebElement chooseLessonRA;
    @FindBy (xpath = "//*[text()='Grades and Announcements']")
    public WebElement gradesandAnnouncementsRA;
     @FindBy (xpath = "(//*[@type='checkbox'])[15]")
    public WebElement notluDersRA;

            ;







}   //finish 271


