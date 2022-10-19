package ShoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money) {
            this.products.add(product);
            this.money -= product.getCost();
        } else {
            String error = String.format("%s can't afford %s",getName(),product.getName());
            throw new IllegalArgumentException(error);
        }
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return money;
    }

    public List<Product> getProducts(){
        return Collections.unmodifiableList(this.products);
    }
}
