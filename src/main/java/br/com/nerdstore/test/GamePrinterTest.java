package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;
import br.com.nerdstore.domain.GamePrinter;

import java.util.Locale;

public class GamePrinterTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        Game game1 = new Game();
        Game game2 = new Game();

        game1.setName("Zelda");
        game1.setGenre("RPG");
        game1.setPrice(99.99);
//        game1.setReviews(new double[]{9.5, 10.0, 9.0});

        game2.setName("Mario");
        game2.setGenre("Aventura");
        game2.setPrice(99.99);

        GamePrinter gamePrinter = new GamePrinter();

        gamePrinter.printGame(game1);
        gamePrinter.printGame(game2);
    }
}
