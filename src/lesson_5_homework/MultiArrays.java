package lesson_5_homework;

import lesson4.homework.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        int[][] array = createArray();
        printSumArrayElements(array);
        createChessboard();
        createSnakeArray();

    }

    public static int[][] createArray() {
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i =0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 50);
            }
        }
        return array;
    }


    public static void printSumArrayElements (int[][] array){
        System.out.println("--------- Task 1 ----------");
        System.out.println("Enter a number to add to array elements");
        Scanner scanner = new Scanner(System.in);
        int numberForAdd = scanner.nextInt();
        int sum = 0;
        for (int i =0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += numberForAdd;
                sum += array[i][j];
            }
        }
        System.out.println("Sum of all elements of the array = " + sum);
    }

    public static void createChessboard() {
        System.out.println("--------- Task 2 ----------");
        char[][] array = new char[8][8];
        for (int i =0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ( (i + j) % 2 == 0) {
                    array[i][j] = 'W';
                } else {
                    array[i][j] = 'B';
                }
            }
        }
        for(char[] row:array) {
            for(char cell:row) {
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }

    public static void createSnakeArray() {
        System.out.println("--------- Task 3 ----------");
        System.out.println("Enter the number of rows in the array");
        Scanner scanner = new Scanner(System.in);
        int numberRows = scanner.nextInt();
        System.out.println("Enter the number of columns in the array");
        int numberColumns = scanner.nextInt();
        int[][] array = new int[numberRows][numberColumns];
        int countElements = 0;
        for (int i =0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = countElements;
                    countElements++;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = countElements;
                    countElements++;
                }
            }
        }
        for(int[] row:array) {
            for(int cell:row) {
                System.out.printf("%3d", cell);
            }
            System.out.println();
        }

    }

}

