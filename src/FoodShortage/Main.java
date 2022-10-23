package FoodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        Map<String, Buyer> buyers = new HashMap<>();

        while (!input.equals("End")) {
            String[] commands = input.split("\\s+");
            if (commands.length == 4) {
                Citizen citizen =
                        new Citizen(commands[0], Integer.parseInt(commands[1]), commands[2], commands[3]);
                buyers.put(commands[0], citizen);
            } else if (commands.length == 3) {
                Rebel rebel = new Rebel(commands[0], Integer.parseInt(commands[1]), commands[2]);
                buyers.put(commands[0], rebel);
            } else {
                if (buyers.containsKey(commands[0])) {
                    Buyer buyer = buyers.get(commands[0]);
                    buyer.buyFood();
                }
            }
            input = scanner.nextLine();
        }

        int totalFood = 0;

        for (var buyer : buyers.values()) {
            totalFood += buyer.getFood();
        }

        System.out.println(totalFood);
    }

}
