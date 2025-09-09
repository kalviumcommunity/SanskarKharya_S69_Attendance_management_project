// src/com/school/Course.java

package com.school;

public class Course {
    // Static counter for auto-ID generation
    private static int nextCourseIdCounter = 101;

    // Fields (encapsulated: private)
    private int courseId;
    private String courseName;
    private int credits;

    // Constructor (auto-generates courseId)
    public Course(String courseName, int credits) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getters (Encapsulation: only getters are public)
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    // Optional: getter for credits if needed later
    public int getCredits() {
        return credits;
    }

    // Method to display course details
    public void displayCourse() {
        System.out.println("Course ID: C" + courseId + ", Name: " + courseName + ", Credits: " + credits);
    }
}
