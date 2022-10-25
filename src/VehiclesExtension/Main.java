package VehiclesExtension;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carDetails = scanner.nextLine().split("\\s+");
        String[] truckDetails = scanner.nextLine().split("\\s+");
        String[] busDetails = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(scanner.nextLine());

        Car car = new Car(Double.parseDouble(carDetails[1]), Double.parseDouble(carDetails[2]), Double.parseDouble(carDetails[3]));
        Truck truck = new Truck(Double.parseDouble(truckDetails[1]), Double.parseDouble(truckDetails[2]), Double.parseDouble(carDetails[3]));
        Bus bus = new Bus(Double.parseDouble(busDetails[1]), Double.parseDouble(busDetails[2]), Double.parseDouble(busDetails[3]), false);

        while (N-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            switch (input[0]) {
                case "Drive":
                    if (input[1].equals("Car")) {
                        String result = car.drive(Double.parseDouble(input[2]));
                        System.out.println(result);
                    } else if (input[1].equals("Truck")) {
                        String result = truck.drive(Double.parseDouble(input[2]));
                        System.out.println(result);
                    } else {
                        String result = bus.drive(Double.parseDouble(input[2]));
                        System.out.println(result);
                    }
                    break;
                case "Refuel":
                    if (input[1].equals("Car")) {
                        String result = car.refuel(Double.parseDouble(input[2]));
                        if (result != null) {
                            System.out.println(result);
                        }
                    } else if (input[1].equals("Truck")) {
                        String result = truck.refuel(Double.parseDouble(input[2]));
                        if (result != null) {
                            System.out.println(result);
                        }
                    } else {
                        String result = bus.refuel(Double.parseDouble(input[2]));
                        if (result != null) {
                            System.out.println(result);
                        }
                    }
                    break;
                case "DriveEmpty":
                    bus.setEmpty(true);
                    String result = bus.drive(Double.parseDouble(input[2]));
                    System.out.println(result);
                    break;
            }


        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        System.out.println("Car: " + decimalFormat.format(car.getFuelQuantity()));
        System.out.println("Truck: " + decimalFormat.format(truck.getFuelQuantity()));
        System.out.println("Bus: " + decimalFormat.format(bus.getFuelQuantity()));

    }
}
