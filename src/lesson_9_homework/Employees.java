package lesson_9_homework;

public class Employees {
    public Employees(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    private String name;
    private String surname;
    private String position;

    public String getPosition() {
        return position;
    }
}
