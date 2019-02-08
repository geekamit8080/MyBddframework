Feature: feature description
@SmokeTest @RegressionTest
Scenario Outline: Sucessfull login with credentials

Given user is allready in login page
When title of login page is free crm
Then user enters "<username>" as username
And user enters "<password>" as password
Then user is able to login the application


Examples:
| username | password |
| amitvaidya| Dx87kxkpj3|
| naveenk | test@123 |