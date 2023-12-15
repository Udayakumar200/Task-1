import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if (a >= 0) {
            System.out.println("positive number");

        } else {
            System.out.println("Negative number");
        }
    }
}