package lesson_7_homework;

import java.util.Random;

public class Therapist extends Doctor {
    public Therapist(String name, String surname) {
        super(name, surname);
    }

    public void treat() {
        System.out.println("The therapist treats");
    }

    public void setTreatmentPlan(Patient patient, Surgeon surgeon, Dentist dentist, Therapist therapist) {
        int treatmentPlan = patient.getTreatmentPlan();
        Doctor setDoctor;

        if(treatmentPlan == 1) {
            setDoctor = surgeon;
            System.out.println("Assigned Surgeon: " + setDoctor.getName() + " " + setDoctor.getSurname());
            surgeon.treat();
        } else if (treatmentPlan == 2) {
            setDoctor = dentist;
            System.out.println("Assigned Dentist: " + setDoctor.getName() + " " + setDoctor.getSurname());
            dentist.treat();
        } else {
            setDoctor = therapist;
            System.out.println("Assigned Therapist: " + setDoctor.getName() + " " + setDoctor.getSurname());
            therapist.treat();
        }

        patient.setDoctor(String.valueOf(setDoctor));
    }

}
