$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Amit/git/MyBddframework/Freecrmbddframework/src/main/java/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "feature description",
  "description": "",
  "id": "feature-description",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Sucessfull login with credentials",
  "description": "",
  "id": "feature-description;sucessfull-login-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    },
    {
      "line": 2,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is allready in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" as username",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is able to login the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "feature-description;sucessfull-login-with-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "feature-description;sucessfull-login-with-credentials;;1"
    },
    {
      "cells": [
        "amitvaidya",
        "Dx87kxkpj3"
      ],
      "line": 14,
      "id": "feature-description;sucessfull-login-with-credentials;;2"
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 15,
      "id": "feature-description;sucessfull-login-with-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Sucessfull login with credentials",
  "description": "",
  "id": "feature-description;sucessfull-login-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTest"
    },
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is allready in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"amitvaidya\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters \"Dx87kxkpj3\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is able to login the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_already_on_loginpage()"
});
formatter.result({
  "duration": 12111134612,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.checkpagetitle()"
});
formatter.result({
  "duration": 86063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "amitvaidya",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enter_username(String)"
});
formatter.result({
  "duration": 121272137,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dx87kxkpj3",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enters_password(String)"
});
formatter.result({
  "duration": 51520538,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.login_and_check()"
});
formatter.result({
  "duration": 9243503728,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Sucessfull login with credentials",
  "description": "",
  "id": "feature-description;sucessfull-login-with-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTest"
    },
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is allready in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"naveenk\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters \"test@123\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is able to login the application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_already_on_loginpage()"
});
formatter.result({
  "duration": 13374184046,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.checkpagetitle()"
});
formatter.result({
  "duration": 47407,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enter_username(String)"
});
formatter.result({
  "duration": 53376355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@123",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enters_password(String)"
});
formatter.result({
  "duration": 48676459,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.login_and_check()"
});
formatter.result({
  "duration": 8344929669,
  "status": "passed"
});
});