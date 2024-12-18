package lesson_7_homework;

public class Dentist extends Doctor{
    public Dentist(String name, String surname) {
        super(name, surname);
    }

    public void treat() {
        System.out.println("The dentist treats");
    }
}
