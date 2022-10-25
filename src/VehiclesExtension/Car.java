package VehiclesExtension;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    private final double fuelConsumptionPerKm = super.getFuelConsumption() + 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    String drive(double distance) {
        double traveled = distance * fuelConsumptionPerKm;
        if (traveled < this.getFuelQuantity()) {
            double littler = this.getFuelQuantity() - traveled;
            this.setFuelQuantity(littler);
            return "Car travelled " + decimalFormat.format(distance) + " km";
        }
        return "Car needs refueling";

    }

    @Override
    String refuel(double litters) {
        if (litters <= 0) {
            return "Fuel must be a positive number";
        }
        double added = this.getFuelQuantity() + litters;
        if(added > this.getTankCapacity()){
            return "Cannot fit fuel in tank";
        }
        this.setFuelQuantity(added);
        return null;
    }
}
