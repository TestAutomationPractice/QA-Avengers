Feature: Login as Admin User


Scenario Outline: Login as Admin User
Given user is already on Movie Rental Portal
When title of login page is React App
And user enters "<username>" and "<password>"
And verify login result matches is correct
And user clicks on login button
Then user sucessfully logged in as Admin user


Examples: 
    | username | password |
    |admin | password | 
    |admin2 | password2 | 
    |admin4 | password6 | 
    |admin5 | password5 | 