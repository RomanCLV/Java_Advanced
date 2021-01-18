package main.exercice3.Card.Creature;

import main.exercice3.Card.Card;
import main.exercice3.Card.Creature.Items.*;

import java.util.Random;

public class Creature extends Card {

    private final int health;
    private final int damage;

    public Creature(String name, int price, int health, int damage) {
        super(name, price);
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public static Creature getCreature() {
        switch (new Random().nextInt(5)) {
            case 0 -> { return new GoblinHorde(); }
            case 1 -> { return new Centaur(); }
            case 2 -> { return new Cyclops(); }
            case 3 -> { return new Minotaur(); }
            default -> { return new Mower(); }
        }
    }

    @Override
    public String print() {
        return "Creature card { name: " + getName() + " ; price: " + getPrice() + " ; health: " + getHealth() + " ; damage: " + getDamage() + " }";
    }
}
