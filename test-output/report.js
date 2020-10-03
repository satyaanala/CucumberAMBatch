$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/anala/Desktop/Selenium_Testing/CucumberAMBatch/Features/Hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks in cucumber",
  "description": "",
  "id": "hooks-in-cucumber",
  "keyword": "Feature"
});
formatter.before({
  "duration": 225863,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add new customer",
  "description": "",
  "id": "hooks-in-cucumber;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on add customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user fills the customer details",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "customer is added",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_add_customer_page()"
});
formatter.result({
  "duration": 149990751,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_fills_the_customer_details()"
});
formatter.result({
  "duration": 76854,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.customer_is_added()"
});
formatter.result({
  "duration": 111027,
  "status": "passed"
});
formatter.after({
  "duration": 128092,
  "status": "passed"
});
formatter.before({
  "duration": 193039,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Edit customer",
  "description": "",
  "id": "hooks-in-cucumber;edit-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user is on edit customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user edits contact details",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "contact details updated",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_edit_customer_page()"
});
formatter.result({
  "duration": 124567,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_edits_contact_details()"
});
formatter.result({
  "duration": 131199,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.contact_details_updated()"
});
formatter.result({
  "duration": 61902,
  "status": "passed"
});
formatter.after({
  "duration": 44787,
  "status": "passed"
});
formatter.before({
  "duration": 94149,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Delete customer",
  "description": "",
  "id": "hooks-in-cucumber;delete-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user is on delete customer page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user delete customer",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "customer deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepDefinitions.user_is_on_delete_customer_page()"
});
formatter.result({
  "duration": 87818,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.user_delete_customer()"
});
formatter.result({
  "duration": 56774,
  "status": "passed"
});
formatter.match({
  "location": "HooksStepDefinitions.customer_deleted()"
});
formatter.result({
  "duration": 81677,
  "status": "passed"
});
formatter.after({
  "duration": 72883,
  "status": "passed"
});
});