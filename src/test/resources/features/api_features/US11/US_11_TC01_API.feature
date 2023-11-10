@US11API
Feature: Vice Dean ders programını görebilmeli ve güncellemeler yapabilmelidir.
  (Lesson Program - Lesson Program List)

  Background: Login - Vice Dean
    Given Vice Dean is on "https://managementonschools.com/"IO

    Scenario:TC001 - Lesson Program Viewing Scenario (Get)
    Given Editing the URL to view a lesson programIO
      And Preparing the expected data for getLessonProgramByIdIO
      When Sending a GET request to view the lesson program detailsIO
      Then Verifying that the Status Code is 200IO
      And Verifying the response body for the lesson programIO

  Scenario: TC002 Positive Scenario to Verify Deleted Lesson Program (Delete)
    Given Editing the URL to delete a created lesson programIO
    And Preparing the expected data for deleteLessonProgramByIdIO
    When Sending a DELETE request to delete the created Lesson ProgramIO
    Then Verifying that the Status Code is 200IO
    And Verifying the response body for the deletion of the Lesson ProgramIO







