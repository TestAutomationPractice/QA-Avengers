Feature: Login as Admin User


Scenario Outline: Login as Admin User
Given user is already on Movie Rental Portal
When title of login page is React App
And user enters "<username>" and "<password>"
And user clicks on login button
Then user sucessfully logged in as Admin user

Examples: 
    | username | password |
    |admin | password | 
   
 
 