package com.kodilla.bank.homework;

public class CashMachine {
    private int[] bankAccount;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.bankAccount = new int[0];
    }

    public void addOrTakeOut(int moneyAmount) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(bankAccount, 0, newTab, 0, bankAccount.length);
        newTab[this.size - 1] = moneyAmount;
        this.bankAccount = newTab;
    }

    public int checkAccountBalance(){
        int sum = 0;
        int howManyIndexPlaces = bankAccount.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            sum += bankAccount[i];
        }
        return sum;
    }

    public int checkNumberOfTransactions(){
        return bankAccount.length;
    }

    public int checkNumberOfCashWithdrawal(){
        int count = 0;
        int howManyIndexPlaces = bankAccount.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            if (bankAccount[i] < 0){
                count++;
            }
        }
        return count;
    }

    public int checkSumOfCashWithdrawal(){
        int sum = 0;
        int howManyIndexPlaces = bankAccount.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            if (bankAccount[i] < 0){
                sum += bankAccount[i];
            }
        }
        return sum;
    }

    public int checkNumberOfPaymentsOnAccount(){
        int count = 0;
        int howManyIndexPlaces = bankAccount.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            if (bankAccount[i] > 0){
                count++;
            }
        }
        return count;
    }

    public int checkSumOfPaymentsOnAccount(){
        int sum = 0;
        int howManyIndexPlaces = bankAccount.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            if (bankAccount[i] > 0){
                sum += bankAccount[i];
            }
        }
        return sum;
    }

    // metody nie zostały użyte:

    public int checkAveragePaymentOnAccount(){
        int sum = 0;
        int count = 0;
        int howManyIndexPlaces = bankAccount.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            if (bankAccount[i] > 0){
                sum += bankAccount[i];
                count ++;
            }
        }
        return sum/count;
    }

    public int checkAverageCashWithdrawal(){
        int sum = 0;
        int count = 0;
        int howManyIndexPlaces = bankAccount.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            if (bankAccount[i] < 0){
                sum += bankAccount[i];
                count ++;
            }
        }
        return sum/count;
    }


    // gettery i settery:

    public int[] getBankAccount() {
        return bankAccount;
    }

    public int getBankAccountGivenAmount(int index){
        return bankAccount[index];
    }

    public void setBankAccount(int[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

//    public static void main(String[] args) {
//        CashMachine cashMachine = new CashMachine();
//        cashMachine.addOrTakeOut(-2);
//        System.out.println(cashMachine.getBankAccountGivenAmount(0));
//
//        cashMachine.addOrTakeOut(50);
//        cashMachine.addOrTakeOut(60);
//        cashMachine.addOrTakeOut(-10);
//        cashMachine.addOrTakeOut(-11);
//
//        System.out.println(cashMachine.checkNumberOfCashWithdrawal());
//        System.out.println(cashMachine.checkNumberOfPaymentsOnAccount());
//        System.out.println(cashMachine.checkAveragePaymentOnAccount());
//        System.out.println(cashMachine.checkAverageCashWithdrawal());
//        System.out.println(cashMachine.checkSumOfCashWithdrawal());
//        System.out.println(cashMachine.checkSumOfPaymentsOnAccount());
//
//
//    }

}