package WildFarm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeigth;
    private int foodEaten = 0;

    public Animal(String animalName, String animalType, double animalWeigth) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeigth = animalWeigth;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public double getAnimalWeigth() {
        return animalWeigth;
    }

    public void setAnimalWeigth(double animalWeigth) {
        this.animalWeigth = animalWeigth;
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
