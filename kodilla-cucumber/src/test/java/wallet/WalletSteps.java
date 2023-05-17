package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited 200 in my wallet")
    public void i_have_deposited_200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @Given("I have deposited 100 in my wallet")
    public void i_have_deposited_100_in_my_wallet() {
        wallet.deposit(100);
        assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }

    @Given("I have deposited 50 in my wallet")
    public void i_have_deposited_50_in_my_wallet() {
        wallet.deposit(50);
        assertEquals(50, wallet.getBalance(), "Incorrect wallet balance");
    }

    @Given("I have deposited 0 in my wallet")
    public void i_have_deposited_0_in_my_wallet() {
        wallet.deposit(0);
        assertEquals(0, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request 30")
    public void i_request_30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @When("I request 100")
    public void i_request_100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 100);
    }

    @When("I request 200")
    public void i_request_200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @When("I request 10")
    public void i_request_10() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 10);
    }

    @Then("30 should be dispensed")
    public void should_be_dispensed_30() {
        assertEquals(30, cashSlot.getContents());
    }

    @Then("100 should be dispensed")
    public void should_be_dispensed_100() {
        assertEquals(100, cashSlot.getContents());
    }

    @Then("200 should be dispensed")
    public void should_be_dispensed_200() {
        assertEquals(200, cashSlot.getContents());
    }

    @Then("10 should be dispensed")
    public void should_be_dispensed_10() {
        assertEquals(10, cashSlot.getContents());
    }


}