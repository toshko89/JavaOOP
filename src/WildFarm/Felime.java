package WildFarm;

public abstract class Felime extends Mammal {
    public Felime(String animalName, String animalType, double animalWeigth, String livingRegion) {
        super(animalName, animalType, animalWeigth, livingRegion);
    }

    @Override
    abstract void makeSound();

    @Override
    abstract void eat(Food food);
}
