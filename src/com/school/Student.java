// src/com/school/Student.java

package com.school;

public class Student {
    // Static counter for auto-ID generation
    private static int nextStudentIdCounter = 1;

    // Fields (encapsulated: private)
    private int studentId;
    private String name;
    private int age;

    // Constructor (auto-generates studentId)
    public Student(String name, int age) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
        this.age = age;
    }

    // Getters (Encapsulation: only getters are public)
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Optional: we don’t expose age with a getter in this part
    // but you can add if needed:
    // public int getAge() { return age; }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student ID: S" + studentId + ", Name: " + name + ", Age: " + age);
    }
}
