import java.util.Scanner;

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    int employeeID;
    double salary;

    // Constructor for Employee using super to initialize Person attributes
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Using super to call the constructor of the superclass (Person)
        this.employeeID = employeeID;
        this.salary = salary;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Person attributes
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Taking input for Employee attributes
        System.out.print("Enter employeeID: ");
        int employeeID = scanner.nextInt();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        // Creating an Employee object
        Employee employee = new Employee(name, age, employeeID, salary);

        // Displaying information
        System.out.println("\nEmployee Information:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Employee ID: " + employee.employeeID);
        System.out.println("Salary: " + employee.salary);

    }
}
