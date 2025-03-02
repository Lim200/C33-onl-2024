package lesson_20_homework;

import java.util.Arrays;
import java.util.Collections;

public class Manufacturer extends Thread{
    private final Shop shop;
    private final String[] arrProducts = {"Laptop", "Smartphone", "Tablet", "Smartwatch", "Headphones"};;

    public Manufacturer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run(){
        try {
            Collections.shuffle(Arrays.asList(arrProducts));
            for (String product : arrProducts) {
                shop.addProduct(product);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
