package lesson_9_homework;

public class Accountant extends Employees implements PrintInfo{
    public Accountant(String name, String surname, String position) {
        super(name, surname, position);
    }

    @Override
    public void print(String position) {
        System.out.println("Position of accountant " + position);
    }
}
