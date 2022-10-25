package VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle {

    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity, boolean isEmpty) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.isEmpty = isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    String drive(double distance) {
        double traveled = 0;
        if (isEmpty) {
            traveled = distance * this.getFuelConsumption();
        } else {
            traveled = distance * (this.getFuelConsumption() + 1.4);
        }
        if (traveled < super.getFuelQuantity()) {
            double littler = this.getFuelQuantity() - traveled;
            this.setFuelQuantity(littler);
            return "Bus travelled " + decimalFormat.format(distance) + " km";
        }
        return "Bus needs refueling";
    }

    @Override
    String refuel(double litters) {
        if (litters <= 0) {
            return "Fuel must be a positive number";
        }
        double added = this.getFuelQuantity() + litters;
        if (added > this.getTankCapacity()) {
            return "Cannot fit fuel in tank";
        }
        this.setFuelQuantity(added);
        return null;
    }

}
