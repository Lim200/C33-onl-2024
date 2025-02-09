package lesson_15_homework;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        Task1();
        Task2();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan","Group1", 1, Arrays.asList(0,1,2,3)));
        students.add(new Student("Masha","Group2", 1, Arrays.asList(9,5,8,5)));
        students.add(new Student("Dima","Group3", 1, Arrays.asList(8,8,9,5)));

        Student.removeTransferStudents(students);
        printStudents(students, 2);
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

    public static void printStudents(List<Student> students, int course) {
        System.out.println("------------ Task3 ------------");
        for (Student student:students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }


}
