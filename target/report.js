$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:src/test/resources/Feature/AddCustomer.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "The user is in telecom home page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user click on add custome",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user is filling all the detail",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "address",
        "phno"
      ]
    },
    {
      "cells": [
        "test",
        "exam",
        "kj@gmail.com",
        "thanjavore",
        "123156143"
      ]
    },
    {
      "cells": [
        "testA",
        "examA",
        "Akj@gmail.com",
        "madurai",
        "123156143"
      ]
    },
    {
      "cells": [
        "testB",
        "examB",
        "Bkj@gmail.com",
        "trichy",
        "123156143"
      ]
    },
    {
      "cells": [
        "testC",
        "examC",
        "Ckj@gmail.com",
        "chennai",
        "123156143"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user click on submit button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user should be displayed the customer id",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});