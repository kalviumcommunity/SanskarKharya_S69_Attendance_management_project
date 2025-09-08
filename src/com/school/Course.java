// src/com/school/Course.java

package com.school;

public class Course {
    // Static counter for auto-ID generation
    private static int nextCourseIdCounter = 101;

    // Fields
    private int courseId;
    private String courseName;
    private int credits;

    // Constructor (auto-generates courseId)
    public Course(String courseName, int credits) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Method to display course details
    public void displayCourse() {
        System.out.println("Course ID: C" + courseId + ", Name: " + courseName + ", Credits: " + credits);
    }
}
