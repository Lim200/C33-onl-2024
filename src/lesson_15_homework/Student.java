package lesson_15_homework;

import java.util.Iterator;
import java.util.List;

public class Student {


    private String name;
    private String group;
    private int course;
    private List<Integer> subjectGrades;



    public Student(String name, String group, int course, List<Integer> subjectGrades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjectGrades = subjectGrades;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getSubjectGrades() {
        return subjectGrades;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        if (subjectGrades.isEmpty()) return 0.0;
        int sum = 0;
        for(int grade:subjectGrades) {
            sum +=grade;
        }
        return (double) sum / subjectGrades.size();
    }

    public static void removeTransferStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
}


