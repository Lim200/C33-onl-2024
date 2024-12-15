package lesson_6_homework;

public class CreditCard {
    int accountNumber;
    double currentAccountBalance;

    public CreditCard(int accountNumber, double currentAccountBalance) {
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;
    }

    double addAmountCard(double amountAdd) {
        this.currentAccountBalance += amountAdd;
        return this.currentAccountBalance;
    }

    double subtractAmountCard(double amountSubtract) {
        this.currentAccountBalance -= amountSubtract;
        return this.currentAccountBalance;
    }

    void displaysCurrentAccountBalance() {
        System.out.println("Current card information: " + this.currentAccountBalance);
    }
}
