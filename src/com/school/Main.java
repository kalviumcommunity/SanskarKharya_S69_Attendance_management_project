// src/com/school/Main.java

package com.school;

import java.util.ArrayList;
import java.util.List;

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

        // Attendance records log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Add attendance records (valid + invalid)
        AttendanceRecord record1 = new AttendanceRecord(students[0].getStudentId(), courses[0].getCourseId(), "Present");
        AttendanceRecord record2 = new AttendanceRecord(students[1].getStudentId(), courses[1].getCourseId(), "Absent");
        AttendanceRecord record3 = new AttendanceRecord(students[2].getStudentId(), courses[0].getCourseId(), "Late"); // Invalid

        attendanceLog.add(record1);
        attendanceLog.add(record2);
        attendanceLog.add(record3);

        // Display attendance records
        System.out.println("---- Attendance Records ----");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
