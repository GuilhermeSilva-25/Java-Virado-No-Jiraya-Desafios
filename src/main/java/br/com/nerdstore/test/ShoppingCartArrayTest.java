package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;

import java.util.Locale;

public class ShoppingCartArrayTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        Game game1 = new Game("Zelda", "Aventura", 99.99);
        Game game2 = new Game("Mario", "Aventura", 99.99);
        Game game3 = new Game("God f War", "Ação/Aventura", 99.99);

        Game[] games = {game1, game2, game3};

        games[0].setPrice(299.90);

        for (Game game : games) {
            game.printInfo();
        }
    }
}
