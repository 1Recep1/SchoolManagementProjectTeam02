@US04_Api
Feature:Admin_Dean_Creation

  Scenario: TC01_Admin_Dean
    Given User sends the post requestEr
    Then  User verify the responseEr

  Scenario: TC02_Admin_Dean_Creation_Negative_Name
    When  UserEr sends the post request without name
    Then  UserEr verify the status code should be 400

  Scenario: TC03_Admin_Dean_Creation_Negative_SurName
    When  User sends the post request without Surname
    Then  UserEr verify the status code should be 400

  Scenario: TC04_Admin_Dean_Creation_Negative_BirthPlace
    When  User sends the post request without birthPlace
    Then  UserEr verify the status code should be 400

  Scenario: TC05_Admin_Dean_Creation_Negative_Gender
    When  User sends the post request without Gender
    Then  UserEr verify the status code should be 400

  Scenario: TC06_Admin_Dean_Creation_Negative_Date_Of_Birth
    When  User sends the post request without DateOfBirth
    When  User sends the post request invalid_Birth_Date
    Then  UserEr verify the status code should be 400

  Scenario: TC07_Admin_Dean_Creation_Negative_Phone_Number
    When  User sends the post request without phone number
    When  User sends the post request invalid phone number
    Then  UserEr verify the status code should be 400

  Scenario: TC08_Admin_Dean_Creation_Negative_SSN
    When  User sends the post request without SSN
    When  User sends the post request invalid SSN without -
    When  User sends the post request invalid eleven digits of SSN
    Then  UserEr verify the status code should be 400

  Scenario: TC09_Admin_Dean_Creation_Negative_Username
    When User sends the post request without Username
    Then  UserEr verify the status code should be 400

  Scenario: TC10_Admin_Dean_Creation_Negative_Password
    When  User sends the post request without Password
    When  User sends the post request invalid seven characters of password
    Then  UserEr verify the status code should be 400
