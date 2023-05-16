package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzz {
    int number;
    String result;

    @Given("Number is 3")
    public void number_is_3() {
        this.number = 3;
    }

    @Given("Number is 5")
    public void number_is_5() {
        this.number = 5;
    }

    @Given("Number is 15")
    public void number_is_15() {
        this.number = 15;
    }

    @Given("Number is 1")
    public void number_is_1() {
        this.number = 1;
    }
    @When("Checking if it is Fizz, Buzz or FizzBuzz")
    public void checking_if_it_is_fizz_buzz_or_fizz_buzz() {
        FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
        this.result = fizzBuzzChecker.checkNumber(this.number);
    }

    @Then("I should be told this is{string}")
    public void i_should_be_told_this_is(String string) {
        assertEquals(string, this.result);
    }
}