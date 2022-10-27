package WildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalName, double animalWeigth, String livingRegion) {
        super(animalName,
                "Zebras",
                animalWeigth,
                livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zs");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            this.setFoodEaten(food.getQuantity());
        } else {
            System.out.println(this.getAnimalType() + " are not eating that type of food!");
        }
    }
}
