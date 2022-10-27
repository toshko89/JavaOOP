package WildFarm;

public class Tiger extends Felime {

    private String livingRegion;

    public Tiger(String animalName, double animalWeigth, String livingRegion) {
        super(animalName, "Tigers", animalWeigth, livingRegion);
        this.livingRegion = livingRegion;
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println(this.getAnimalType() + " are not eating that type of food!");
        } else {
            this.setFoodEaten(food.getQuantity());
        }
    }
}
