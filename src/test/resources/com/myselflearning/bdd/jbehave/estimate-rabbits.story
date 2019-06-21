Scenario: Should estimate the number of rabbits
Given the number of <months>
When the number of rabbits are estimated
Then the number of rabbits for each month will be <expected>

Examples:
|months|expected|
|1|2|
|2|2, 2|
|3|2, 2, 4|
|4|2, 2, 4, 6|
|5|2, 2, 4, 6, 10|
|6|2, 2, 4, 6, 10, 16|
|7|2, 2, 4, 6, 10, 16, 26|
|8|2, 2, 4, 6, 10, 16, 26, 42|
|9|2, 2, 4, 6, 10, 16, 26, 42, 68|
|10|2, 2, 4, 6, 10, 16, 26, 42, 68, 110|
|11|2, 2, 4, 6, 10, 16, 26, 42, 68, 110, 178|
|12|2, 2, 4, 6, 10, 16, 26, 42, 68, 110, 178, 288|
|13|2, 2, 4, 6, 10, 16, 26, 42, 68, 110, 178, 288, 466|