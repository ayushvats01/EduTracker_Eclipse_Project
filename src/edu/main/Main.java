package edu.main;

import edu.utils.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Total students before creation: " + Student.totalStudents);

        Student s1 = new Student(101, "Alice", 95.5f);
        Student s2 = new Student(102, "Bob", 85.0f);
        Student s3 = new Student(); // default constructor
        Student s4 = new Student(103); // id-only constructor
        Student s5 = new Student(104, "Charlie"); // id+name constructor

        System.out.println("Total students after creation: " + Student.totalStudents);
        System.out.println();

        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
        s4.showDetails();
        s5.showDetails();
        System.out.println();

        // calculate grade (uses a local 'grade' variable internally)
        s1.calculateGrade();
        s2.calculateGrade();

        // update marks using overloaded methods
        s3.updateMarks(42.0f);
        float[] subs = {70.0f, 75.0f, 80.0f};
        s4.updateMarks(subs);

        System.out.println(s3.getName() + " Passed? " + s3.isPassed());
        System.out.println(s4.getName() + " Marks ? " + s4.getMarks());
        System.out.println();

        // Mentor assignment (objects as parameters)
        Mentor m1 = new Mentor("Dr. Sharma", "Computer Science");
        m1.assignMentor(s1); // Mentor assigns themselves to student
        
        Mentor m2 = new Mentor("Dr. Verma", "Civil Engineering");
        m2.assignMentor(s2); // Mentor assigns themselves to student
        
        System.out.println("s1 mentor: " + s2.getMentor());
        System.out.println();

        // Demonstrate immutability vs mutability
        System.out.println("Name before: " + s1.getName());
        // There is no setter for name -> cannot mutate via public API (demonstrates immutability of String reference here)
        System.out.println("College : " + s1.getCollegeName());

        // Achievements list (mutable)
        s1.addAchievement("Won coding contest");
        List<String> ach = s1.getAchievements();
        ach.add("Member of robotics club"); // modifying mutable field externally
        System.out.println("Achievements (mutable) after modifications: " + s1.getAchievements());
        System.out.println();

        // Use utility from edu.utils
        StatusPrinter printer = new StatusPrinter();
        printer.printStatus(s1);
        System.out.println("Printer toString(): " + printer.toString());
    }
}
