import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double purchaseAmount = obj.nextDouble();

        double discount = 0;

        if(purchaseAmount< 500){
            System.out.println("No discount");

        }
        else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 0.1; // 10% discount
            System.out.println("10% discount");

        } else if (purchaseAmount > 1000) {
            discount = 0.2; // 20% discount
            System.out.println("20 % discount");

        }

        double discountedAmount = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Final payable amount after discount: " + discountedAmount);
    }
}






