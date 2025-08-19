

public class Course {
    // Fields
    int courseId;
    String courseName;
    int credits;

    // Constructor
    public Course(int courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Method to display course details
    public void displayCourse() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName + ", Credits: " + credits);
    }
}
