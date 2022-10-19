package ShoppingSpree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> allPeople = new LinkedList<>();
        List<Product> allProducts = new LinkedList<>();

        try {
            if (input.contains(";")) {
                String[] values = input.split(";");
                for (int i = 0; i < values.length; i++) {
                    String[] current = values[i].split("=");
                    Person person = new Person(current[0], Double.parseDouble(current[1]));
                    allPeople.add(person);
                }
            } else if (input.contains("=")) {
                String[] values = input.split("=");
                Person person = new Person(values[0], Double.parseDouble(values[1]));
                allPeople.add(person);
            }

            input = scanner.nextLine();

            if (input.contains(";")) {
                String[] values = input.split(";");
                for (int i = 0; i < values.length; i++) {
                    String[] current = values[i].split("=");
                    Product product = new Product(current[0], Double.parseDouble(current[1]));
                    allProducts.add(product);
                }
            } else if (input.contains("=")) {
                String[] values = input.split("=");
                Product product = new Product(values[0], Double.parseDouble(values[1]));
                allProducts.add(product);
            }

            input = scanner.nextLine();

            while (!input.equals("END")) {
                String[] commads = input.split("\\s+");
                Person person = allPeople.stream()
                        .filter(p -> p.getName().equals(commads[0])).findFirst().orElse(null);
                Product product = allProducts.stream()
                        .filter(p -> p.getName().equals(commads[1])).findFirst().orElse(null);

                if (product != null && person != null) {
                    person.buyProduct(product);
                    System.out.println(person.getName() + " bought " + product.getName());
                }

                input = scanner.nextLine();
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Person allPerson : allPeople) {
            stringBuilder.append(allPerson.getName()).append(" - ");
            if (allPerson.getProducts().size() == 0) {
                stringBuilder.append("Nothing bought");
            } else {
                String data = allPerson.getProducts()
                        .stream()
                        .map(Product::getName)
                        .collect(Collectors.joining(", "));
                stringBuilder.append(data);
                stringBuilder.append(System.lineSeparator());
            }
        }

        String output = stringBuilder.toString().trim();
        System.out.println(output);

    }
}
