import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.print("Enter the day(0-6): ");
        try {
            int dayIndex =obj.nextInt();
                String dayName = weekdays[dayIndex];
                System.out.println("position day :- " +dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds. Please enter a between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}