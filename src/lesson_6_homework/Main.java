package lesson_6_homework;

public class Main {
    public static void main(String[] args) {
        CreditCard credCard1 = new CreditCard(11111, 50.0);
        CreditCard credCard2 = new CreditCard(11112, 60.2);
        CreditCard credCard3 = new CreditCard(11113, 56.6);

        credCard1.addAmountCard(11.0);
        credCard2.addAmountCard(15.0);
        credCard3.subtractAmountCard(15.0);

        System.out.println("--------- Task 1 ----------");
        credCard1.displaysCurrentAccountBalance();
        credCard2.displaysCurrentAccountBalance();
        credCard3.displaysCurrentAccountBalance();

        ATM cashWithdrawal1 = new ATM(2,1,1);
        cashWithdrawal1.addAccount();
        cashWithdrawal1.subtractAmount(270);
    }

}
