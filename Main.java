package application;
	
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.println("\n--- Add Student ---");

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        // Check if the ID already exists
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                System.out.println("Error: A student with this ID already exists.");
                return;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Grade/Class: ");
        String grade = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Contact Information: ");
        String contact = scanner.nextLine();

        // Create a new Student object and add it to the list
        Student student = new Student(id, name, grade, address, contact);
        studentList.add(student);

        System.out.println("Student added successfully!");
    }

    private static void viewStudents() {
        System.out.println("\n--- View Students ---");
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
                System.out.println("----------------------");
            }
        }
    }

    private static void searchStudent(Scanner scanner) {
        System.out.println("\n--- Search Student ---");
        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                System.out.println("Student found:\n" + student);
                return;
            }
        }

        System.out.println("No student found with ID: " + id);
    }
}
