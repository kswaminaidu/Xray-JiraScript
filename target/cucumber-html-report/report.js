$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/google.feature");
formatter.feature({
  "name": "Google search Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@runthis"
    }
  ]
});
formatter.scenario({
  "name": "search scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@runthis"
    }
  ]
});
formatter.step({
  "name": "url of google \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Googlestepdefs.java:16"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "text to search \"swami\"",
  "keyword": "When "
});
formatter.match({
  "location": "Googlestepdefs.java:34"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search",
  "keyword": "When "
});
formatter.match({
  "location": "Googlestepdefs.java:38"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate page title",
  "keyword": "Then "
});
formatter.match({
  "location": "Googlestepdefs.java:42"
});
formatter.result({
  "status": "passed"
});
});