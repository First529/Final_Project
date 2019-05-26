Feature: Deposit
    As a customer
    I want to add money to purse

Background:
    Given a purse with capacity 10

Scenario: Insert single valuable
    When I insert a 5 Baht coin
    Then remaining capacity should be 9 and total balanced is 5 Baht

Scenario: Insert multiple valuable
    When I insert a 10 Baht coin
    And I insert a 20 Baht note with serial 10000
    Then remaining capacity should be 8 and total balanced is 30 Baht


