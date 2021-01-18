package main.exercice3.Card.Spell;

import main.exercice3.Card.Card;
import main.exercice3.Card.Spell.Items.*;

import java.util.Random;

public abstract class Spell extends Card {

    private final String description;

    public Spell(String name, int price, String description) {
        super(name, price);
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public static Spell getSpell() {
        switch (new Random().nextInt(5)) {
            case 0 -> { return new Fireball(); }
            case 1 -> { return new IceSpikes(); }
            case 2 -> { return new SourVenom(); }
            case 3 -> { return new MeteoShower(); }
            default -> { return new SoulAspiration(); }
        }
    }

    @Override
    public String print() {
        return "Spell card { name: " + getName() + " ; price: " + getPrice() + " ; description: " + getDescription() + " }";
    }
}
