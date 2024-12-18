package lesson_7_homework;

public class Surgeon extends Doctor{
      public Surgeon(String name, String surname) {
        super(name, surname);
    }

    public void treat() {
        System.out.println("The surgeon treats");
    }
}
