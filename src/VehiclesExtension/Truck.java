package VehiclesExtension;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    private final double fuelConsumptionPerKm = super.getFuelConsumption() + 1.6;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    String drive(double distance) {
        double traveled = distance * fuelConsumptionPerKm;
        if (traveled < this.getFuelQuantity()) {
            double littler = this.getFuelQuantity() - traveled;
            this.setFuelQuantity(littler);
            return "Truck travelled " + decimalFormat.format(distance) + " km";
        }
        return "Truck needs refueling";
    }

    @Override
    String refuel(double litters) {
        if (litters <= 0) {
            return "Fuel must be a positive number";
        }
        double added = this.getFuelQuantity() + (litters * 0.95);
        if (added > this.getTankCapacity()) {
            return "Cannot fit fuel in tank";
        }
        this.setFuelQuantity(added);
        return null;
    }
}
