Scenario: Should reverse the list of estimated rabbits
Given the number of <months>
When the number of rabbits are estimated
And the list is sorted in descending order
Then the number of rabbits for each month will be <expected>

Examples:
|months|expected|
|1|2|
|2|2, 2|
|3|4, 2, 2|
|4|6, 4, 2, 2|
|5|10, 6, 4, 2, 2|
|6|16, 10, 6, 4, 2, 2|
|7|26, 16, 10, 6, 4, 2, 2|
|8|42, 26, 16, 10, 6, 4, 2, 2|
|9|68, 42, 26, 16, 10, 6, 4, 2, 2|
|10|110, 68, 42, 26, 16, 10, 6, 4, 2, 2|
|11|178, 110, 68, 42, 26, 16, 10, 6, 4, 2, 2|
|12|288, 178, 110, 68, 42, 26, 16, 10, 6, 4, 2, 2|
|13|466, 288, 178, 110, 68, 42, 26, 16, 10, 6, 4, 2, 2|
