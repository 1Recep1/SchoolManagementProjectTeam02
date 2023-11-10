Feature:US_05 Admin Dean'leri gorebilmeli ve silebilmelidir
  Background: Admin Management School sayfasinda login olur
    Given Admin kayitli dean verilerinin ID numaralarini alir ve dean verilerinin oldugunu dogrularMsk

  Scenario: TC_01 Admin, Dean leri görebilmeli ve silebilmeli
    Given Kullanici path params olustururMsk.
    And Kullanici expected data olusturur. "password", "username", "name", "surname", "birthDay", "ssn", "birthPlace", "phoneNumber", "gender"
    And Kullanici request gonderir ve response alirMsk
    And Kullanici dogrulama yaparMsk