@Regression
Feature: validation popup form
  as a functional user
  I want to be able to enter the required data

  @login
  Scenario: successful login procedure
    Given brandon wants to enter the colorlib website
    When he authenticates with username "demo" and password "demo"
    Then Then we verify that you entered the page by reviewing the message "Bootstrap-Admin-Template"

@successStory
  Scenario: Successful Sign in
  Given that Brandon wants to register with Colorlib
  When he has completed the form
  Then he verify the successful entry reviewing the message "Administrator"