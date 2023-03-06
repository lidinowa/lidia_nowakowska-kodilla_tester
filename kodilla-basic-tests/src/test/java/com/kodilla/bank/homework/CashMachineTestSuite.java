package com.kodilla.bank.homework;

import com.kodilla.school.Grades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private CashMachine cashMachine;

    @BeforeEach
    public void setUp(){
        cashMachine = new CashMachine();
    }

    @Test
    public void shouldHaveZeroLengthWhenNoTransactions() {
      //  int[] bankAccount = cashMachine.getBankAccount();  // dwa poprawne sposoby?
      //  assertEquals(0,bankAccount.length);
        assertEquals(0,cashMachine.getBankAccount().length);
    }

    @Test
    public void shouldMakeThreeOperations(){
        cashMachine.addOrTakeOut(100);
        cashMachine.addOrTakeOut(2500);
        cashMachine.addOrTakeOut(-1000);
        assertEquals(3,cashMachine.getBankAccount().length);
        assertEquals(100,cashMachine.getBankAccountGivenAmount(0));
        assertEquals(2500,cashMachine.getBankAccountGivenAmount(1));
        assertEquals(-1000,cashMachine.getBankAccountGivenAmount(2));
    }

    @Test
    public void checkAccountBalanceWithTransactionsAdded(){
        cashMachine.addOrTakeOut(25);
        cashMachine.addOrTakeOut(50);
        cashMachine.addOrTakeOut(-10);
        assertEquals(65,cashMachine.checkAccountBalance());
    }

    @Test
    public void checkAccountBalanceWithNoTransactionsAdded(){
        assertEquals(0,cashMachine.checkAccountBalance());
    }

    @Test
    public void checkNumberOfTransactions(){
        cashMachine.addOrTakeOut(25);
        cashMachine.addOrTakeOut(50);
        cashMachine.addOrTakeOut(-10);
        assertEquals(3,cashMachine.checkNumberOfTransactions());
    }

    @Test
    public void checkNumberOfTransactionsWhenNothingAdded(){
        assertEquals(0,cashMachine.checkNumberOfTransactions());
    }

    @Test
    public void checkHowManyCashWithdrawal(){
        cashMachine.addOrTakeOut(25);
        cashMachine.addOrTakeOut(-50);
        cashMachine.addOrTakeOut(-10);
        assertEquals(2,cashMachine.checkNumberOfCashWithdrawal());
    }

    @Test
    public void checkHowManyCashWithdrawalWhenShouldBeZero(){
        cashMachine.addOrTakeOut(25);
        cashMachine.addOrTakeOut(50);
        cashMachine.addOrTakeOut(10);
        assertEquals(0,cashMachine.checkNumberOfCashWithdrawal());
    }

    @Test
    public void checkHowManyPaymentsOnAccount(){
        cashMachine.addOrTakeOut(25);
        cashMachine.addOrTakeOut(50);
        cashMachine.addOrTakeOut(-10);
        assertEquals(2,cashMachine.checkNumberOfPaymentsOnAccount());
    }

    @Test
    public void checkHowManyPaymentsOnAccountWhenShouldBeZero(){
        cashMachine.addOrTakeOut(-25);
        cashMachine.addOrTakeOut(-50);
        cashMachine.addOrTakeOut(-10);
        assertEquals(0,cashMachine.checkNumberOfPaymentsOnAccount());
    }
}