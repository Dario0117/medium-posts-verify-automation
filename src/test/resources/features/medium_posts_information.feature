#Author dario0117@gmail.com
Feature: Verify information of medium posts
    As a medium User
    I want to know the date and the time to read of some posts
    To decide if read or not that post

    Scenario: Validate information
        Given the medium home page loaded
        When i search the posts stored in a excel file
        Then the information about each post should be the same
