package CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks: ");
        for (Rank value : Rank.values()) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value.name());
        }
    }
}
