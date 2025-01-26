package lesson_11_homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string");
        String str2 = scanner.nextLine();
        System.out.println("Enter the third string");
        String str3 = scanner.nextLine();

        findShortestAndLongestString(str1, str2, str3);
        sortByOrder(str1, str2, str3);
        findMidLength(str1, str2, str3);
        findStringUniqueCharacters(str1, str2, str3);
        creatingDuplicateCharacters(str1, str2, str3);


    }

    private static void findShortestAndLongestString(String str1, String str2, String str3) {
        String[] strings = new String[]{str1,str2,str3};
        String shortestStr = strings[0];
        String longestStr = strings[0];


        for (String str: strings){
            if (str.length() < shortestStr.length()) {
                shortestStr = str;
            }
            if (str.length() > longestStr.length()) {
                longestStr = str;
            }
        }
        System.out.println("------------- Task 1 -------------");
        System.out.println("The shortest string is " + shortestStr + "its length is " + shortestStr.length());
        System.out.println("The longest string is " + longestStr + "its length is " + longestStr.length());
    }

    private static void sortByOrder(String str1, String str2, String str3){
        String[] strings = new String[]{str1,str2,str3};
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println("------------- Task 2 -------------");
        System.out.println("Sort by increasing order of string length");
        for (String str:strings) {
            System.out.println(str);
        }

    }

    private static void findMidLength(String str1, String str2, String str3){
        String[] strings = new String[]{str1,str2,str3};
        int midlLength = 0;
        for (String str:strings) {
            midlLength += str.length();
        }
        System.out.println("------------- Task 3 -------------");
        System.out.println("String whose length is less than the average length");
        for (String str:strings) {
            if (str.length() < midlLength/3) {
                System.out.println("String: " + str + " its length is " + str.length());
            }
        }

    }

    private static void  findStringUniqueCharacters(String str1, String str2, String str3){
        String[] strings = new String[]{str1,str2,str3};
        System.out.println("------------- Task 4 -------------");
        String uniqueCharacter = findUniqueCharacters(strings);
        if (uniqueCharacter != null) {
            System.out.println("String consisting only of different symbols: " + uniqueCharacter);
        } else {
            System.out.println("No Strings consists only of different symbols");
        }
    }

    private static String findUniqueCharacters(String[] strings){
        for (String str:strings) {
            if (checkString(str)) {
                return str;
            }
        }
        return null;
    }

    private static boolean checkString(String str){
        boolean[] charElements = new boolean[256];
        for (int i =0; i < str.length(); i++) {
            char element = str.charAt(i);
            if (charElements[element]) {
                return false;
            }
            charElements[element] = true;
        }
       return true;
    }

    private static void  creatingDuplicateCharacters(String str1, String str2, String str3) {
        String[] strings = new String[]{str1, str2, str3};
        System.out.println("------------- Task 5 -------------");

        for (String str : strings) {
            StringBuilder strBuild = new StringBuilder(str.length() * 2);
            for (int i = 0; i < str.length(); i++) {
                strBuild.append(str.charAt(i)).append(str.charAt(i));
            }
            System.out.println("New string with each letter duplicated: " + strBuild.toString());
        }


    }
}



