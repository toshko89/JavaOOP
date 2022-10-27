package WildFarm;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, double animalWeigth, String livingRegion, String breed) {
        super(animalName, "Cats", animalWeigth, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        this.setFoodEaten(food.getQuantity());
    }
}
