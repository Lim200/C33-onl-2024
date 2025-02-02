package lesson_15_homework;

import java.util.LinkedList;

public class SetAnimals {

    private LinkedList<String> animalNames;

    public SetAnimals() {
        this.animalNames = new LinkedList<>();
    }

    public void addAnimal(String animal){
        animalNames.addFirst(animal);
    }

    public void removeAnimal(){
        animalNames.removeLast();
    }

    public LinkedList<String> getAnimalNames() {
        return animalNames;
    }
}
