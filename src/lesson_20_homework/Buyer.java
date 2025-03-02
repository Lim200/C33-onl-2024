package lesson_20_homework;

class Buyer extends Thread {
    private final Shop shop;

    public Buyer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                shop.buyProduct();
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
