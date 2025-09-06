import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private String course;
    private double marks;
    private char grade;

    public Student() {
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private char calculateGrade(double marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    public void displayStudent() {
        System.out.println("\n" + "-".repeat(30));
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + grade);
        System.out.println("-".repeat(30));
    }
}

public class StudentRecordManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentRecords = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Student Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            String choice = scanner.next();
            scanner.nextLine(); 

            switch (choice) {
                case "1":
                    try {
                        Student student = new Student();

                        System.out.print("\nEnter Roll Number: ");
                        int rollNo = scanner.nextInt();
                        scanner.nextLine(); 

                        boolean exists = false;
                        for (Student s : studentRecords) {
                            if (s.getRollNumber() == rollNo) {
                                exists = true;
                                break;
                            }
                        }

                        if (exists) {
                            System.out.println("A student with this roll number already exists.");
                            continue;
                        }
                        student.setRollNumber(rollNo);

                        System.out.print("Enter Name: ");
                        student.setName(scanner.nextLine());

                        System.out.print("Enter Course: ");
                        student.setCourse(scanner.nextLine());

                        System.out.print("Enter Marks: ");
                        student.setMarks(scanner.nextDouble());
                        scanner.nextLine(); 

                        studentRecords.add(student);
                        System.out.println("\nStudent record added successfully!");

                    } catch (InputMismatchException e) {
                        System.out.println("\nInvalid input. Please enter a numeric value for Roll Number or Marks.");
                        scanner.nextLine(); 
                    }
                    break;

                case "2":
                    if (studentRecords.isEmpty()) {
                        System.out.println("\nNo records to display. Please add a student first.");
                    } else {
                        System.out.println("\n--- Displaying All Student Records ---");
                        for (Student s : studentRecords) {
                            s.displayStudent();
                        }
                    }
                    break;

                case "3":
                    System.out.println("\nThank you for using the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 3.");
                    break;
            }
        }
    }
}