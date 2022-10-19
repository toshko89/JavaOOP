package CardswithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        int sum = Rank.getRankPower(rank) + Suit.getSuitPower(suit);
        System.out.printf("Card name: %s of %s; Card power: %d",rank,suit,sum);

    }
}
