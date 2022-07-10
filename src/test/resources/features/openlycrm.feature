
Feature:Testing Company Structure under Employee menu.

  User Story: As a user, I should be able to use functions on Company Structure under Employee menu.



  Scenario:AC-1 : Verify that "All user types should be able to display company structure."

  Scenario Outline:  Login with different accounts
    Given On the given user login page
    When Users trying to login as "<email>" and "<password>"
    Then verify the URL
    Examples:
      |email                         |password|
      |helpdesk99@cybertekschool.com |UserUser|
      |hr100@cybertekschool.com      |UserUser|
      |marketing99@cybertekschool.com|UserUser|



  Scenario:AC-2 :Verify that "Hr user should be able to add a department from the company structure."
  Given Hr user clicks Employees in the quick menu and sees the Company Structure
  When Hr user  add a department from the company structure.
  And Hr user can type New Hr in the department add box
  Then Hr user should see new department in the company structure schema


    Scenario: AC-3 Verify that "Hr user should be able to select a parent department from the department dropdown."

    Given Hr user clicks Employees in the quick menu and sees the Company Structure
    When Hr user  add a department from the company structure.
    And Hr user click on  top menu search box
    And Hr user  choose your 'Hr' option
    Then Hr user can choose parent menu from department box

  Scenario:AC-4 Verify that 'Hr userr should be able to select a supervisor from "recent", "company" and "search".'

    Given Let hr user click the add a department button from the company structure.
    When Hr user click Select from structure
    And Let hr user supervisor select and click
    And Click the hr user add button
    Then Let hr user validate the view


    Scenario: AC-5 Verify that "Hr user should be able to close add department pop-up at any time before sending."
      Given Let hr user click the add a department button from the company structure.
      When Hr user click the New Department search box
      And Hr user select HR department
      And Hr user close the add department
      Then Verify that add department is closed

      Scenario: AC-6 Verify that "Hr user should be able to add a department from the company structure."

        Given Let hr user click the add a department button from the company structure.
        When Hr user adds department
        And click the new department box and write "New Hr"
        And Hr user can delete department
        Then Hr user should see new department


        Scenario: AC-7 Verify that "Hr user should be able to drag and drop the existing department under another department as a subdepartment."

          Given Hr user should see company structured
          When  Hr user  should be able to add child departments
          And click department name box and write "child"
          And click parent name box and write "HR2"
          Then Hr user displayed child department

          Scenario Outline: AC-8 Verify that " Helpdesk and marketing users can not change company structure."
            Given Helpdesk and marketing users on the login page
            When Users trying to login as "<email>" and "<password>"
            And Users click the Employees button
            Then verify display add department button
            Examples:
              |email                         |password|
              |helpdesk99@cybertekschool.com |UserUser|
              |marketing99@cybertekschool.com|UserUser|
















