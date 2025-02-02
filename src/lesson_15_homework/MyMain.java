package lesson_15_homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MyMain {
    public static void main(String[] args) {
        //Task1();
        //Task2();
    }

    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------ Task1 ------------");
        System.out.println("Enter a set of numbers");
        String str = scanner.nextLine();

        String[] numbers = str.split("\\s");
        Set<String> setUniqueNumbers = new HashSet<>(Arrays.asList(numbers));

        System.out.println("Unique numbers: " + setUniqueNumbers);
    }

    public static void Task2() {
        SetAnimals setAnimals = new SetAnimals();
        System.out.println("------------ Task2 ------------");
        setAnimals.addAnimal("Lion");
        setAnimals.addAnimal("Tiger");
        setAnimals.addAnimal("Rabbit");

        System.out.println("Animals in the collection: " + setAnimals.getAnimalNames());

        setAnimals.removeAnimal();
        System.out.println("Animals in the collection after removal: " + setAnimals.getAnimalNames());
    }


}
