import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateStr = scanner.nextLine();
        LocalDate birthdate = LocalDate.parse(birthdateStr);
        Period age = Period.between(birthdate, LocalDate.now());

        System.out.printf("%d years, %d months, %d days%n",
                age.getYears(), age.getMonths(), age.getDays());
    }
}

