package lesson_7_homework;

public class MyMain {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Alex", "Ivanov");
        Therapist therapist = new Therapist("Emma", "Watson");
        Dentist dentist = new Dentist("Michael", "Johnson");


        Сlinic clinic = new Сlinic(surgeon, therapist, dentist);

        Patient patient1 = new Patient("Ivan", "Li", 0, "Therapist");
        Patient patient2 = new Patient("Olga", "Petranova", 1, "Surgeon");
        Patient patient3 = new Patient("John", "Smith", 2, "Dentist");




    }
}
