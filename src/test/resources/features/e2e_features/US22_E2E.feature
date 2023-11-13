@RamazanE2E
Feature: Admin Admin Ekleyebilmeli

  @UI  #PASSED
  Scenario:TC01 Tum alanlar doldurularak admin ekleme olusturulabilmelidir
    Given Kullanici Management sayfasina giderRA
    Then Kullanici Admin olarak login olurRA
    Given Name, Surname, Birth Place, Cinsiyet, E-mail, Phone Number, Date of Birth, SSN, User Name, Password girilirRA
    Then Submit butonuna tiklaRA
    And Admin olustugu dogrulaRA
    And Sayfayi kapatirRA

    #PASSED
  Scenario: Admin kullanicisi ile Admin hesabi olusturma testi
    Given Admin Save icin URL duzenlenirRA
    And Admin Save icin payload duzenlenirRA
    When Admin Save icn POST Request gonderilir ve Response alinirRA
    Then Status kodun 200 oldugu dogrulanirRA
    And Admin Save icin gelen Response body dogrulanirRA


  Scenario: Kayitli Admin Bilgisini Dogrulama Testi
    Given Database baglantisi kurulurRA
    And Kayitli Admin hesap bilgisini almak icin Qery gonderilirRA
    Then Kayitli Admin bilgisi dogrulanir
    And DAtabase baglantisi kesilirRA

  Scenario: Kayitli Admin hesabi silme testi
    Given Admin Delete icin URL duzenlenirRA
    When Admin Delete icin Delete Request gonderilir ve Response alinirRA
    Then Status kodun 200 oldugu dogrulanirRA
