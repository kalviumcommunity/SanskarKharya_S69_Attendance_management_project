// src/com/school/Student.java

package com.school;

public class Student {
    // Static counter for auto-ID generation
    private static int nextStudentIdCounter = 1;

    // Fields
    private int id;
    private String name;
    private int age;

    // Constructor (auto-generates ID)
    public Student(String name, int age) {
        this.id = nextStudentIdCounter++;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student ID: S" + id + ", Name: " + name + ", Age: " + age);
    }
}
