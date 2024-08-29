Feature: Logout feature
Scenario: Verify the loggedout 
Given: User is on homepage
And the user logged in demoblaze website
When the user select logout option
Then the user loggedout and redirected to homepage
