Feature: Login as User


Scenario Outline: Login as User
Given user is already on Movie Rental Portal
When title of login page is React App
And user enters "<username>" and "<password>"
And user clicks on login button
Then user sucessfully logged in as user


Examples: 
    |username|password |
    |user|password | 
