package lesson_20_homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Shop{
    private final Queue<String> products = new LinkedList<>();
    private final int max_items = 3;

    public synchronized void addProduct(String product) throws InterruptedException {
        while (products.size() >= max_items) {
            wait();
        }
        products.offer(product);
        System.out.println("The manufacturer added: " + product);
        notifyAll();
    }

    public synchronized String buyProduct() throws InterruptedException {
        while (products.isEmpty()) {
            wait();
        }
        String product = products.poll();
        System.out.println("The buyer purchased: " + product);
        notifyAll();
        return product;
    }
}
