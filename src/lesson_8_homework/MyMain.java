package lesson_8_homework;
//import lesson_8_homework.Animal.*;

public class MyMain {
    public static void main(String[] args) {
        Animal dog = new Dog("Gav", 3, "black", 6);
        Animal tiger = new Tiger("Sharkhan", 10, "yellow", 120);
        Animal rabbit = new Rabbit("Rodger", 5, "white", 3);

        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");

        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");

        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Grass");


    }

}
