package lesson_17_homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyMain {
    public static void main(String[] args) {
        printBirthdayLaterHundred();
        printPredicate();
        printCurrencyFun();
        printCurrency();
        printReverseString();

    }

    public static void printBirthdayLaterHundred(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- Task 1 ----------");
        System.out.println("Enter your date of birth (yyyy-MM-dd)");
        String birthday = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthdayDate = LocalDate.parse(birthday, formatter);
        LocalDate birthdayLaterHundred = birthdayDate.plusYears(100);
        System.out.println(birthdayLaterHundred);
    }

    public static void printPredicate() {
        int[] arr = new int[]{-1,2,5,-5,6};
        System.out.println("---------- Task 2 ----------");
        Predicate<Integer> isPositive = number -> number >0;

        for (int number:arr) {
            if (isPositive.test(number)) {
                System.out.print(number + " ");
            }
        }

    }

    public static void printCurrencyFun() {
        String strByn = "100 BYN";
        double courseDollar = 3.25;
        System.out.println();
        System.out.println("---------- Task 3 ----------");
        Function<String, String> function = str -> {
            double byn =Double.parseDouble(str.split(" ")[0]);
            double dollars = byn / courseDollar;
            return dollars + " USD";
        };
        System.out.println(function.apply(strByn));
    }

    public static void printCurrency() {
        String strByn = "100 BYN";
        double courseDollar = 3.25;
        System.out.println("---------- Task 4 ----------");
        Consumer<String>  result = str -> {
            double byn =Double.parseDouble(str.split(" ")[0]);
            double dollars = byn / courseDollar;
            System.out.println(dollars + " USD");
        };

        result.accept(strByn);
    }

    public static void printReverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- Task 5 ----------");
        System.out.println("Enter string");
        String str = scanner.nextLine();

        Supplier<String> supplier = () -> new StringBuilder(str).reverse().toString();

        System.out.println(supplier.get());

    }

}
