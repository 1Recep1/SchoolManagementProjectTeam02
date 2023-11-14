Feature: US_005 Dean adit Vice Dean to the website API
  Background: Dean Management School sayfasinda login olur
    Given Kullanici "Admin" olarak giris yaparMsk

  Scenario: US_005_TC_001 Dean edit Vice Dean to the website API
    Given Put request is prepared to edit Vice DeanMsk
    And Prepares Vice Dean new information to sendMsk
    When Put request is sent to edit Vice DeanMsk
    Then Vice Dean new information is verifiedMsk