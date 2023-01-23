@Smoke
Feature: Testing AppMake

  Scenario Outline: Testing the description field
    Given User open the site
    And User enter a description in the field as "<descr>"
    And User choose a small dimension
    And User selects web and mobile as platforms
    And The application will be an android app
    And User click on basic UI
    And User choose speed and quality as the importance of the project
    And User press the next button
    And Application is intended for the customer
    And User move to the next page
    And User want landing page and about us page as Presentation features
    And User register and login with email
    And The application will have user profile and feedback section
    And User choose manage ads
    And User click on online store
    And The application will have management of tickets
    And User choose simple report
    And User click on email notification
    And User choose payments
    When User enter the email as "<email>"
    And User check the first checkbox
    And User check the second checkbox
    Then User press the send button

    Examples:
      | descr                                                | email|
      | The project is about an application for appointments | andreeaaionesa@gmail.com|

