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







