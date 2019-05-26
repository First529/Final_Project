Feature: MalayMoneyFactory
	As the malay money factory
	I want make money for my currency

Background:
	Given a Malay Money Factory

Scenario: Make Malay currency
	When I make a 0.05 Sen coin
	And I make a 0.2 Sen coin
	And I make a 20 Ringgit note
    And I make a 50 Ringgit note
    Then success

Scenario: Make Invalid currency
    When I make a 0.01 Sen coin
    And I make a 1000 Ringgit note
    Then not success
