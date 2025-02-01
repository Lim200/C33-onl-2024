package lesson_12_homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) {
        task1();
        //task2();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------ Task1 ------------");
        System.out.println("Enter the string");
        String str = scanner.nextLine();

        String[] parts = str.split(" ");

        Pattern pattern = Pattern.compile("\\b[A-ZА-Я]{2,6}\\b");
        for (String part : parts) {
            Matcher matcher = pattern.matcher(part);
            if (matcher.find()) {
                System.out.println("Found a word: " + matcher.group());
            }
        }
    }

        public static void task2 (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("------------ Task2 ------------");
            System.out.println("Enter the string");
            String str = scanner.nextLine();

            Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
            Pattern documentPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
            Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");

            Matcher emailMatcher = emailPattern.matcher(str);
            Matcher documentMatcher = documentPattern.matcher(str);
            Matcher phoneMatcher = phonePattern.matcher(str);

            while (emailMatcher.find()) {
                System.out.println("email: " + emailMatcher.group());
            }

            while (documentMatcher.find()) {
                System.out.println("document number: " + documentMatcher.group());
            }

            while (phoneMatcher.find()) {
                System.out.println("phone number: " + phoneMatcher.group());
            }
        }



}