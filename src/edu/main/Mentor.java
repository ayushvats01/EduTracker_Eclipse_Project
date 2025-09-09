package edu.main;

/**
 * Mentor class with fields name and dept.
 * Contains a method assignMentor(Student s) which assigns this mentor to the student.
 */
public class Mentor {
    private String name;
    private String dept;

    public Mentor(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    // assign this mentor to the given student (object passed as parameter)
    public void assignMentor(Student s) {
        // uses Student's public setter to assign mentor
        s.setMentor(this);
    }

    public String getName() { return this.name; }
    public String getDept() { return this.dept; }

    @Override
    public String toString() {
        return "Mentor[name=" + name + ", dept=" + dept + "]";
    }
}
