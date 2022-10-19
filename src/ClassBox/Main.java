package ClassBox;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        double length = input;
        input = Double.parseDouble(scanner.nextLine());
        double width = input;
        input = Double.parseDouble(scanner.nextLine());
        double height = input;

        try {
            Box box = new Box(length, width, height);
            System.out.printf("Surface Area - %.2f", box.calculateSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f", box.calculateLateralSurfaceArea());
            System.out.printf("Volume – %.2f", box.calculateVolume());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }
}
