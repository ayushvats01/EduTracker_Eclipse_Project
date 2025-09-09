package edu.utils;

import edu.main.Student;


public class StatusPrinter {

    public void printStatus(Student s) {
        System.out.println("*---- Student Status -----*");
        System.out.println("ID: " + s.getStudentId());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("College: " + s.getCollegeName());
        System.out.println("Passed: " + s.isPassed());
        if (s.getMentor() != null) {
            System.out.println("Mentor: " + s.getMentor().getName() + " (" + s.getMentor().getDept() + ")");
        } else {
            System.out.println("Mentor: (not assigned)");
        }
        System.out.println("------------------------");
    }

    @Override
    public String toString() {
        return "StatusPrinter Utility (overridden toString)";
    }
}
