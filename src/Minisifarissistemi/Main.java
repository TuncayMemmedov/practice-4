package Minisifarissistemi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {          //10

        Scanner scanner = new Scanner(System.in);

        List<OrderItem> orders = new ArrayList<>();

        System.out.print("Məhsul sayı: ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {

            try {

                System.out.println("\n--- " + (i + 1) + ". məhsul ---");

                System.out.print("Məhsul tipi: ");
                String type = scanner.nextLine();

                if (type.equalsIgnoreCase("product")) {

                    System.out.print("Price: ");
                    String price = scanner.nextLine();

                    System.out.print("Quantity: ");
                    String quantity = scanner.nextLine();

                    double p = Double.parseDouble(price);
                    double q = Double.parseDouble(quantity);

                    if (p <= 0) {
                        throw new IllegalArgumentException("Qiymət 0-dan böyük olmalıdır!");
                    }

                    if (q <= 0) {
                        throw new IllegalArgumentException("Quantity 0-dan böyük olmalıdır!");
                    }

                    orders.add(new Product(price, quantity));

                } else if (type.equalsIgnoreCase("discounted")) {

                    System.out.print("Price: ");
                    String price = scanner.nextLine();

                    System.out.print("Quantity: ");
                    String quantity = scanner.nextLine();

                    System.out.print("Discount: ");
                    String discount = scanner.nextLine();

                    double p = Double.parseDouble(price);
                    double q = Double.parseDouble(quantity);

                    if (p <= 0) {
                        throw new IllegalArgumentException("Qiymət 0-dan böyük olmalıdır!");
                    }

                    if (q <= 0) {
                        throw new IllegalArgumentException("Quantity 0-dan böyük olmalıdır!");
                    }

                    orders.add(new DiscountedProduct(price, quantity, discount));

                } else if (type.equalsIgnoreCase("subscription")) {

                    System.out.print("Monthly price: ");
                    String monthlyPrice = scanner.nextLine();

                    double p = Double.parseDouble(monthlyPrice);

                    if (p <= 0) {
                        throw new IllegalArgumentException("Qiymət 0-dan böyük olmalıdır!");
                    }

                    orders.add(new Subscription(monthlyPrice));

                } else {

                    throw new IllegalArgumentException(
                            "Tanınmayan məhsul tipi!"
                    );
                }

            } catch (NumberFormatException e) {

                System.out.println("Rəqəm düzgün daxil edilməyib!");

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            }
        }

        double total = 0;

        for (OrderItem order : orders) {

            total += order.calculatePrice();
        }

        System.out.println("\nÜmumi qiymət: " + total);
    }
}
