import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.LessonPage;
import pages.LoginPage;
import pages.StudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US05_StepDef {
    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici {string} sayfasina gider.")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Then("Kullanici logine tiklar")
    public void kullaniciLogineTiklar() {
        loginPage.login.click();
    }

    @And("Username alanina Admin'e ait {string} girer")
    public void usernameAlaninaAdminEAitGirer(String adminUsername) {
        loginPage.username.sendKeys(ConfigReader.getProperty("adminUsername"));
    }

    @And("Password alanina Admin'e ait {string} girer ve logine tiklar")
    public void passwordAlaninaAdminEAitGirerVeLogineTiklar(String adminPassword) {
        loginPage.password.sendKeys(ConfigReader.getProperty("adminPassword"));
        ReusableMethods.bekle(2);
        loginPage.loginButton.click();
    }

    @And("Kullanici Sayfaya giris yaptigini dogrular")
    public void kullaniciSayfayaGirisYaptiginiDogrular() {
        String expectedData = "Admin Management";
        Assert.assertEquals(expectedData,loginPage.adminManagementDogrulama.getText());
    }

    @And("Kullanici Menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        loginPage.menuButton.click();
    }

    @And("Admin Main Menuden Dean Management'i secer")
    public void adminMainMenudenDeanManagementISecer() {
    }

    @And("Admin Dean Management sayfasina girdigini dogrular")
    public void adminDeanManagementSayfasinaGirdiginiDogrular() {
    }

    @And("Admin Dean List'te Name bilgilerini gorur")
    public void adminDeanListTeNameBilgileriniGorur() {
    }

    @And("Admin Dean List'te Gender bilgilerini gorur")
    public void adminDeanListTeGenderBilgileriniGorur() {
    }

    @And("Admin Dean List'te Phone Number bilgilerini gorur")
    public void adminDeanListTePhoneNumberBilgileriniGorur() {
    }

    @And("Admin Dean List'te Ssn bilgilerini gorur")
    public void adminDeanListTeSsnBilgileriniGorur() {
    }

    @And("Admin Dean List'te User Name bilgilerini gorur")
    public void adminDeanListTeUserNameBilgileriniGorur() {
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
    }

    @And("Admin liste yaninda Sil butonun tiklar")
    public void adminListeYanindaSilButonunTiklar() {
    }

    @And("Admin Listede kayitli Dean'i silebilmeli")
    public void adminListedeKayitliDeanISilebilmeli() {
    }

    @And("Admin Listede kayitli Dean'i silebilmeldigini dogrular")
    public void adminListedeKayitliDeanISilebilmeldiginiDogrular() {
    }

    @And("Admin liste yaninda Edit butonun tiklar")
    public void adminListeYanindaEditButonunTiklar() {
    }

    @And("Admin Listede kayitli Dean'i bilgilerini gunceller")
    public void adminListedeKayitliDeanIBilgileriniGunceller() {
    }

    @And("Admin Sabmit butonuna tiklar")
    public void adminSabmitButonunaTiklar() {
    }

    @And("Admin Dean'in bilgilerinin guncelledigini gorur")
    public void adminDeanInBilgilerininGuncellediginiGorur() {
    }
}
