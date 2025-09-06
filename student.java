import java.util.Scanner;

public class student {
    String rollNo;
    String name;
    String course;
    double marks;
    String grade;

    public void inputStudent(Scanner sc) {
        System.out.print("Enter roll number: ");
        rollNo = sc.nextLine();

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter course: ");
        course = sc.nextLine();

        System.out.print("Enter marks: ");
        marks = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        calculateGrade();
    }

    public void calculateGrade() {
        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B";
        else if (marks >= 60) grade = "C";
        else if (marks >= 50) grade = "D";
        else grade = "F";
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------------");
    }

    // ✅ Add this so you can run it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        s1.inputStudent(sc);
        s1.displayStudent();
        sc.close();
    }
}
