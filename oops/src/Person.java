import java.util.Scanner;
public class Person {
    private String name;
    private int age;

    // Default constructor with default age 18
    public Person() {
        this.age = 18;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a for deafult person:");
        String defaultName = obj.nextLine();
        Person defaultPerson = new Person(defaultName,18);
        defaultPerson.displayInfo();
        System.out.println("Enter a for custom person:");
        String customName = obj.nextLine();
        System.out.println("Enter a for custom age :");
        int customAge = obj.nextInt();

        Person customPerson = new Person(customName,customAge);
        customPerson.displayInfo();
    }
}