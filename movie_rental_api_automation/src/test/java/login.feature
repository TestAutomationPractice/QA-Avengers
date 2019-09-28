@ignore
Feature: Test login api

  Background:
      * url baseUrl

 Scenario: Verify bases API is up and running
        Given path 'login'
        And request { "username": "admin", "password": "password"}
        When method post
        And status 200

       * def sessionId = response.id









