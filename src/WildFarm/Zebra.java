package WildFarm;

import java.text.DecimalFormat;

public class Zebra extends Mammal {
    public Zebra(String animalName, double animalWeigth, String livingRegion) {
        super(animalName, "Zebra", animalWeigth, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zs");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }

    DecimalFormat df = new DecimalFormat("#.#");
    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), this.getAnimalName(), df.format(this.getAnimalWeigth()), this.getLivingRegion(), this.getFoodEaten());
    }
}
