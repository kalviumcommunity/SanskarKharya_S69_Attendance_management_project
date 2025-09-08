# Attendance Management Project


This is Part 1 of the Attendance Management Project.  
It contains the basic setup and a simple Java program.

## How to Run
Compile: `javac src/com/school/Main.java`  
Run: `java -cp src com.school.Main`

## Part 2 - Core Domain Modelling
- Added `Student` and `Course` classes.
- Used arrays to store multiple objects.
- Displayed details of students and courses

## Part 3: Constructor Initialization & Auto-ID Generation
- Implemented parameterized constructors in `Student` and `Course` classes for object initialization.
- Utilized `private static` member variables for automatic and unique ID generation.
- Demonstrated the use of the `this` keyword to distinguish instance variables from constructor parameters.
- Changed `Course`'s `courseId` to `int` for simpler auto-generation and updated its display.
- Updated `Main.java` to use constructors and show ID progression.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac src/com/school/Student.java src/com/school/Course.java src/com/school/Main.java`
3. Run: `java -cp src com.school.Main`
