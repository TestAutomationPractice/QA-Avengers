$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addMovie.feature");
formatter.feature({
  "line": 1,
  "name": "Add a new Movie from Admin User",
  "description": "",
  "id": "add-a-new-movie-from-admin-user",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Add a new Movie from Admin User",
  "description": "",
  "id": "add-a-new-movie-from-admin-user;add-a-new-movie-from-admin-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user has already logged in as Admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "admin user clicks on Add Movie button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003ctitle\u003e\" , \"\u003cdirector\u003e\" , \"\u003cdescription\u003e\" , \"\u003ccategories\u003e\" , \"\u003curl\u003e\" and \"\u003crating\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Save Movie button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "movie is created by admin user",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "add-a-new-movie-from-admin-user;add-a-new-movie-from-admin-user;",
  "rows": [
    {
      "cells": [
        "title",
        "description",
        "categories",
        "url",
        "rating"
      ],
      "line": 12,
      "id": "add-a-new-movie-from-admin-user;add-a-new-movie-from-admin-user;;1"
    },
    {
      "cells": [
        "Avengers",
        "Heroes are made by the path they choose, not the pwer they are graced with",
        "Thriller",
        "www.qaAvengers.com",
        "5"
      ],
      "line": 13,
      "id": "add-a-new-movie-from-admin-user;add-a-new-movie-from-admin-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Add a new Movie from Admin User",
  "description": "",
  "id": "add-a-new-movie-from-admin-user;add-a-new-movie-from-admin-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user has already logged in as Admin user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "admin user clicks on Add Movie button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"Avengers\" , \"\u003cdirector\u003e\" , \"Heroes are made by the path they choose, not the pwer they are graced with\" , \"Thriller\" , \"www.qaAvengers.com\" and \"5\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Save Movie button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "movie is created by admin user",
  "keyword": "Then "
});
formatter.match({
  "location": "addMovie.user_has_already_logged_in_as_Admin_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addMovie.admin_user_clicks_on_Add_Movie_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Avengers",
      "offset": 13
    },
    {
      "val": "\u003cdirector\u003e",
      "offset": 26
    },
    {
      "val": "Heroes are made by the path they choose, not the pwer they are graced with",
      "offset": 41
    },
    {
      "val": "Thriller",
      "offset": 120
    },
    {
      "val": "www.qaAvengers.com",
      "offset": 133
    },
    {
      "val": "5",
      "offset": 158
    }
  ],
  "location": "addMovie.user_enters_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addMovie.user_clicks_on_Save_Movie_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "addMovie.movie_is_created_by_admin_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login as Admin User",
  "description": "",
  "id": "login-as-admin-user",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login as Admin User",
  "description": "",
  "id": "login-as-admin-user;login-as-admin-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Movie Rental Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is React App",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user sucessfully logged in as Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify login result matches is correct",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-as-admin-user;login-as-admin-user;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "login-as-admin-user;login-as-admin-user;;1"
    },
    {
      "cells": [
        "admin",
        "password"
      ],
      "line": 14,
      "id": "login-as-admin-user;login-as-admin-user;;2"
    },
    {
      "cells": [
        "admin2",
        "password2"
      ],
      "line": 15,
      "id": "login-as-admin-user;login-as-admin-user;;3"
    },
    {
      "cells": [
        "admin4",
        "password6"
      ],
      "line": 16,
      "id": "login-as-admin-user;login-as-admin-user;;4"
    },
    {
      "cells": [
        "admin5",
        "password5"
      ],
      "line": 17,
      "id": "login-as-admin-user;login-as-admin-user;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login as Admin User",
  "description": "",
  "id": "login-as-admin-user;login-as-admin-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Movie Rental Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is React App",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"admin\" and \"password\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user sucessfully logged in as Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify login result matches is correct",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.user_is_already_on_Movie_Rental_Portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.title_of_login_page_is_React_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 13
    },
    {
      "val": "password",
      "offset": 25
    }
  ],
  "location": "loginSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.user_successfully_logged_in_as_admin_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Login as Admin User",
  "description": "",
  "id": "login-as-admin-user;login-as-admin-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Movie Rental Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is React App",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"admin2\" and \"password2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user sucessfully logged in as Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify login result matches is correct",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.user_is_already_on_Movie_Rental_Portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.title_of_login_page_is_React_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "admin2",
      "offset": 13
    },
    {
      "val": "password2",
      "offset": 26
    }
  ],
  "location": "loginSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.user_successfully_logged_in_as_admin_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "Login as Admin User",
  "description": "",
  "id": "login-as-admin-user;login-as-admin-user;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Movie Rental Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is React App",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"admin4\" and \"password6\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user sucessfully logged in as Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify login result matches is correct",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.user_is_already_on_Movie_Rental_Portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.title_of_login_page_is_React_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "admin4",
      "offset": 13
    },
    {
      "val": "password6",
      "offset": 26
    }
  ],
  "location": "loginSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.user_successfully_logged_in_as_admin_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 17,
  "name": "Login as Admin User",
  "description": "",
  "id": "login-as-admin-user;login-as-admin-user;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Movie Rental Portal",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is React App",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"admin5\" and \"password5\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user sucessfully logged in as Admin user",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify login result matches is correct",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.user_is_already_on_Movie_Rental_Portal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.title_of_login_page_is_React_App()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "admin5",
      "offset": 13
    },
    {
      "val": "password5",
      "offset": 26
    }
  ],
  "location": "loginSteps.user_enters_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "loginSteps.user_successfully_logged_in_as_admin_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});