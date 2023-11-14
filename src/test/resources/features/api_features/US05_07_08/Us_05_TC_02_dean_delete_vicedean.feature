Feature: US_005 Dean delete Vice Dean to the website API
  Background: Dean Management School sayfasinda login olur
    Given Kullanici "Admin" olarak giris yaparMsk

  Scenario: Admin saved Dean information is deleted with API
    Given Delete request is prepared to delete DeanMsk

