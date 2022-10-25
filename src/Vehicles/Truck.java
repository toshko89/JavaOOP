package Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    private final double fuelConsumptionPerKm = super.getFuelConsumption() + 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    @Override
    String drive(double distance) {
        double traveled = distance * fuelConsumptionPerKm;
        if (traveled < super.getFuelQuantity()) {
            double littler = super.getFuelQuantity() - traveled;
            super.setFuelQuantity(littler);
            return "Truck travelled " + decimalFormat.format(distance) + " km";
        }
        return "Truck needs refueling";
    }

    @Override
    void refuel(double litters) {
        double added = super.getFuelQuantity() + (litters * 0.95);
        super.setFuelQuantity(added);
    }
}
