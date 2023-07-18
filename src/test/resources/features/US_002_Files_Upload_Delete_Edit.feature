Feature: Upload, edit and delete files module functionality

  Agile story: As a user i should be able to upload a file, move or delete any selected file under the
  "Files" module!

  @wip
  Scenario: User can upload a file
    Given user is on TryCloud dashboard
    When user click Files button he should be transferred to files page
    And user click ADD icon
    And user pick upload file button
    Then user should be able to upload file


  Scenario: user can create a new folder
    Given user is on files page
    And user click ADD icon
    And user click New folder button
    And user create a folder "Hello"
    And user submit new folder by pressing ENTER or submit button
    Then new folder with given name created under file module


  Scenario: user can delete any selected item from it`s three dots menu
    Given user is on files page
    And user select an item that need to be deleted "Roman"
    Then file or folder should be successfully deleted

  @wip
  Scenario: User can see the total number of files and folders under the files list table
    Given user is on files page
    When user scroll down the files page
    Then he should be able to see total number of files and folders on the page