package lesson_20_homework;

import java.util.Scanner;

public class MyMain {
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[] arrResult = returnMaximumMinimum();
        System.out.println("------- Task 1 -------");
        System.out.println("Maximum = " + arrResult[1]);
        System.out.println("Minimum = " + arrResult[0]);

        int[] arr = new int[]{1,6,0,8,9};
        System.out.println("------- Task 2 -------");
        InsertionSort arrInsSort = new InsertionSort(arr);
        arrInsSort.start();

        SelectionSort arrSelectSort = new SelectionSort(arr);
        arrSelectSort.start();

        BubbleSort arrBubbleSort= new BubbleSort(arr);
        arrBubbleSort.start();

        try{
            arrInsSort.join();
            arrSelectSort.join();
            arrBubbleSort.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("------- Task 3 -------");
        Shop shop = new Shop();
        Manufacturer manufacturer = new Manufacturer(shop);
        Buyer buyer = new Buyer(shop);

        manufacturer.start();
        buyer.start();

        try {
            manufacturer.join();
            buyer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }


    public static int[] returnMaximumMinimum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int countElement = scanner.nextInt();

        int[] arr = new int[countElement];
        System.out.println("Enter the array elements:");
        for(int i=0; i < countElement; i++){
            arr[i] = scanner.nextInt();
        }

        Thread minThread = new Thread(() ->{
           for (int el : arr){
               if(el < min) {
                   min = el;

               }

           }
        });

        Thread maxThread = new Thread(() ->{
            for (int el : arr){
                if(el > max) {
                    max = el;
                }

            }
        });

        minThread.start();
        maxThread.start();
        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        return new int[]{min, max};
    }
}


