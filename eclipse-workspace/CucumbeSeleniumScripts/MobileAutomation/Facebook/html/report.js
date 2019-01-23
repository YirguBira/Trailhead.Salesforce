$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebook.feature");
formatter.feature({
  "name": "Starting Real Device",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Starting Facebook app",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "capabilities are set up",
  "keyword": "Given "
});
formatter.match({
  "location": "SignIntoFacebook.capabilities_are_set_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user starts the Facebook app",
  "keyword": "When "
});
formatter.match({
  "location": "SignIntoFacebook.the_user_starts_the_Facebook_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he should be able to see the app home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignIntoFacebook.he_should_be_able_to_see_the_app_home_page()"
});
formatter.result({
  "status": "passed"
});
});