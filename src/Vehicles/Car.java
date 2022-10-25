package Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    private final double fuelConsumptionPerKm = super.getFuelConsumption() + 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    String drive(double distance) {
        double traveled = distance * fuelConsumptionPerKm;
        if (traveled < super.getFuelQuantity()) {
            double littler = super.getFuelQuantity() - traveled;
            super.setFuelQuantity(littler);
            return "Car travelled " + decimalFormat.format(distance) + " km";
        }
        return "Car needs refueling";

    }

    @Override
    void refuel(double litters) {
        double added = super.getFuelQuantity() + litters;
        super.setFuelQuantity(added);
    }
}
