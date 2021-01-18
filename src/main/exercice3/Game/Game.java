package main.exercice3.Game;

import main.exercice3.Player.Player;

import java.util.Random;

public class Game {

    private final Player player1;
    private final Player player2;

    public Game() {
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
    }

    public void play(int repeat) {
        if (repeat < 0) {
            throw new IllegalArgumentException("repeat need to be positive!");
        }
        boolean isPlayer1 = new Random().nextBoolean();

        System.out.println("\n¤ ¤ ¤ Start game ¤ ¤ ¤\n");
        Player player = isPlayer1 ? player1 : player2;
        System.out.println(player + " begin...\n");
        for (int i = 0; i < repeat; i++) {
            player.play();
            isPlayer1 = !isPlayer1;
            player = isPlayer1 ? player1 : player2;
        }
        System.out.println("\n¤ ¤ ¤ End game ¤ ¤ ¤");
    }
}
