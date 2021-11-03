Feature: Login to the application

Scenario Outline: negative test validating login
Given invoke the chrome driver
And navigate to "https://qaclickacademy.com/" site
And click on login
When user enters <username> and <password> and submit
Then verify that user is unable to log into the application

Examples:
|username		 |		password|
|test99@gmail.com|		123456|
|gyudf@gmail.com |		f8981e|