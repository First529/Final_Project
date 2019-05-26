Feature: Withdraw
    As a customer
    I want to withdraw money from the purse

Background:
    Given a purse with capacity 10
    And contain 5 Baht coin
    And contain 20 Baht note with serial 10000
    And contain 1000 Baht note with serial 10001
    And contain 1000 Baht note with serial 10002
	
Scenario: Single Withdraw
	When I withdraw a 20 Baht note with serial 10000
	Then remaining capacity should be 7 and total balanced is 2005 Baht
	
Scenario: Multiple Withdraw
	When I withdraw a 1000 Baht note with serial 10001
	And I withdraw a 5 Baht coin
	Then remaining capacity should be 8 and total balanced is 1020 Baht
	
Scenario: Invalid Withdraw
	When I withdraw a 50 Baht coin
	Then remaining capacity should be 6 and total balanced is 2025 Baht
