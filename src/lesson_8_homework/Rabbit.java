package lesson_8_homework;

public class Rabbit extends Animal {
    public Rabbit(String name, int age, String color, int height) {
        super(name, age, color, height);
    }

    @Override
    public void voice() {
        System.out.println("The rabbit squeaks");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("I don't like meat!");
        } else {
            System.out.println("I like grass");
        }
    }
}
