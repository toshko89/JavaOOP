package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Birthable> birthableList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] commands = input.split(" ");
            switch (commands[0]) {
                case "Citizen":
                    Citizen citizen = new Citizen(commands[1],
                            Integer.parseInt(commands[2]),
                            commands[3],
                            commands[4]);
                    birthableList.add(citizen);
                    break;
                case "Robot":
                    Robot robot = new Robot(commands[1], commands[2]);
                    break;
                case "Pet":
                    Pet pet = new Pet(commands[1], commands[2]);
                    birthableList.add(pet);
                    break;
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        if (birthableList.size() > 0) {
            birthableList.stream()
                    .filter(el -> el.getBirthDate().contains(year))
                    .forEach(el -> System.out.println(el.getBirthDate()));
        }

    }
}
