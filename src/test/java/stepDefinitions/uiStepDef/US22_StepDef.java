package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.AdminPage;
import pages.LessonPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class US22_StepDef {
    LoginPage loginPage = new LoginPage();
    LessonPage lessonPage = new LessonPage();
    AdminPage adminPage=new AdminPage();
    Faker faker=new Faker();
    String name=faker.name().firstName();
    String surName=faker.name().lastName();
    String birthPlace=faker.address().city();
    Date dateofBirth1=faker.date().birthday(16,150);
    SimpleDateFormat format=new SimpleDateFormat("ddMMyyyy");
    String dateofBirth2= format.format(dateofBirth1);

    String phone=faker.number().numberBetween(100,999)+"-"+
                 faker.number().numberBetween(100,999)+"-"+
                 faker.number().numberBetween(1000,9999);
    String ssn=faker.number().numberBetween(100,999)+"-"+
               faker.number().numberBetween(10,99)+"-"+
               faker.number().numberBetween(1000,9999);

    String ssn3v5=faker.number().numberBetween(100,999)+""+
            faker.number().numberBetween(10,99)+""+
            faker.number().numberBetween(1000,9999);
    String userName=faker.name().username();
    String password=faker.internet().password(6,20,true,false,true)+ "1a";
    String password7=faker.internet().password(5,20,true,false,true)+ "1a";
    @Then("Kullanici Admin olarak login olurRA")
    public void kullaniciAdminOlarakLoginOlurRA() {
        loginPage.login.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("adminUsername"), Keys.TAB,
                ConfigReader.getProperty("adminPassword"));
        ReusableMethods.bekle(2);
        loginPage.loginButton.click();
        ReusableMethods.bekle(3);
    }

    @And("Kullanici Menu sekmesine tiklarRA")
    public void kullaniciMenuSekmesineTiklarRA() {
        lessonPage.menuRa.click();
        ReusableMethods.bekle(3);
    }
    @And("Admin Management' e tiklaRA")
    public void adminManagementETiklaRA() {
        adminPage.adminManagement.click();
        ReusableMethods.bekle(2);
    }
    @Given("Name, Surname, Birth Place, Cinsiyet, E-mail, Phone Number, Date of Birth, SSN, User Name, Password girilirRA")
    public void nameSurnameBirthPlaceCinsiyetEMailPhoneNumberDateOfBirthSSNUserNamePasswordGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,userName,Keys.TAB,password);
    }
    @Then("Submit butonuna tiklaRA")
    public void submitButonunaTiklaRA() {
        adminPage.submintAdminRA.click();
    }
    @And("Admin olustugu dogrulaRA") //Admin Saved yazisi gorulur
    public void adminOlustuguDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.savedAdminRA.getText().
                contains("Admin Saved"));
    }
    
    @Given("Name bos birakilir, Surname, Birth Place, Cinsiyet, Phone Number, Date of Birth, SSN, User Name, Password girilirRA")
    public void nameBosBirakilirSurnameBirthPlaceCinsiyetPhoneNumberDateOfBirthSSNUserNamePasswordGirilirRA() {
        adminPage.surnamenameAdminRA.sendKeys(
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,userName,Keys.TAB,password);

    }

    @Given("Surname bos birakilir, Name, Birth Place, Cinsiyet, Phone Number, Date of Birth, SSN, User Name, Password girilirRA")
    public void surnameBosBirakilirNameBirthPlaceCinsiyetPhoneNumberDateOfBirthSSNUserNamePasswordGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB, Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,userName,Keys.TAB,password);
    }

    @Given("Birth Place bos birakilir, Name, Surname, Cinsiyet, Phone Number, Date of Birth, SSN, User Name, Password girilirRA")
    public void birthPlaceBosBirakilirNameSurnameCinsiyetPhoneNumberDateOfBirthSSNUserNamePasswordGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB, Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,userName,Keys.TAB,password);
    }

    @Given("Cinsiyet bos birakilir, Name, Surname, Birth Place, E-mail, Phone Number, Date of Birth, SSN, User Name, Password girilirRA")
    public void cinsiyetBosBirakilirNameSurnameBirthPlaceEMailPhoneNumberDateOfBirthSSNUserNamePasswordGirilirRA() {
        //Gender bos birqkildiginda submit'e tiklandiginda herhangi bir hata mesaji gelmemekte.
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,userName,Keys.TAB,password);

    }

    @Given("Date of Birth bos birakilir, Name, Surname, Birth Place, Cinsiyet, Phone Number, SSN, User Name, Password girilirRA")
    public void dateOfBirthBosBirakilirNameSurnameBirthPlaceCinsiyetPhoneNumberSSNUserNamePasswordGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,userName,Keys.TAB,password);
    }
    @Given("Phone Number bos birakilir, Name, Surname, Birth Place, Cinsiyet, Date of Birth, SSN, User Name, Password girilirRA")
    public void phoneNumberBosBirakilirNameSurnameBirthPlaceCinsiyetDateOfBirthSSNUserNamePasswordGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.ssnAdminRA.sendKeys(ssn,Keys.TAB,userName,Keys.TAB,password);
    }
    @Given("SSN bos birakilir, Name, Surname, Birth Place, Cinsiyet, Phone Number, Date of Birth, SSN, User Name, Password girilirRA")
    public void ssnBosBirakilirNameSurnameBirthPlaceCinsiyetPhoneNumberDateOfBirthSSNUserNamePasswordGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,Keys.TAB,userName,Keys.TAB,password);
    }
    @Given("SSN 3. ve 5. rakamdan sonra '-' içermeden Name, Surname, Birth Place, Cinsiyet, Date of Birth, Phone Number, User Name, Password girilirRA")
    public void ssnVeRakamdanSonraIçermedenNameSurnameBirthPlaceCinsiyetDateOfBirthPhoneNumberUserNamePasswordGirilirRA(int arg0, int arg1) {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn3v5,Keys.TAB,userName,Keys.TAB,password);
    }
    @Given("SSN 10 haneli girilerek Name, Surname, Birth Place, Cinsiyet, Date of Birth, Phone Number, User Name, Password girilirRA")
    public void ssnHaneliGirilerekNameSurnameBirthPlaceCinsiyetDateOfBirthPhoneNumberUserNamePasswordGirilirRA(int arg0) {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn+1,Keys.TAB,userName,Keys.TAB,password);
    }
    @Given("User Name bos birakilir, Name, Birth Place, Cinsiyet, Phone Number, Date of Birth, SSN, Password girilirRA")
    public void userNameBosBirakilirNameBirthPlaceCinsiyetPhoneNumberDateOfBirthSSNPasswordGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,Keys.TAB,password);
    }
    @Given("Password bos birakilir, Name, Surname, Birth Place, Cinsiyet, Date of Birth, Phone Number, Date of Birth, SSN, User Name girilirRA")
    public void passwordBosBirakilirNameSurnameBirthPlaceCinsiyetDateOfBirthPhoneNumberDateOfBirthSSNUserNameGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,userName);
    }
    @Given("Password 7 haneli girilir Name, Surname, Birth Place, Cinsiyet, Date of Birth, Phone Number, Date of Birth, SSN, User Name girilirRA")
    public void passwordHaneliGirilirNameSurnameBirthPlaceCinsiyetDateOfBirthPhoneNumberDateOfBirthSSNUserNameGirilirRA() {
        adminPage.nameAdminRA.sendKeys(
                name,Keys.TAB,
                surName,Keys.TAB,
                birthPlace,Keys.TAB,Keys.TAB);
        adminPage.genderAdminRA.click();
        adminPage.genderAdminRA.sendKeys(Keys.TAB,dateofBirth2);
        adminPage.phoneAdminRA.sendKeys(phone,Keys.TAB,ssn,Keys.TAB,userName,Keys.TAB,password7);
    }

    @And("Name girilmedigi icin Admin olusmadigini dogrulaRA")
    public void nameGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invalidNameAdminRA.getText().
                contains("Required"));
    }
    @And("Surname girilmedigi icin Admin olusmadigini dogrulaRA")
    public void surnameGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invalidSurNameAdminRA.getText().
                contains("Required"));
    }
    @And("Birth Place girilmedigi icin Admin olusmadigini dogrulaRA")
    public void birthPlaceGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invalidBirthPlaceAdminRA.getText().
                contains("Required"));
    }

    @And("Dogum Tarihi girilmedigi icin Admin olusmadigini dogrulaRA")
    public void dogumTarihiGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invalidDateOfBirthAdminRA.getText().
                contains("Required"));
    }

    @And("Phone Number girilmedigi icin Admin olusmadigini dogrulaRA")
    public void phoneNumberGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invaliddPhoneAdminRA.getText().
                contains("Required"));

    }

    @And("SSN girilmedigi icin Admin olusmadigini dogrulaRA")
    public void ssnGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invalidSSNAdminRA.getText().
                contains("Required"));
    }


    @And("SSN 9 rakamdan cok oldugu icin Admin olusmadigini dogrulaRA")
    public void ssnRakamdanCokOlduguIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.ssnAdminRA.getText().
                contains("Required"));
    }
    @And("SSN 3. ve 5. rakamdan sonra '-' içermedigi icin Admin olusmadigini dogrulaRA")
    public void ssnVeRakamdanSonraIçermedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.ssnAdminRA.getText().
                contains("Required"));
    }

    @And("Username girilmedigi icin Admin olusmadigini dogrulaRA")
    public void usernameGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invalidUsernameAdminRA.getText().
                contains("Required"));
    }

    @And("Password girilmedigi icin Admin olusmadigini dogrulaRA")
    public void passwordGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invalidPasswordAdminRA.getText().
                contains("Required"));
    }

    @And("Password 7 haneli girildigi icin Admin olusmadigini dogrulaRA")
    public void passwordHaneliGirildigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertTrue(adminPage.invalidPasswordAdminRA.getText().
                contains("Required"));
    }

    @And("Cinsiyet girilmedigi icin Admin olusmadigini dogrulaRA")
    public void cinsiyetGirilmedigiIcinAdminOlusmadiginiDogrulaRA() {
        ReusableMethods.bekle(1);
        Assert.assertFalse(adminPage.savedAdminRA.getText().
                contains("Admin Saved"));

    }


}
