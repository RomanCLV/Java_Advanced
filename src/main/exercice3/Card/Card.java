package main.exercice3.Card;

import main.exercice3.Card.Creature.Creature;
import main.exercice3.Card.Ground.Ground;
import main.exercice3.Card.Spell.Spell;

import java.util.Random;

public abstract class Card {

    protected String name;
    protected int price;

    public Card(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public abstract String print();

    public static Card getCard() {
        switch (new Random().nextInt(3)) {
            case 0 -> { return Ground.getGroundCard(); }
            case 1 -> { return Spell.getSpell(); }
            default -> { return Creature.getCreature(); }
        }
    }
}
