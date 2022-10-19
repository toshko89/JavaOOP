package PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        try {
            this.toppingType = String.valueOf(ToppingsModifiers.valueOf(toppingType));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String
                    .format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        final double toppingsModifiers = ToppingsModifiers.valueOf(this.toppingType).getModifier();
        return (2 * this.weight) * toppingsModifiers;
    }
}
