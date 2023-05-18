package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PreventUsersSteps {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    @Given("there is 100 in my wallet")
    public void there_is_100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I withdraw 200")
    public void i_withdraw_200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(100, wallet.getBalance());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        Cashier cashier = new Cashier(cashSlot);
        assertEquals("You don't have money", cashier.informationToCustomer(wallet,200));
    }
}
