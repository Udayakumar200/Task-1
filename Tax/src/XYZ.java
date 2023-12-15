import java.util.Scanner;
public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting employee information
        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Employee Salary: ");
        double empSalary = scanner.nextDouble();

        // Creating Employee object
        Employee employee = new Employee(empId, empName, empSalary);

        // Accepting product information
        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Product Price: ");
        double productPrice = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int productQuantity = scanner.nextInt();

        // Creating Product object
        Product product = new Product(productId, productPrice, productQuantity);

        // Calculating and printing taxes
        System.out.println("\nIncome Tax for Employee: " + employee.calcTax());
        System.out.println("Sales Tax for Product: " + product.calcTax());

    }
}


