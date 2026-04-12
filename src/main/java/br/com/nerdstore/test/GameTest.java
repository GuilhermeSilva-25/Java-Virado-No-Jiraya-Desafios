package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;

import java.util.Locale;

public class GameTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        Game game1 = new Game("Zelda", "RPG", 99.99);
        Game game2 = new Game();
        Game game3 = new Game("God Of War", 99.99);

        game2.setName("Mario");
        game2.setGenre("Aventura");
        game2.setPrice(99.99);

        game1.printInfo();
        game2.printInfo();
        game3.printInfo();
/*        game1.printMediaReviews();
        game2.printMediaReviews();*/
    }
}
