package lesson_9_homework;

public class MyMain {
    public static void main(String[] args) {
        Director director = new Director("Alex", "Ivanov", "Director");
        Worker worker = new Worker("Ivan", "Mask", "Worker");
        Accountant accountant = new Accountant("Petr", "Koreiko", "Accountant");

        director.print(director.getPosition());
        worker.print(worker.getPosition());
        accountant.print(accountant.getPosition());
    }
}
