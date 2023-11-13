Feature: US08 Vice Dean Ders Ekleme Testi
  Background: Vice Dean Management School sayfasinda login olur
    Given Kullanici "Vice Dean" olarak giris yaparMsk

  Scenario: Vice Dean basarili bir sekilde ders ekleyebilmeliMsk
    Given Lesson eklemek icin Post request hazirligi yapilirMsk
    And Gonderilecek lesson bilgileri hazirlanirMsk
    When Lesson eklemek icin Post request gonderilirMsk
    Then Lesson bilgileri dogrulanirMsk
