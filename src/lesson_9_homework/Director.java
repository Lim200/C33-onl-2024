package lesson_9_homework;

public class Director extends Employees implements PrintInfo{
    public Director(String name, String surname, String position) {
        super(name, surname, position);
    }

    @Override
    public void print(String position) {
        System.out.println("Position of director " + position);

    }
}
