Feature: Purse
    As a customer
    I want to add money to purse

Background:
    Given a purse with capacity 10

Scenario: Insert single valuable
    When I insert a 5 baht coin
    Then capacity should be 9

Scenario: Insert multiple valuable
    When I insert a 10 baht coin
    And I insert a 20 baht note with serial 10000
    Then capacity should be 8



