@US10API
Feature: Vice Dean ders programı oluşturabilmelidir.
  (Lesson Program - Add Lesson Program)
  Scenario: Oluşturulan; Lesson Name, Compulsory ve Credit Score görebilmelidir.
  TC001 Positive Scenario (Post) -Create and verify a lesson program
    Given Vice Dean is on "https://managementonschools.com/"IO
    Then Editing the URL to create a lesson programIO
    And Preparing the payload for the Lesson ProgramIO
    When Sending a POST request for creating the Lesson ProgramIO
    Then Verifying that the Status Code is 200-IO
    And Verifying the response body for the created lesson programIO
  Scenario: TC002 Positive Scenario to Verify Deleted Lesson Program (Delete)
    Given Editing the URL to delete a created lesson programIO
    And Preparing the expected data for deleteLessonProgramByIdIO
    When Sending a DELETE request to delete the created Lesson ProgramIO
    Then Verifying that the Status Code is 200-IO
    And Verifying the response body for the deletion of the Lesson ProgramIO













