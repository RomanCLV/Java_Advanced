package main.exercice3.Player;

import main.exercice3.Card.Card;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Player {

    private final Queue<Card> cards;
    private final String name;

    public Player(String name) {
        this.name = name;
        this.cards = new LinkedList<Card>();
        for (int i = 0; i < 10; i++) {
            addCard(false);
        }
    }

    public void play() {
        if (cards.size() == 10) {
            getCard();
        }
        else {
            if (new Random().nextBoolean()) {
                getCard();
            }
            else {
                addCard(true);
            }
        }
    }

    private void getCard() {
        Card card = cards.remove();
        System.out.println(this + " played:  " + card.print() + " - Has " + this.cards.size() + " cards.");
    }

    private void addCard(boolean isLogged) {
        Card card = Card.getCard();
        this.cards.add(card);
        if (isLogged) {
            System.out.println(this + " receive: " + card.print() + " - Has " + this.cards.size() + " cards.");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
