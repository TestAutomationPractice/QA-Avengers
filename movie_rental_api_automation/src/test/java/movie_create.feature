@ignore
Feature: re-usable feature to create a single Movie

Scenario:

Given url baseUrl
And path 'movie'
And request { name: '#(name)' }
When method post
Then status 200
Then print response
