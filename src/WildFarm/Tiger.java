package WildFarm;

import java.text.DecimalFormat;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeigth, String livingRegion) {
        super(animalName, animalType, animalWeigth, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println("Tigers are not eating that type of food!");
        } else {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        }
    }

    DecimalFormat df = new DecimalFormat("#.#");

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), this.getAnimalName(), df.format(this.getAnimalWeigth()), this.getLivingRegion(),  this.getFoodEaten());
    }
}
