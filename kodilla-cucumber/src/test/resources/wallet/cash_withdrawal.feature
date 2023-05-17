Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <deposit> in my wallet
    When I request <withdraw>
    Then <dispensed> should be dispensed
    Examples:
    |deposit|withdraw|dispensed|
    |200    |30      |30     |
    |100    |100     |100      |
    |50     |200     |200      |
    |0      |10      |10       |