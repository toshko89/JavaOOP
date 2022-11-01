package WildFarm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] animalTokens = input.split("\\s+");
            String[] foodTokens = scanner.nextLine().split("\\s+");

            Animal animal = createAnimal(animalTokens);
            Food food = createFood(foodTokens);

            animal.makeSound();
            animal.eat(food);

            animals.add(animal);

            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static Food createFood(String[] foodTokens) {
        String type = foodTokens[0];
        int quantity = Integer.parseInt(foodTokens[1]);

        switch (type) {
            case "Vegetable":
                return new Vegetable(quantity);
            case "Meat":
                return new Meat(quantity);
            default:
                return null;
        }
    }

    private static Animal createAnimal(String[] animalTokens) {
        String type = animalTokens[0];
        String name = animalTokens[1];
        double weight = Double.parseDouble(animalTokens[2]);
        String livingRegion = animalTokens[3];

        switch (type) {
            case "Mouse":
                return new Mouse(name, type, weight, livingRegion);
            case "Zebra":
                return new Zebra(name, weight, livingRegion);
            case "Cat":
                String breed = animalTokens[4];
                return new Cat(name, type, weight, livingRegion, breed);
            case "Tiger":
                return new Tiger(name, type, weight, livingRegion);
            default:
                return null;
        }
    }
}
