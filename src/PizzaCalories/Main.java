package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pizza pizza = null;
        Dough dough = null;
        Topping topping = null;

        try {
            while (!input.equals("END")) {
                String[] values = input.split(" ");
                if (values[0].equals("Pizza")) {
                    pizza = new Pizza(values[1], Integer.parseInt(values[2]));
                } else if (values[0].equals("Dough")) {
                    dough = new Dough(values[1], values[2], Double.parseDouble(values[3]));
                    pizza.setDough(dough);
                } else if (values[0].equals("Topping")) {
                    topping = new Topping(values[1], Double.parseDouble(values[2]));
                    pizza.addTopping(topping);
                }

                input = scanner.nextLine();
            }
            double cal = pizza.getOverallCalories();
            System.out.printf("%s - %.2f",pizza.getName(),cal);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
