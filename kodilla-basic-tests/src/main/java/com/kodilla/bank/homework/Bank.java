package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] tableAllCashMachines;
    int size;

    public Bank() {
        this.tableAllCashMachines = new CashMachine[0];
        this.size = 0;
    }

    // wpłacanie lub wypłacanie środków

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(tableAllCashMachines, 0, newTab, 0, tableAllCashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.tableAllCashMachines = newTab;
    }

    // saldo z wszystkich bankomatów

    public int checkAllCashMachinesBalance(){
        int sum = 0;
        int howManyIndexPlaces = tableAllCashMachines.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            sum += tableAllCashMachines[i].checkAccountBalance();
        }
        return sum;
    }

    //liczba wszystkich wypłat

    public int checkAllBankCashWithdrawal(){
        int sum = 0;
        int howManyIndexPlaces = tableAllCashMachines.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            sum += tableAllCashMachines[i].checkNumberOfCashWithdrawal();
        }
        return sum;
    }

    //liczba wszystkich wpłat

    public int checkAllBankPaymentsOnAccounts(){
        int sum = 0;
        int howManyIndexPlaces = tableAllCashMachines.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            sum += tableAllCashMachines[i].checkNumberOfPaymentsOnAccount();
        }
        return sum;
    }

    //średnia wypłat

    public int checkAverageCashWithdrawal(){
        int sum = 0;
        int howManyIndexPlaces = tableAllCashMachines.length - 1;
        if (this.tableAllCashMachines.length == 0) {
            return 0;
        }
        for (int i = 0; i <= howManyIndexPlaces; i++){
            sum += tableAllCashMachines[i].checkSumOfCashWithdrawal();
        }
        return sum/checkAllBankCashWithdrawal();
    }

    //średnia wpłat

    public int checkAveragePaymentOnAccount(){
        int sum = 0;
        int howManyIndexPlaces = tableAllCashMachines.length - 1;
        if (this.tableAllCashMachines.length == 0){
            return 0;
        }
        for (int i = 0; i <= howManyIndexPlaces; i++){
            sum += tableAllCashMachines[i].checkSumOfPaymentsOnAccount();
        }
        return sum/checkAllBankPaymentsOnAccounts();
    }


    //inny sposób uzyskania średniej:

    public int checkAveragePaymentOnAccount2(){
        int sum = 0;
        int count = 0;
        int howManyIndexPlaces = tableAllCashMachines.length - 1;
        for (int i = 0; i <= howManyIndexPlaces; i++){
            if (tableAllCashMachines[i].checkAveragePaymentOnAccount() > 0) {
                sum += tableAllCashMachines[i].checkAveragePaymentOnAccount();
                count++;
            }
        }
        return sum/count;
    }

    // próba pętli w pętli
//
//    public int checkAllCashWithdrawal(){
//        int sum = 0;
//        int count = 0;
//        CashMachine cashMachine = new CashMachine();
//        int howManyIndexPlacesCashMachines = tableAllCashMachines.length - 1;
//        int howManyIndexPlacesTransactions = cashMachine.checkNumberOfTransactions() - 1;
//        for (int i = 0; i <= howManyIndexPlacesCashMachines; i++){
//            for (int y = 0; y <= howManyIndexPlacesTransactions; y++){
//                if (cashMachine.getBankAccountGivenAmount(y) < 0){
//                    // sum += tableAllCashMachines[i].getBankAccountGivenAmount(y);
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    //gettery i settery

    public CashMachine[] getTableAllCashMachines() {
        return tableAllCashMachines;
    }

    public void setTableAllCashMachines(CashMachine[] tableAllCashMachines) {
        this.tableAllCashMachines = tableAllCashMachines;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}