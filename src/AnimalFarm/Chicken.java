package AnimalFarm;

import java.text.DecimalFormat;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay() {
        if (this.age < 6) {
            return  2;
        } else if (this.age < 12) {
            return  1;
        } else {
            return  0.75;
        }
    }

    public double productPerDay() {
       return calculateProductPerDay();
    }

    @Override
    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        DecimalFormat df = new DecimalFormat("#.##");
//        stringBuilder.append("Chicken ").append(this.name)
//                .append(" (age ").append(this.age).append(") can produce ")
//                .append(df.format(productPerDay())).append(" eggs per day.");
//        return stringBuilder.toString().trim();
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",this.name,this.age,productPerDay());
    }
}
