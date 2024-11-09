Feature: Login Page Feature
  As a registered user
  I want to be able to log in to the OpenCart application
  So that I can purchase items

  Background: 
    Given I am on the login page

  Scenario: Successful login with valid credentials
    When I enter a valid email "testuser@example.com"
    And I enter a valid password "password123"
    And I click on the Login button
    Then I should be redirected to the customer dashboard

  Scenario: Unsuccessful login with invalid credentials
    When I enter an invalid email "invalid@example.com"
    And I enter an invalid password "wrongpassword"
    And I click on the Login button
    Then I should see an I should see "Warning: No match for E-Mail Address and/or Password."

  Scenario: Forgotten password functionality
    When I click on the forgotten password link
    Then I should be redirected to the password recovery page

  Scenario Outline: Login with different credentials
    When I enter an email "<email>"
    And I enter a password "<password>"
    And I click on the Login button
    Then I should see <outcome>

    Examples: 
      | email                | password      | outcome                                                               |
      | testuser@example.com | password123   | redirected to the dashboard                                           |
      | invalid@example.com  | wrongpassword | I should see "Warning: No match for E-Mail Address and/or Password." |
      | testuser@example.com | wrongpassword | I should see "Warning: No match for E-Mail Address and/or Password." |
      | invalid@example.com  | password123   | I should see "Warning: No match for E-Mail Address and/or Password." |
