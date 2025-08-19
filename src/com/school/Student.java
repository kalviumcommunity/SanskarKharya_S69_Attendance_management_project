public class Student {
    // Fields
    int id;
    String name;
    int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
