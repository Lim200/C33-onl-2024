package lesson_20_homework;

import java.util.Arrays;

public class InsertionSort extends Thread{
    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run(){
        int[] arrNew = arr.clone();
        for (int i = 1; i < arrNew.length; i++) {
            int key = arrNew[i];
            int j = i - 1;
            while (j >= 0 && arrNew[j] > key) {
                arrNew[j + 1] = arrNew[j];
                j--;
            }
            arrNew[j + 1] = key;
        }
        System.out.println("InsertionSort array " + Arrays.toString(arrNew));
    }


}
