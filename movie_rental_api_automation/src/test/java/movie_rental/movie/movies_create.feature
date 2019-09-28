Feature: calling another feature file in a loop

Background:
    * url baseUrl

    * def creator = read('movie_create.featuree')
    # csv (will be converted to json)
    * def movies = read('movie_list.csv')
    * print movies
    * def result = call creator kittens
    *print result


    # the above could be written in one line as follows
    # * def result = call read('kitten-create.feature') read('kittens.json')

    # * def created = $result[*].response




