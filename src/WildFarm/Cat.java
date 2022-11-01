package WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeigth, String livingRegion, String breed) {
        super(animalName, animalType, animalWeigth, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Cats are not eating that type of food!");
        } else {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        }
    }

    DecimalFormat df = new DecimalFormat("#.#");

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]", super.getAnimalType(), this.getAnimalName(), this.breed,df.format(this.getAnimalWeigth()), this.getLivingRegion(),  this.getFoodEaten());
    }
}
