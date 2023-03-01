package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLengthWhenNoCashMachinesAdded() {
        Bank bank = new Bank();
        assertEquals(0, bank.getTableAllCashMachines().length);
    }

    @Test
    public void addingTwoCashMachines() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        assertEquals(2, bank.getTableAllCashMachines().length);
    }

    @Test
    public void checkCashMachinesBalance() {
        //dla dwóch bankomatów
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(300);
        cashMachine1.addOrTakeOut(-100);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        assertEquals(700, bank.checkAllCashMachinesBalance());
    }

    @Test
    public void checkCashMachinesBalanceWhenZeroExpected() {
        //dla dwóch bankomatów
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(0, bank.checkAllCashMachinesBalance());
    }

    @Test
    public void checkAllBankCashWithdrawal() {
        //dla dwóch bankomatów
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(-200);
        cashMachine1.addOrTakeOut(-200);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(3, bank.checkAllBankCashWithdrawal());
    }

    @Test
    public void checkAllBankCashWithdrawalWhenZeroExpected() {
        //dla dwóch bankomatów
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(200);
        cashMachine1.addOrTakeOut(200);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(500);
        assertEquals(0, bank.checkAllBankCashWithdrawal());
    }

    @Test
    public void checkAllBankPaymentsOnAccounts() {
        //dla dwóch bankomatów
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(200);
        cashMachine1.addOrTakeOut(-100);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(2, bank.checkAllBankPaymentsOnAccounts());
    }

    @Test
    public void checkAllBankPaymentsOnAccountsWhenZeroExpected() {
        //dla dwóch bankomatów
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(-200);
        cashMachine1.addOrTakeOut(-100);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(-500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(0, bank.checkAllBankPaymentsOnAccounts());
    }

    @Test
    public void checkAverageCashWithdrawal() {
        //dla dwóch bankomatów
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(200);
        cashMachine1.addOrTakeOut(-100);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(-300, bank.checkAverageCashWithdrawal());
    }

    @Test
    public void checkAveragePaymentsOnAccount() {
        //dla dwóch bankomatów
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        bank.addCashMachine(cashMachine1);
        cashMachine1.addOrTakeOut(200);
        cashMachine1.addOrTakeOut(-100);
        CashMachine cashMachine2 = new CashMachine();
        bank.addCashMachine(cashMachine2);
        cashMachine2.addOrTakeOut(500);
        cashMachine2.addOrTakeOut(-500);
        assertEquals(350, bank.checkAveragePaymentOnAccount());
    }


}
