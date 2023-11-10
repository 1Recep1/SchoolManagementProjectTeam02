Feature: US08 Vice Dean Ders Ekleme Testi

  @apiTesti_Us08_positive
  Scenario: Vice Dean basarili bir sekilde ders ekleyebilmeliMsk
    Given Lesson eklemek icin Post request hazirligi yapilirMsk
    And Gonderilecek lesson bilgileri hazirlanirMsk
    When Lesson eklemek icin Post request gonderilirMsk
    Then Lesson bilgileri dogrulanirMsk
