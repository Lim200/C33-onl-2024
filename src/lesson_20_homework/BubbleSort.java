package lesson_20_homework;

import java.util.Arrays;

public class BubbleSort extends Thread{
    private int[] arrNew;

    public BubbleSort(int[] arrNew) {
        this.arrNew = arrNew;
    }

    @Override
    public void run(){
        int[] arr = arrNew.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("BubbleSort array " + Arrays.toString(arr));
    }
}
