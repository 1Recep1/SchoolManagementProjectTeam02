@RamazanAPI_US21
Feature: Student Controller

  Scenario: Öğrenci Choose Lesson listesinde; Teacher, Day, Start Time ve Stop Time bilgilerini görebilmeli
    Given Student Choose Lesson icin Url duzenlenirRA
    When Student Choose Lesson icin GET Request gonderilir ve Response alinirRA
    And Student Choose Lesson icin expected data duzenlenirRA
    #Then Status kodun 200 oldugu dogrulanirRA
    And Student Choose Lesson icin gelen Response body dogrulanirRA
