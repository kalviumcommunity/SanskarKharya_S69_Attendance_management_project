// src/com/school/Main.java

package com.school;

public class Main {
    public static void main(String[] args) {
        // Create Student, Teacher, and Staff objects
        Student student = new Student("Alice", "12th Grade");
        Teacher teacher = new Teacher("Dr. Rydhm Beri", "Computer Science");
        Staff staff = new Staff("Princy", "Administrator");

        // Display details for each
        System.out.println("---- Student Details ----");
        student.displayDetails();
        System.out.println();

        System.out.println("---- Teacher Details ----");
        teacher.displayDetails();
        System.out.println();

        System.out.println("---- Staff Details ----");
        staff.displayDetails();
        System.out.println();

        // Example: Using student.getId() in AttendanceRecord
        AttendanceRecord record = new AttendanceRecord(student.getId());
        record.printRecord();
    }
}
