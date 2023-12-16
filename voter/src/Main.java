import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Voter ID: ");
            String voterId = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            Voter voter = new Voter(voterId, name, age);
            System.out.println("\nCan vote\nVoterDetails :\n" + voter);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {

        }
    }
}
