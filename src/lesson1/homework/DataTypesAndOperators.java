package lesson1.homework;

public class DataTypesAndOperators {
    public static void main(String[] args) {
        printValueFormula();
        sumDigitsTwoDigitNumber();
        sumDigitsThreeDigitNumber();
        roundNumber();
        printDivisionResult();
        swapVariableValues();
    }
    // Task 1
    public static void printValueFormula() {
        System.out.println("--------- Task 1 ----------");
        int b = 2;
        int c = 3;
        double a = 0;
        a = 4.0 * (b + c - 1)/2;
        System.out.println("Formula calculation result " + a);
    }

    // Task 2
    public static void sumDigitsTwoDigitNumber() {
        System.out.println("--------- Task 2 ----------");
        int n = 26;
        int firstNumber = n % 10;
        int twoNumber = (n - firstNumber) / 10;
        int result = firstNumber + twoNumber;

        System.out.println("Sum of the digits of a two-digit number " + result);
    }

    // Task 3
    public static void sumDigitsThreeDigitNumber() {
        System.out.println("--------- Task 3 ----------");
        int n = 126;
        int firstNumber = n % 10;
        int twoNumber = (n - firstNumber) / 10 % 10;
        int threeNumber = ((n - firstNumber - twoNumber * 10) / 100 % 10);
        int result = firstNumber + twoNumber + threeNumber;
        System.out.println("Sum of the digits of a three-digit number " + result);
    }

    // Task 4
    public static void roundNumber() {
        System.out.println("--------- Task 4 ----------");
        double n = 12.6;
        int result = (int) (n + 0.5);
        System.out.println("The value of the rounded number " + result);
    }

    // Task 5
    public static void printDivisionResult() {
        System.out.println("--------- Task 5 ----------");
        int q = 21;
        int w = 8;
        int wholePart = q / w;
        int remainder = q % w;
        System.out.println(wholePart + " and " + remainder +" remainder");
    }

    // Task 6
    public static void swapVariableValues() {
        System.out.println("--------- Task 6 ----------");
        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
