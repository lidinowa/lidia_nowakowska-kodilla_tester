package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank bank;
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;

    @BeforeEach
    public void setUp(){
        this.bank = new Bank();
        cashMachine1 = new CashMachine();
        cashMachine2 = new CashMachine();
    }

    @Test
    public void shouldHaveZeroLengthWhenNoCashMachinesAdded() {
        assertEquals(0, bank.getTableAllCashMachines().length);
    }

    @Test
    public void addingTwoCashMachines() {
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        assertEquals(2, bank.getTableAllCashMachines().length);
    }

    @Test
    public void checkCashMachinesBalance() {
        //dla dwóch bankomatów
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(300);
        cashMachine1.addOrTakeOut(-100);
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        assertEquals(700, bank.checkAllCashMachinesBalance());
    }

    @Test
    public void checkCashMachinesBalanceWhenZeroExpected() {
        //dla dwóch bankomatów
        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(0, bank.checkAllCashMachinesBalance());
    }

    @Test
    public void checkAllBankCashWithdrawal() {
        //dla dwóch bankomatów
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(-200);
        cashMachine1.addOrTakeOut(-200);
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(3, bank.checkAllBankCashWithdrawal());
    }

    @Test
    public void checkAllBankCashWithdrawalWhenZeroExpected() {
        //dla dwóch bankomatów
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(200);
        cashMachine1.addOrTakeOut(200);
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(500);
        assertEquals(0, bank.checkAllBankCashWithdrawal());
    }

    @Test
    public void checkAllBankPaymentsOnAccounts() {
        //dla dwóch bankomatów
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(200);
        cashMachine1.addOrTakeOut(-100);
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(2, bank.checkAllBankPaymentsOnAccounts());
    }

    @Test
    public void checkAllBankPaymentsOnAccountsWhenZeroExpected() {
        //dla dwóch bankomatów
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(-200);
        cashMachine1.addOrTakeOut(-100);
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(-500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(0, bank.checkAllBankPaymentsOnAccounts());
    }

    @Test
    public void checkAverageCashWithdrawal() {
        //dla dwóch bankomatów
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(200);
        cashMachine1.addOrTakeOut(-100);
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(-300, bank.checkAverageCashWithdrawal());
    }

    @Test
    public void checkAveragePaymentsOnAccount() {
        //dla dwóch bankomatów
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(200);
        cashMachine1.addOrTakeOut(-100);
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(350, bank.checkAveragePaymentOnAccount());
    }
}