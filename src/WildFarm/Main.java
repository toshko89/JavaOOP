package WildFarm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        List<Animal> animals = new ArrayList<>();
        List<Food> foods = new ArrayList<>();

        while (!input.equals("End")) {
            String[] aminalData = input.split("\\s+");
            String animalType = aminalData[0];
            if (count % 2 == 0) {
                switch (animalType) {
                    case "Cat":
                        Cat cat = new Cat(aminalData[1],
                                Double.parseDouble(aminalData[2]), aminalData[3], aminalData[4]);
                        animals.add(cat);
                        break;
                    case "Tiger":
                        Tiger tiger = new Tiger(aminalData[1],
                                Double.parseDouble(aminalData[2]), aminalData[3]);
                        animals.add(tiger);
                        break;
                    case "Mouse":
                        Mouse mouse = new Mouse(aminalData[1],
                                Double.parseDouble(aminalData[2]), aminalData[3]);
                        animals.add(mouse);
                        break;
                    case "Zebra":
                        Zebra zebra = new Zebra(aminalData[1],
                                Double.parseDouble(aminalData[2]), aminalData[3]);
                        animals.add(zebra);
                        break;
                }
            } else {
                switch (animalType) {
                    case "Vegetable":
                        Vegetable vegetable = new Vegetable(Integer.parseInt(aminalData[1]));
                        foods.add(vegetable);
                        break;
                    case "Meat":
                        Meat meat = new Meat(Integer.parseInt(aminalData[1]));
                        foods.add(meat);
                        break;
                }
            }
            count++;
            input = scanner.nextLine();
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        for (Animal animal : animals) {
            animal.makeSound();
            for (Food food : foods) {
                animal.eat(food);
            }
            if (animal.getAnimalType().equals("Cats")) {
                Cat cat = (Cat) animal;
                System.out.printf("%s[%s, %s, %s, %s, %d]",
                        cat.getClass().getSimpleName(),
                        cat.getAnimalName(),
                        cat.getBreed(),
                        decimalFormat.format(cat.getAnimalWeigth()),
                        cat.getLivingRegion(),
                        cat.getFoodEaten());
            } else {
                Mammal mammal = (Mammal) animal;
                System.out.printf("%s[%s, %s, %s, %d]",
                        mammal.getClass().getSimpleName(),
                        mammal.getAnimalName(),
                        decimalFormat.format(mammal.getAnimalWeigth()),
                        mammal.getLivingRegion(),
                        mammal.getFoodEaten());
            }
        }

    }
}
