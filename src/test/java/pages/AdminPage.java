package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }










    //Recep 20-50




























  //Ramazan 51-100
    @FindBy (xpath = "(//*[text()='Admin Management'])[2]")
    public WebElement adminManagement;
    @FindBy (xpath = "//*[@placeholder='Name']")
    public WebElement nameAdminRA;
    @FindBy (xpath = "//*[@placeholder='Surname']")
    public WebElement surnamenameAdminRA;
    @FindBy (xpath = "//*[@placeholder='Birth Place']")
    public WebElement birthPlaceAdminRA;
    @FindBy (xpath = "//*[@value='MALE']")
    public WebElement genderAdminRA;
    @FindBy (xpath = "//*[@id='birthDay']")
    public WebElement dateOFBirthAdminRA;
    @FindBy (xpath = "//*[@placeholder='Phone Number']")
    public WebElement phoneAdminRA;
    @FindBy (xpath = "//*[@placeholder='ssn']")
    public WebElement ssnAdminRA;
    @FindBy (xpath = "//*[@placeholder='username']")
    public WebElement userNameAdminRA;
    @FindBy (xpath = "//*[@placeholder='Password']")
    public WebElement passwordAdminRA;
    @FindBy (xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submintAdminRA;
    @FindBy (xpath = "//*[text()='Admin Saved']")
    public WebElement savedAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[1]")
    public WebElement invalidNameAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[2]")
    public WebElement invalidSurNameAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[3]")
    public WebElement invalidBirthPlaceAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement invalidDateOfBirthAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement invaliddPhoneAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[6]")
    public WebElement invalidSSNAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement invalidUsernameAdminRA;
     @FindBy (xpath = "(//*[@class='invalid-feedback'])[8]")
    public WebElement invalidPasswordAdminRA;









    //sumeyye 101-131






























    //Ercan 132-162






























//Mustafa 163-190



























//Korkut 191-240

















































//Ali 241-280







































 //Emine 281-320






































}  //finish 320


