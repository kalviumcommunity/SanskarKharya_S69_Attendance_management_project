// school/AttendanceRecord.java
package com.school;

public class AttendanceRecord {
    private int studentId;

    public AttendanceRecord(int studentId) {
        this.studentId = studentId;
    }

    public void printRecord() {
        System.out.println("Attendance recorded for Student ID: " + studentId);
    }
}
