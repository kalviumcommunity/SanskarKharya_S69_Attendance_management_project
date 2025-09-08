// src/com/school/Main.java

package com.school;

public class Main {
    public static void main(String[] args) {
        // Create array of students using auto-generated IDs
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 21);

        // Create array of courses using auto-generated IDs
        Course[] courses = new Course[2];
        courses[0] = new Course("Mathematics", 4);
        courses[1] = new Course("Computer Science", 3);

        // Display all students
        System.out.println("---- Students ----");
        for (Student student : students) {
            student.displayStudent();
        }

        // Display all courses
        System.out.println("---- Courses ----");
        for (Course course : courses) {
            course.displayCourse();
        }
    }
}
