package lesson_20_homework;

import java.util.Arrays;

public class SelectionSort extends Thread{
    private int[] arrNew;

    public SelectionSort(int[] arrNew) {
        this.arrNew = arrNew;
    }

    @Override
    public void run(){
        int[] arr = arrNew.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("SelectionSort array " + Arrays.toString(arr));
    }
}
