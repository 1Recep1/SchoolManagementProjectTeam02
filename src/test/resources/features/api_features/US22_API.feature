@RamazanAPI_US22
Feature: Admin Controller

#PASSED
  Scenario: Admin kullanicisi ile Admin hesabi olusturma testi
    Given Admin Save icin URL duzenlenirRA
    And Admin Save icin payload duzenlenirRA
    When Admin Save icn POST Request gonderilir ve Response alinirRA
    Then Status kodun 200 oldugu dogrulanirRA
    And Admin Save icin gelen Response body dogrulanirRA

  Scenario: Kayitli Admin hesabi silme testi
    Given Admin Delete icin URL duzenlenirRA
    When Admin Delete icin Delete Request gonderilir ve Response alinirRA
    Then Status kodun 200 oldugu dogrulanirRA
