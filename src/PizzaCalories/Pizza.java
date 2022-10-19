package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
        this.toppings = new ArrayList<>();
    }

    private void setToppings(int toppings) {
        if (toppings < 0 || toppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() < 1 || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDough(Dough dough) {
        this.dought = dough;
    }

    public void addTopping(Topping topping) {
        if (this.toppings.size() < 10) {
            this.toppings.add(topping);
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public double getOverallCalories() {
        return dought.calculateCalories() + toppings.stream()
                .mapToDouble(Topping::calculateCalories).sum();
    }
}
