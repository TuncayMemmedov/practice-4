package Shapesistemi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){            //9

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Shape: ");
            String shapeName = scanner.nextLine();

            Shape shape;

            if (shapeName.equalsIgnoreCase("circle")) {

                System.out.print("Radius: ");
                String radiusInput = scanner.nextLine();

                double radius = Double.parseDouble(radiusInput);

                shape = new Circle(radius);

            } else {

                throw new IllegalArgumentException();
            }

            System.out.println("Area: " + shape.calculateArea());

        } catch (NumberFormatException e) {


            System.out.println("Rəqəm düzgün daxil edilməyib!");

        } catch (IllegalArgumentException e) {

            System.out.println("Dəstəklənməyən shape!");

        }

    }
}
