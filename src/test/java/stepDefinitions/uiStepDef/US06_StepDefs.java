package stepDefinitions.uiStepDef;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.DeanPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US06_StepDefs {

    LoginPage loginPage = new LoginPage();
    DeanPage deanPage = new DeanPage();
    Faker faker = new Faker();

    @Given("Kullanici web sitesine gider")
    public void kullaniciWebSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Kullanici kayitli bir Dean hesabi ile giris yapar")
    public void kullaniciKayitliBirDeanHesabiIleGirisYapar() {
        loginPage.login.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("deanUsername"), Keys.TAB,
                                    ConfigReader.getProperty("deanPassword"));
        ReusableMethods.bekle(1);
        loginPage.loginButton.click();
        ReusableMethods.bekle(2);
    }

    @Given("Kullanici Vice Dean Management sayfasinda Name alanina bir isim girer")
    public void kullaniciViceDeanManagementSayfasindaNameAlaninaBirIsimGirer() {
        deanPage.viceDeanName.sendKeys(faker.name().firstName());
    }

    @When("Surname alanina bir soyisim girer")
    public void surnameAlaninaBirSoyisimGirer() {
        deanPage.viceDeanSurname.sendKeys(faker.name().lastName());
    }

    @And("Birth Place alanina dogum yeri girer")
    public void birthPlaceAlaninaDogumYeriGirer() {
        deanPage.viceDeanBirthPlace.sendKeys(faker.lorem().word());
    }

    @When("Gender alaninda {string} cinsiyet secer")
    public void gender_alaninda_cinsiyet_secer(String expectedGender) {
    deanPage.chooseGender(expectedGender);
    }

    @And("Date Of Birth alanini doldurur")
    public void dateOfBirthAlaniniDoldurur() {

    }

    @And("Phone alanina telefon numarasi girer")
    public void phoneAlaninaTelefonNumarasiGirer() {
    }

    @And("Ssn alanina bir Sosyal Guvenlik Numarasi girer")
    public void ssnAlaninaBirSosyalGuvenlikNumarasiGirer() {
    }

    @And("Username alanina bir kullanici adi girer")
    public void usernameAlaninaBirKullaniciAdiGirer() {
    }

    @And("Password alanina bir sifre girer")
    public void passwordAlaninaBirSifreGirer() {
    }

    @And("Submit butonuna tiklar")
    public void submitButonunaTiklar() {
    }

    @And("Vice dean saved mesajinin gorundugunu dogrular")
    public void viceDeanSavedMesajininGorundugunuDogrular() {
    }

    @Then("Sayfayi kapatir")
    public void sayfayiKapatir() {
    }
}
