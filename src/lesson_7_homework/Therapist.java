package lesson_7_homework;

import java.util.Random;

public class Therapist extends Doctor {
    public Therapist(String name, String surname) {
        super(name, surname);
    }

    public void treat() {
        System.out.println("The therapist treats");
    }

    public void setTreatmentPlan(Patient patient) {
        int treatmentPlan = patient.getTreatmentPlan();
        Doctor setDoctor;

        if(treatmentPlan == 1) {
//            setDoctor = sergeon
        }
    }

}
