@US10API
Feature: Vice Dean ders programı oluşturabilmelidir.
  (Lesson Program - Add Lesson Program)
  Scenario: Oluşturulan; Lesson Name, Compulsory ve Credit Score görebilmelidir.
  TC001 Positive Scenario (Post) -Create and verify a lesson program
    Given Vice Dean is on "https://managementonschools.com/"IO
    Then Editing the URL to create a lesson programIO
    And Preparing the payload for the Lesson ProgramIO
    When Sending a POST request for creating the Lesson ProgramIO
    Then Verifying that the Status Code is 200IO
    And Verifying the response body for the created lesson programIO











