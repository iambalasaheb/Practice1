Feature: It Contain Testcase of Actitime Login

  Scenario Outline: check actitime login functionality with <flow> user
    Given user is on actitime login page
    When user enters username as <username> in username field
    And user enters password as <password> in password field
    And user click on login button
    Then user should get title as <title>
    And close the browser

    Examples: 
      | flow    | username | password | title                       |
      | valid   | admin    | manager  | actiTIME - Login |
      | invalid | admin    | ""       | actiTime = enter            |
      | invalid | ""       | manager  | actitime - Login            |
