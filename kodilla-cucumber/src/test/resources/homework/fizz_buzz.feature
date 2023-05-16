Feature: Fizz Buzz
  Is it Fizz, Buzz or FizzBuzz

  Scenario Outline: Is it Fizz, Buzz or FizzBuzz
    Given Number is <number>
    When Checking if it is Fizz, Buzz or FizzBuzz
    Then I should be told this is<result>
    Examples:
    |number|result|
    |3     |"Fizz"  |
    |5     |"Buzz"  |
    |15    |"FizzBuzz"|
    |1     |"none"     |
