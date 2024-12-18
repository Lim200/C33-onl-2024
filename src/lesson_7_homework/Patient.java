package lesson_7_homework;

public class Patient {
    private String surname;
    private int treatmentPlan;
    private String doctor;
    private String name;

    public Patient(String name, String surname, int treatmentPlan, String doctor) {
        this.name = name;
        this.surname = surname;
        this.treatmentPlan = treatmentPlan;
        this.doctor = doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getSurname() {
        return surname;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getName() {
        return name;
    }

}
