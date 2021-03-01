Feature: Test Signin Functionality 

Scenario: Check Signin is successfully with valid credentials 

	Given Browser is open 
	And User is on Signin page 
	When user enters username 
	And Click on email next button 
	Then user enters password 
	And Click on password next button 
	And User Signin Successfully
	 
	
Scenario: Check Compose Functionality

	Given homepage is open
	And User click on compose button
	Then New Message window will open
	And User will enter Email Id in To option
	Then user writes mail in Emailbody
	Then User send that mail
