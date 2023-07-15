Feature: TryCloud login feature

  Agile story: User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard
  should be displayed. Accounts are: librarian, student, admin
  Background: for all the stories user is inside TryCloud dashboard
    Given user is on TryCloud dashboard

    Scenario: login as a user
      When user enters username
      And user enters password
      And user click sigh in button
      Then user should see dashboard

