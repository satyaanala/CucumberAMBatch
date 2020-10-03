Feature: MyAccount-Login Feature
Description: This feature will test a login functionality

#simple login without parameters
#Scenario: Log-in with valid username and password
#Given open browser
#And Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username and password
#And Click on login button
#Then User must successfully login to the web page

#simple login with parameters
#Scenario: Log-in with valid username and password
#Given open browser
#And Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username "pavanoltraining" and password "Test@selenium123"
#And Click on login button
#Then User must successfully login to the web page

#Simple login with Scenario Outline&Example keywords
#Scenario Outline: Log_in with valid username name and password
#Given open browser
#And Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username "<username>" and password "<password>"
#And Click on login button
#Then verify login

#Examples:
#|username          |password             |
#|pavanoltraining   |Test@selen           |
#||pavanoltrai      |Test@selenium123     |
#|pavanoltraining   |Test@selenium        |

#Simple login with DataTable params
#Scenario: Log_in with valid username name and password
#Given open browser
#And Enter the url "http://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username and password
#| pavanoltraining | Test@selenium123  |
#And Click on login button
#Then user must successfully login to the webpage


#Simple login with DataTable params with header
Scenario: Log_in with valid username name and password
Given open browser
And Enter the url "http://practice.automationtesting.in/"
And Click on My Account Menu
And Enter registered username and password
|user | password |
| pavanoltraining | Test@selenium123  |
And Click on login button
Then user must successfully login to the webpage


