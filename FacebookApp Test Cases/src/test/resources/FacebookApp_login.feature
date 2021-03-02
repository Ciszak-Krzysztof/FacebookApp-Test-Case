Feature: Logging into Facebook account using Android Facebook Application

  Scenario: Logging into Facebook Account using correct login details
    Given Facebook application is launched
    And User has Facebook account already registered
    And User is on login page
    When User clicks Log in to different account button
    And User inputs his phone number or email, which was used in account registration into Phone or email form
    And User inputs his account password into Password form
    And User clicks Log in button
    Then User is logged into his Facebook account

  Scenario: Trying to log in into Facebook Account using correct email and wrong password
    Given Facebook application is launched
    And User has Facebook account already registered
    And User is on login page
    When User clicks Log in to different account button
    And User inputs his phone number or email, which was used in account registration into Phone or email form
    And User inputs wrong password into Password form
    And User clicks Log in button
    Then User is not logged into any account. Incorrect Password message should show up.

  Scenario: Trying to log in into Facebook Account using wrong email
    Given Facebook application is launched
    And User is on login page
    When User clicks Log in to different account button
    And User inputs phone of email that is not registered in Facebook into Phone or email form
    And User inputs password into Password form
    And User clicks Log in button
    Then User is not logged into any account. Can't Find Account message should show up.