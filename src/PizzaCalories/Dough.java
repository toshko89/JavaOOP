package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    private void setWeight(double weigth) {
        if (weigth < 1 || weigth > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weigth;
    }

    private void setFlourType(String flourType) {
        try {
            this.flourType = String.valueOf(DoughModifiers.valueOf(flourType));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        try {
            this.bakingTechnique = String.valueOf(DoughModifiers.valueOf(bakingTechnique));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        double modifier1 = DoughModifiers.valueOf(this.flourType).getModifier();
        double modifier2 = DoughModifiers.valueOf(this.bakingTechnique).getModifier();
        return (2 * this.weight) * modifier1 * modifier2;
    }
}
