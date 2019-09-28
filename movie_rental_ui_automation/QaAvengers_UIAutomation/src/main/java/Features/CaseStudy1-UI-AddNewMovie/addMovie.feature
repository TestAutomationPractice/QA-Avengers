Feature: Add a new Movie from Admin User


Scenario Outline: Add a new Movie from Admin User
Given user has already logged in as Admin user
When admin user clicks on Add Movie button
And user enters "<title>" , "<director>" , "<description>" , "<categories>" , "<url>" and "<rating>"
And user clicks on Save Movie button
Then movie is created by admin user

Examples: 
    | title | description | categories | url | rating | 
    | Avengers |  Heroes are made by the path they choose, not the pwer they are graced with |Thriller |www.qaAvengers.com |  5 |  
   
 
 