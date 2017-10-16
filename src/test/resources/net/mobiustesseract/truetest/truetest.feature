Feature: TrueTest
  In order to reverse the value of a boolean number
  A user should be able to negate a value

  @property @field @provider
  Scenario Outline: Should negate parameter
    When a '<parameter>' is entered
    Then the result should be the negation of the '<parameter>'
    Examples:
    | parameter |
    | true      |
    | false     |


  Scenario: Should negate parameter 2
    When a 'true' is entered
    Then the result should be the negation of the 'true'


  Scenario: Should negate parameter 3
    When a 'false' is entered
    Then the result should be the negation of the 'false'