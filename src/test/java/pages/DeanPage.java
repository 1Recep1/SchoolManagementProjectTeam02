package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class DeanPage {
    public DeanPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }









    //Recep 20-80
@FindBy(xpath = "//input[@id='name']") public WebElement viceDeanName;
@FindBy(xpath = "//input[@id='surname']") public WebElement viceDeanSurname;
@FindBy(xpath = "//input[@id='birthPlace']") public WebElement viceDeanBirthPlace;
@FindBy(xpath = "//input[@value='FEMALE']") public WebElement viceDeanFemale;
@FindBy(xpath = "//input[@value='MALE']") public WebElement viceDeanMale;
@FindBy(xpath = "//input[@id='birthDay']") public WebElement viceDeanBirthDay;
@FindBy(xpath = "//input[@id='phoneNumber']") public WebElement viceDeanPhone;
@FindBy(xpath = "//input[@id='ssn']") public WebElement viceDeanSsn;
@FindBy(xpath = "//input[@id='username']") public WebElement viceDeanUsername;
@FindBy(xpath = "//input[@id='password']") public WebElement viceDeanPassword;
@FindBy(xpath = "//button[text()='Submit']") public WebElement viceDeanSubmitButton;

public void chooseGender(String expectedGender){
    Assert.assertTrue(viceDeanMale.isDisplayed());
    Assert.assertFalse(viceDeanMale.isSelected());
    Assert.assertTrue(viceDeanFemale.isDisplayed());
    Assert.assertFalse(viceDeanFemale.isSelected());
    if(viceDeanMale.getAttribute("value").equals(expectedGender.toUpperCase())){
        viceDeanMale.click();
        Assert.assertTrue(viceDeanMale.isSelected());
    }else{
        viceDeanFemale.click();
        Assert.assertTrue(viceDeanFemale.isSelected());
    }

}


























































//Mustafa 81-120







































    //Ercan 121-160






































}  //finish

