package lesson_6_homework;

public class ATM {
    int banknoteTwenty = 20;
    int banknoteFifty = 50;
    int banknoteHundred = 100;
    int bankAccount = 0;
    int quantityBanknoteTwenty;
    int quantityBanknoteFifty;
    int quantityBanknoteHundred;


    public ATM(int quantityBanknoteTwenty, int quantityBanknoteFifty,int quantityBanknoteHundred) {
        this.quantityBanknoteTwenty = quantityBanknoteTwenty;
        this.quantityBanknoteFifty = quantityBanknoteFifty;
        this.quantityBanknoteHundred = quantityBanknoteHundred;
    }

    int  addAccount() {
       bankAccount = (banknoteTwenty*quantityBanknoteTwenty) + (banknoteFifty*quantityBanknoteFifty) +
                (banknoteHundred*quantityBanknoteHundred);
       return bankAccount;
    }

    boolean subtractAmount(int amountWithdraw) {
        System.out.println("\n--------- Task 2 ----------");
        int countBanknoteHundred = amountWithdraw / banknoteHundred;
        if (quantityBanknoteHundred >= countBanknoteHundred) {
            amountWithdraw %= banknoteHundred;
        } else {
            amountWithdraw -= quantityBanknoteHundred * banknoteHundred;
            countBanknoteHundred = quantityBanknoteHundred;
        }
        int countBanknoteFifty = amountWithdraw / banknoteFifty;
        if (quantityBanknoteFifty >= countBanknoteFifty) {
            amountWithdraw %= banknoteFifty;
        } else {
            amountWithdraw -= quantityBanknoteFifty * banknoteFifty;
            countBanknoteFifty = quantityBanknoteFifty;
        }
        int countBanknoteTwenty = amountWithdraw /banknoteTwenty;
        if (quantityBanknoteTwenty >= countBanknoteTwenty) {
            amountWithdraw %= banknoteTwenty;
        } else {
            amountWithdraw -= quantityBanknoteTwenty * banknoteTwenty;
            countBanknoteTwenty = quantityBanknoteTwenty;
        }

        if (amountWithdraw == 0) {
            System.out.println("Number of bills of 100 = " + countBanknoteHundred);
            System.out.println("Number of bills of 50 = " + countBanknoteFifty);
            System.out.println("Number of bills of 20 = " + countBanknoteTwenty);
            return true;
    }
        System.out.println("Insufficient funds in the account");
        return false;
    }

}

