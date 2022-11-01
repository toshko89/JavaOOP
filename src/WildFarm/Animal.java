package WildFarm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeigth;
    private int foodEaten;

    public Animal(String animalName, String animalType, double animalWeigth) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeigth = animalWeigth;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeigth() {
        return animalWeigth;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    abstract void makeSound();

    abstract void eat(Food food);

}
