package Vehicles;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carDetails = scanner.nextLine().split("\\s+");
        String[] truckDetails = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(scanner.nextLine());

        Car car = new Car(Double.parseDouble(carDetails[1]), Double.parseDouble(carDetails[2]));
        Truck truck = new Truck(Double.parseDouble(truckDetails[1]), Double.parseDouble(truckDetails[2]));

        while (N-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            switch (input[0]) {
                case "Drive":
                    if (input[1].equals("Car")) {
                        String result = car.drive(Double.parseDouble(input[2]));
                        System.out.println(result);
                    } else {
                        String result = truck.drive(Double.parseDouble(input[2]));
                        System.out.println(result);
                    }
                    break;
                case "Refuel":
                    if (input[1].equals("Car")) {
                        car.refuel(Double.parseDouble(input[2]));
                    } else {
                        truck.refuel(Double.parseDouble(input[2]));
                    }
                    break;
            }

        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        decimalFormat.setRoundingMode(RoundingMode.UP);
        System.out.println("Car: " + decimalFormat.format(car.getFuelQuantity()));
        System.out.println("Truck: " + decimalFormat.format(truck.getFuelQuantity()));

    }
}
