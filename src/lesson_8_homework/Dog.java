package lesson_8_homework;

public class Dog extends Animal {

    public Dog(String name, int age, String color, int height) {
        super(name, age, color, height);
    }

    @Override
    public void voice() {
        System.out.println("The dog is barking");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("I like meat!");
        } else {
            System.out.println("I don't like grass");
        }
    }
}
