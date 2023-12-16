
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Integer> studentGrades = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    public static void removeStudent() {
        System.out.print("Enter student name to remove: ");
        String name = scanner.nextLine();
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed");
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

    public static void displayGrade() {
        System.out.print("Enter student name to display grade: ");
        String name = scanner.nextLine();
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade for " + name + ": " + grade);
        } else {
            System.out.println("Student " + name + " not found");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n chosse any opertaion press(0-4)" + "\n1. Add Student\n2. Remove Student\n3. Display Grade\n4. Exit");
            System.out.print("Enter your number: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    displayGrade();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. ");
            }
        }
    }
}