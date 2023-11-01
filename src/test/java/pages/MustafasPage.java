package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MustafasPage {
    public MustafasPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US05 Locateler
    public WebElement menuButton;
    @FindBy(xpath = "(//*[@role='button'])[11]")
    public WebElement DeanManagementMenuButton;
    @FindBy(xpath = "//*[@class='table table-striped table-bordered table-hover']")
    public WebElement deanTablo;
    @FindBy(xpath = "//h5")
    public WebElement deanListYazisi;
    @FindBy(xpath = "//*[@type='text']")
    public WebElement ViceDeanName;
    @FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement ViceDeanGender;
    @FindBy(xpath = "//*[@type='date']")
    public WebElement ViceDeanDogumTarihi;
    @FindBy(xpath = "(//*[@type='text'])[5]")
    public WebElement ViceDeanSSNnNo;
    @FindBy(xpath = "(//*[@type='text'])[6]")
    public WebElement ViceDeanUserName;
    @FindBy(xpath = "//*[@type='password']")
    public WebElement ViceDeanPassword;
    @FindBy(xpath = "(//*[@type='button'])[5]")
    public WebElement submitButton;

    //US07_08 Locatler
    @FindBy(xpath = "(//a[@role='button'])[11]")
    public WebElement contactGetAllButton;
    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]")
    public WebElement nameColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]")
    public WebElement emailColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[3]/span[1]")
    public WebElement dateeColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[4]/span[1]")
    public WebElement subjectColumn;
    @FindBy(xpath = "//tbody/tr[1]/td[5]/span[1]")
    public WebElement messageColumn;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsButton;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonNameBox;

    @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement compulsoryButton;

    @FindBy(xpath = "//input[@id='creditScore']")
    public WebElement creditScoreBox;

    @FindBy(xpath = "(//button[@type='button'])[9]")
    public WebElement lessonSubmitButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement lessonCreatedAlert;

    @FindBy(xpath = "//div[text()='Vice dean Saved']")
    public WebElement viceDeanSaved;

    //Diger
    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement lessonProgram;

    @FindBy(xpath = "//*[@class=' css-b62m3t-container']")
    public WebElement selectLesson;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement chooseEducationTerm;

    @FindBy(xpath = "(//tbody//td/span)[13]")
    public WebElement javaScriptDersi;

    @FindBy(xpath = "(//table)[2]")
    public WebElement lessonList;

    @FindBy(xpath = "//*[text()='Lesson List']")
    public WebElement lessonListYazisi;

    @FindBy(xpath = "(//*[@class='fa-solid fa-trash'])[3]")
    public WebElement javaDeleteButton;

    @FindBy(xpath = "(//*[text()='Java'])[1]")
    public WebElement javaYazisi;

    @FindBy(xpath = "//select[@class='mt-5 form-select']")
    public WebElement chooseEducationTermDDMenu;

    @FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDayDDmenu;

    @FindBy(xpath = "//*[@id='startTime']")
    public WebElement startTime;

    @FindBy(xpath = "//*[@id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement createdLessonProgram;

    @FindBy(xpath = "(//*[text()='Required'])[1]")
    public WebElement requiredYazisi;

    @FindBy(xpath = "//*[text()='Teacher Management']")
    public WebElement teacherManagement;

    //Required yazisi
    @FindBy(xpath = "(//*[.='Required'])[1]")
    public WebElement nameRequired;

    @FindBy(xpath = "(//*[.='Required'])[2]")
    public WebElement surnameRequired;

    @FindBy(xpath = "(//*[.='Required'])[3]")
    public WebElement birtPlaceRequired;

    @FindBy(xpath = "(//*[.='Required'])[4]")
    public WebElement emailRequired;

    @FindBy(xpath = "(//*[.='Required'])[5]")
    public WebElement phoneRequired;

    @FindBy(xpath = "(//*[.='Required'])[6]")
    public WebElement dateBirthRequired;

    @FindBy(xpath = "(//*[.='Required'])[7]")
    public WebElement ssnRequired;

    @FindBy(xpath = "(//*[.='Required'])[8]")
    public WebElement userNameRequired;

    @FindBy(xpath = "(//*[.='Required'])[9]")
    public WebElement fatherNameRequired;

    @FindBy(xpath = "(//*[.='Required'])[10]")
    public WebElement motherRequired;

    @FindBy(xpath = "//*[.='Enter your password']")
    public WebElement passwordemassege;

    //Menu Basliklar
    @FindBy(xpath = "//a[text()='Admin Management']")
    public WebElement adminMannagement;

    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanMannagement;

    @FindBy(xpath = "//a[text()='Vice Dean Management']")
    public WebElement viceDeanMannagement;

    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherMannagement;

    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentMannagement;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logOut;

    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement yesButton;

    //Lis bolumu locetleri
    //List baslik
    @FindBy(xpath = "(//tr[1]//th[1])[1]")
    public WebElement nameBaslik;

    @FindBy(xpath = "(//tr[1]//th[2])[1]")
    public WebElement phoneBaslik;

    @FindBy(xpath = "(//tr[1]//th[3])[1]")
    public WebElement ssnBaslik;

    @FindBy(xpath = "(//tr[1]//th[4])[1]")
    public WebElement usernameBaslik;

    //List ilk satir verileri
    @FindBy(xpath = "(//h5)[2]")
    public WebElement list;//List baslik

    @FindBy(xpath = "(//tr//td)[1]")
    public WebElement listNameVeri;//List Name

    @FindBy(xpath = "(//tr//td)[2]")
    public WebElement listPhoneNumberVeri;//List PhoneNumber

    @FindBy(xpath = "(//tr//td)[3]")
    public WebElement listSsnVeri;//List Ssn

    @FindBy(xpath = "(//tr//td)[4]")
    public WebElement listUserNameVeri;//List Name

    //Edit bolumu locatleri
    @FindBy(xpath = "(//tr//td)[5]")//Edit button==> son satirin locati olmali
    public WebElement editButton;

    @FindBy(xpath = "(//select[@id='advisorTeacherId'])[2]")
    public WebElement chooseLessonsEdit;

    @FindBy(xpath = "(//div[@class=' css-19bb58m'])[2]")
    public WebElement LessonSelectEdit;

    @FindBy(xpath = "(//input[@placeholder='Name'])[2]")
    public WebElement nameEdit;

    @FindBy(xpath = "(//input)[16]")
    public WebElement surnameEdit;

    @FindBy(xpath = "(//input)[17]")
    public WebElement birthEdit;

    @FindBy(xpath = "(//input)[18]")
    public WebElement emailEdit;

    @FindBy(xpath = "(//input)[19]")
    public WebElement phoneEdit;

    @FindBy(xpath = "(//input)[20]")
    public WebElement SsnEdit;

    @FindBy(xpath = "(//input)[21]")
    public WebElement advisorEdit;

    @FindBy(xpath = "(//input)[22]")
    public WebElement femaleEdit;

    @FindBy(xpath = "(//input)[23]")
    public WebElement maleEdit;

    @FindBy(xpath = "(//input)[24]")
    public WebElement dateOfBirthEdit;

    @FindBy(xpath = "(//input)[25]")
    public WebElement userNameEdit;

    @FindBy(xpath = "(//input)[26]")
    public WebElement passwordEdit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[10]")
    public WebElement requaredNameEdit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[11]")
    public WebElement requaredSurnameEdit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[12]")
    public WebElement requaredBirthPlaceEdit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[13]")
    public WebElement requaredEmailEdit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[14]")
    public WebElement requaredPhoneEdit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[15]")
    public WebElement requaredSsnEdit;//Minimum 11 character (XXX-XX-XXXX) + Requared yazisi

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[16]")
    public WebElement requaredDateOfBirthEdit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[17]")
    public WebElement requaredUserNameEdit;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[18]")
    public WebElement requaredPasswordEdit;//At least 8 characters + One number + One uppercase character + One lowercase character

    @FindBy(xpath = "(//button)[29]")
    public WebElement bSubmitdEdit;

    //==>Basarili ve basarisiz login mesajlari
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement verifyMessaj;//Please enter valid email /Please enter valid ssn /Please enter valid phone number/Teacher saved successfully


    @FindBy(xpath = "//*[@id='password']")
    public WebElement passsword;

    @FindBy(xpath = "(//button)[3]")
    public WebElement loginButton;//giriş login buttonu

    //Admin Management/Dean Management/Vice Dean Management/Education Term Management/Student Info Management/Choose Lesson Management/ Student Management/Teacher Management yazısını

    @FindBy(xpath = "//h3")
    public WebElement managementVerifyTitle;


    //Sol tarafta acılan  Main Menu basligi
    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement mainMenu;

    //Add Admin/Dean/Vice Dean/Student/Teacher yazisinin
    @FindBy(xpath = "//h5")
    public WebElement addKullaniciYazisi;

    //Choose Advisor alanı
    @FindBy(xpath = "(//select[@id='advisorTeacherId'])[1]")
    public WebElement selectTeacherDdm;

    //Name alanı
    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    //Surname alanı
    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surname;

    //Birth Place alanı
    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlace;

    //Email alanı
    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    //Phone alanı
    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phone;

    //Gender
    @FindBy(xpath = "(//*[@name='gender'])[1]")
    public WebElement female;

    @FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement male;

    //Date Of Birth alanı
    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement birthday;

    //Ssn alanı
    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement ssnmissingmessage;

    //User Name alanı
    @FindBy(css = "#username")
    private WebElement userName;

    //Mother Name alanı
    @FindBy(xpath = "//*[@id='motherName']")
    public WebElement matherName;

    @FindBy(xpath = "//*[@id='fatherName']")
    public WebElement fatherName;

    //Olusturdugun  Studentin oldugu satira gitmek icin listedeki son sayfaya giden tus
    @FindBy(xpath = "//*[.='Last']")
    public WebElement listeSonuButonu;

    @FindBy(xpath = "(//tr)[last()]")
    public WebElement listSonSatir;

    @FindBy(xpath = "//*[@type='checkbox']")
    public WebElement isAdvicerTeacherCheckbox;

}
