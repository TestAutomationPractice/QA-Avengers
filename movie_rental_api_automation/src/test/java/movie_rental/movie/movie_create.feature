@ignore
Feature: re-usable feature to create a single Movie

Background:
* def sessionId = sessionId
* configure headers = { user: '#(sessionId)' }

Scenario:
Given url baseUrl
And path 'movie'
And request {title:"QA_Avengers", description: '#(description)', "image": '#(image)', "director": '#(director)', "rating": '#(rating)',"categories": '#(categories)'}
When method post
Then status 200
Then print response
