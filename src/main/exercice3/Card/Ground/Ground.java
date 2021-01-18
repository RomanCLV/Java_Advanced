package main.exercice3.Card.Ground;

import main.exercice3.Card.Card;
import main.exercice3.Card.Ground.Items.*;

import java.util.Random;

public abstract class Ground extends Card {

    protected enum Color {
        Red,
        Green,
        Blue,
        Black,
        White
    }

    private final Color color;

    public Ground(String name, Color color) {
        super(name, 0);
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public static Ground getGroundCard() {
        switch (new Random().nextInt(5)) {
            case 0 -> { return new MountainOfDestiny(); }
            case 1 -> { return new FrozenDesert(); }
            case 2 -> { return new TropicalJungle(); }
            case 3 -> { return new Styx(); }
            default -> { return new MagmaLakes(); }
        }
    }

    @Override
    public String print() {
        return "Ground card { name: " + getName() + " ; price: " + getPrice() + " ; color: " + getColor() + " }";
    }
}
