import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }
        List<String> aStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("Students whose names start with 'A': " + aStudents);
    }
}
