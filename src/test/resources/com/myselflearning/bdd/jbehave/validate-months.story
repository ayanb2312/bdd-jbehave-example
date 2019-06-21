Scenario: Should require the month to be greater than zero
Given the number of months is zero
When the number of rabbits are estimated
Then the ExpectedPositiveMonthsException with will be thrown