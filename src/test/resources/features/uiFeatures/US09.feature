Feature: Vice Dean ders listesini gorebilmeli ve guncellemeler yapabilmelidir.
  (Lessons - Lesson List)


  Background: Login
    Given Vice Dean is on "https://managementonschools.com/"
    And Vice Dean clicks on the login button
    And Vice Dean enters a valid username "<username>"
    And Vice Dean enters a valid password "<password>"
    And Vice Dean clicks on the login button
    And Vice Dean clicks on the "Lessons" section on the opened page

  Scenario: Scenario: Oluşturulan; Lesson Name, Compulsory ve Credit Score görebilmelidir.

    And Vice Dean adds a lesson named "<lessonName>"
    And Vice Dean specifies if the lesson is compulsory: "<isCompulsory>"
    And Vice Dean enters the credit score as "<creditScore>"
    And Vice Dean submits the lesson
    And Vice Dean navigates to the last page

    Then The information of the created lesson "<lessonName>" is displayed
    And Verify if the displayed information matches the created lesson details

  Scenario: Delete a specific lesson and verify deletion
    When Vice Dean scrolls down to reach the page numbers
    And Vice Dean clicks the last page ">>" button
    And Vice Dean selects the lesson named "<lessonName>" to be deleted
    And Vice Dean clicks the trash bin icon for the lesson to be deleted
    Then Vice Dean verifies that the lesson "<lessonName>" has been deleted successfully