package WildFarm;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeigth, String livingRegion) {
        super(animalName, animalType, animalWeigth);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

}
