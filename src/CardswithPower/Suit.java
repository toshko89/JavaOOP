package CardswithPower;

public enum Suit {

    CLUBS(0),

    DIAMONDS(13),

    HEARTS(26),

    SPADES(39);
    private int powers;

    Suit(int power) {
        this.powers = power;
    }

    public static int getSuitPower(String suit){
        return Suit.valueOf(suit).powers;
    }
}
