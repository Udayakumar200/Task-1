import java.util.Scanner;
class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Enter Pid: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        int highestPricePid = findHighestPricePid(products);
        System.out.println("Pid of the product with the highest price: " + highestPricePid);

        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }

    public static int findHighestPricePid(Product[] products) {
        int highestPricePid = -1;
        double highestPrice = Double.MIN_VALUE;

        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.pid;
            }
        }

        return highestPricePid;
    }

    // Method to calculate and return the total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.getPrice() * product.getQuantity();
        }

        return totalAmountSpent;
    }
}
