package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplayBalanceSteps {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();


    @Given("there is 100 in my wallet now")
    public void there_is_100_in_my_wallet_now() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        assertEquals(100,wallet.getBalance());
    }
    @Then("I should see that the balance is 100")
    public void i_should_see_that_the_balance_is_100() {
        Cashier cashier = new Cashier(cashSlot);
        assertEquals("The balance is 100", cashier.displayBalance(wallet));
}}
