package lesson4.homework;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = createArray();
        printArray(array);
        findMinAndMaxElement(array);
        findIndexMinAndMaxElement(array);
        findZeroElement(array);
        swapArrayElements(array);
        checkArrayIsIncreasSequence(array);
        addOneToArray();
    }

    public static int[] createArray() {
        System.out.println("Enter array size");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        int[] array = new int[sizeArray];
        Random random = new Random();
        for (int i =0; i < array.length; i++) {
            array[i] = random.nextInt(0, 50);
        }
        return array;
    }
    // Task 1
    public static void printArray(int[] array) {
        System.out.println("--------- Task 1 ----------");
        for (int value : array) {
            System.out.print(value + " " );
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
           System.out.print(array[i] + " " );
        }
    }

    // Task 2
    public static void findMinAndMaxElement(int[] array) {
        System.out.println("\n--------- Task 2 ----------");
        int minElement = array[0];
        int maxElement = array[0];
        for (int value : array) {
            if (maxElement < value) {
                maxElement = value;
            }
            if (minElement > value) {
                minElement = value;
            }
        }
        System.out.println("Max element = " + maxElement);
        System.out.println("Min element = " + minElement);
    }

    // Task 3
    public static void findIndexMinAndMaxElement(int[] array) {
        System.out.println("\n--------- Task 3 ----------");
        int minElement = array[0];
        int maxElement = array[0];
        int minElementIndex = 0;
        int maxElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                maxElementIndex = i;

            }
            if (minElement > array[i]) {
                minElement = array[i];
                minElementIndex = i;

            }
        }
        System.out.println("Index of maximum element  = " + maxElementIndex);
        System.out.println("Index of minimum element = " + minElementIndex);
    }

    // Task 4
    public static void findZeroElement(int[] array) {
        System.out.println("\n--------- Task 4 ----------");
        int zeroElement = 0;
        for (int value : array) {
            if (0 == value) {
                zeroElement++;
            }
        }
        if (zeroElement == 0) {
            System.out.println("There are no zero elements");
        } else {
            System.out.println("Number of zero elements = " + zeroElement);
        }
    }

    // Task 5
    public static void swapArrayElements(int[] array) {
        System.out.println("\n--------- Task 5 ----------");
        System.out.println(Arrays.toString(array));
        int arrayLength = array.length;
        int tempElementArray = 0;
        for (int i = 0; i < arrayLength/2; i++) {
            tempElementArray = array[i];
            array[i] = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = tempElementArray;
        }
        System.out.println(Arrays.toString(array));
    }

    // Task 6
    public static void checkArrayIsIncreasSequence(int[] array) {
        System.out.println("\n--------- Task 6 ----------");
        boolean flag = false;
        for (int i = 1; i < array.length; i++) {
           if ( array[i] > array[i-1]) {
               flag = true;
           } else {
               flag = false;
           }
        }
        if (flag) {
            System.out.println("The array is an increasing sequence");
        } else {
            System.out.println("The array is not an increasing sequence");
        }
    }

    // Task 7
    public static void addOneToArray() {
        System.out.println("\n--------- Task 7 ----------");
        int[] array = new int[]{ 0, 1, 9, 9, 9};
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            array[i]++;
            if (array[i] <= 9) {
                break;
            }
            array[i] = 0;
            if (i - 1 < 0) {
                int[] newArray = new int[array.length + 1];
                newArray[0] = 1;
                System.arraycopy(array, 0, newArray, 1, array.length);
                array = newArray;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
