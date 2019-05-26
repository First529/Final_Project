Feature: ThaiMoneyFactory
  As the thai money factory
  I want make money for my currency

  Background:
    Given a Thai Money Factory

  Scenario: Make Thai currency
    When I make a 1 Baht coin
    And I make a 2 Baht coin
    And I make a 20 Baht note
    And I make a 1000 Baht note
    Then success

  Scenario: Make Invalid currency
    When I make a 0.01 Baht coin
    And I make a 10000 Baht note
    Then not success
