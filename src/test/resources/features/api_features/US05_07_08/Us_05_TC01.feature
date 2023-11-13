Feature:US_05 Admin Dean'leri gorebilmeli ve silebilmelidir
  Background: Admin Management School sayfasinda login olur
    Given Kullanici "Admin" olarak giris yaparMsk


  Scenario: TC_01 Admin, Dean leri görebilmeli ve silebilmeli
    Given Admin kayitli dean verilerinin ID numaralarini alir ve dean verilerinin oldugunu dogrularMsk
    Then Kullanici path params olustururMsk.
    And MskKullanici expected data olusturur. "password", "username", "name", "surname", "birthDay", "ssn", "birthPlace", "gender", "password"
    And Kullanici request gonderir ve response alirMsk
    And Kullanici dogrulama yaparMsk