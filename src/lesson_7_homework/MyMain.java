package lesson_7_homework;

public class MyMain {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Alex", "Ivanov");
        Therapist therapist = new Therapist("Emma", "Watson");
        Dentist dentist = new Dentist("Michael", "Johnson");

        Clinic clinic1 = new Clinic(surgeon, therapist, dentist);

        Patient patient1 = new Patient("Ivan", "Li", 0, "Therapist");
        Patient patient2 = new Patient("Olga", "Petrova", 1, "Surgeon");
        Patient patient3 = new Patient("John", "Len", 2, "Dentist");

        System.out.println("\nTreating Patient 1:" + patient1.getName() + " " + patient1.getSurname());
        therapist.setTreatmentPlan(patient1, surgeon, dentist, therapist);

        System.out.println("\nTreating Patient 2:" + patient1.getName() + " " + patient1.getSurname());
        therapist.setTreatmentPlan(patient2, surgeon, dentist, therapist);

        System.out.println("\nTreating Patient 3:" + patient1.getName() + " " + patient1.getSurname());
        therapist.setTreatmentPlan(patient3, surgeon, dentist, therapist);

    }
}
