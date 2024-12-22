package lesson_9_homework;

public class Worker extends Employees implements PrintInfo{
    public Worker(String name, String surname, String position) {
        super(name, surname, position);
    }

    @Override
    public void print(String position) {
        System.out.println("Position of Worker " + position);
    }
}
