package edu.main;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private int studentId;
    private String name;
    private float marks;
    private Mentor mentor;
    private List<String> achievements = new ArrayList<>();

    private final String collegeName = "IIT EduTracker"; // final instance variable
    public static int totalStudents = 0; // static variable shared across instances

    // Parameterized constructor
    public Student(int studentId, String name, float marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
        totalStudents++; // increment static counter in constructor
    }

    // Default constructor calling parameterized constructor using this(...)
    public Student() {
        this(0, "Unknown", 0.0f);
    }

    // Additional overloaded constructors
    public Student(int studentId) {
        this(studentId, "Unknown", 0.0f);
    }

    public Student(int studentId, String name) {
        this(studentId, name, 0.0f);
    }

    // Method to print student details
    public void showDetails() {
        System.out.println("Student Details -> ID: " + this.studentId + ", Name: " + this.name
                + ", Marks: " + this.marks + ", College: " + this.collegeName);
    }

    // Differentiating local vs instance variables: local 'grade' used below
    public void calculateGrade() {
        int grade; // local variable
        if (this.marks >= 90) {
            grade = 1; // 1 -> Grade A
        } else {
            grade = 2; // 2 -> Grade B
        }

        if (grade == 1) {
            System.out.println(this.name + " -> Grade A");
        } else {
            System.out.println(this.name + " -> Grade B");
        }
    }

    // Method overloading: updateMarks(float)
    public void updateMarks(float newMarks) {
        this.marks = newMarks;
    }

    // Method overloading: updateMarks(float[]) -> compute average
    public void updateMarks(float[] subjectMarks) {
        if (subjectMarks == null || subjectMarks.length == 0) return;
        float sum = 0.0f;
        for (float m : subjectMarks) sum += m;
        this.marks = sum / subjectMarks.length;
    }

    // Method returning whether student passed
    public boolean isPassed() {
        return this.marks >= 40.0f;
    }

    // Getter methods (public) so utils.StatusPrinter can access necessary info
    public int getStudentId() { return this.studentId; }
    public String getName() { return this.name; }
    public float getMarks() { return this.marks; }
    public String getCollegeName() { return this.collegeName; }
    public Mentor getMentor() { return this.mentor; }

    // Setter used by Mentor.assignMentor(Student s)
    public void setMentor(Mentor mentor) { this.mentor = mentor; }

    // Demonstrating immutability vs mutability:
    // 'name' (String) is immutable - there's no setter for name so it cannot be mutated via API.
    // 'achievements' (List) is mutable - we provide methods to manipulate it.
    public List<String> getAchievements() { return achievements; }
    public void addAchievement(String achievement) { achievements.add(achievement); }
}
