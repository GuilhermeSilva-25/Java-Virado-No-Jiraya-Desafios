package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;

import java.util.Locale;

public class GameTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        Game game1 = new Game();
        Game game2 = new Game();

        game1.name = "Zelda";
        game1.genre = "RPG";
        game1.price = 99.99;

        game2.name = "God of War";
        game2.genre = "Action";
        game2.price = 99.99;

        game1.printInfo();
        game2.printInfo();
    }
}
