package lesson3.homework;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
       checkNumber();
       checkTemperature();
       printSquareNumbers();
       printSequenceNumbers();
       sumAllNumbers();
    }

    //Task 1
    public static void checkNumber() {
        System.out.println("--------- Task 2 ----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }

    //Task 2
    public static void checkTemperature() {
        System.out.println("--------- Task 2 ----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int temp = scanner.nextInt();
        if (temp > -5) {
            System.out.println("Warm");
        } else if (temp > -20 ){
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    //Task 3
    public static void printSquareNumbers() {
        System.out.println("--------- Task 3 ----------");
        for (int  i = 10; i <= 20; i++) {
            System.out.print((i * i) + " ");
        }
    }

    //Task 4
    public static void printSequenceNumbers() {
        System.out.println("\n--------- Task 4 ----------");
        int numberIncrease = 7;
        int counter = 1;
        while (counter <= 14) {
            System.out.print((numberIncrease * counter) + " ");
            counter++;
        }
    }

    //Task 5
    public static void sumAllNumbers() {
        System.out.println("\n--------- Task 5 ----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (number > 0) {
            int sum = 0;
            int counter = 1;
            while (counter < number) {
                sum += counter;
                counter++;
            }
            System.out.println("Sum of all numbers " + sum);
        } else {
            System.out.println("Incorrect value entered");

        }

    }

}
