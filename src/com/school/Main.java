package com.school;

public class Main {
    public static void main(String[] args) {
        // Create array of students
        Student[] students = new Student[3];
        students[0] = new Student(1, "Alice", 20);
        students[1] = new Student(2, "Bob", 22);
        students[2] = new Student(3, "Charlie", 21);

        // Create array of courses
        Course[] courses = new Course[2];
        courses[0] = new Course(101, "Mathematics", 4);
        courses[1] = new Course(102, "Computer Science", 3);

        // Display all students
        System.out.println("---- Students ----");
        for (int i = 0; i < students.length; i++) {
            students[i].displayStudent();
        }

        // Display all courses
        System.out.println("---- Courses ----");
        for (int i = 0; i < courses.length; i++) {
            courses[i].displayCourse();
        }
    }
}
