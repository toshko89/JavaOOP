package CardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");
        for (Cards value : Cards.values()) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value.name());
        }
    }
}


