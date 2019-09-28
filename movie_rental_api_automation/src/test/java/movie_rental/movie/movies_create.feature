Feature: calling another feature file in a loop

Background:
    * url baseUrl
    * def creator = read('movie_create.feature')
    * def movies = read('movies_list.json')
    * print movies
    * def result = call creator movies
    * print result

    Scenario: Check the movies added
        # check movies list
        Given path 'movies'
        When method get
        Then status 200
        And def billie = response




