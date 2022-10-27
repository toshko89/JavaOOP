package WildFarm;

public class Mouse extends Mammal {
    public Mouse(String animalName, double animalWeigth, String livingRegion) {
        super(animalName, "Mouse", animalWeigth, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            this.setFoodEaten(food.getQuantity());
        } else {
            System.out.println("Mise are not eating that type of food!");
        }
    }
}
