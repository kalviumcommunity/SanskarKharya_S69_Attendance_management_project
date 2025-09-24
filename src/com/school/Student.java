// src/com/school/Student.java

package com.school;

public class Student extends Person {
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        super(name); // Calls Person constructor, auto-assigns id and name
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Prints ID and name
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Role: Student");
    }
}
