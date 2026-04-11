package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;

import java.util.Locale;

public class GameTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        Game game1 = new Game();
        Game game2 = new Game();

        game1.setName("Zelda");
        game1.setGenre("RPG");
        game1.setPrice(99.99);
        game1.reviews = new double[]{9.5, 10.0, 9.0};

        game2.setName("God of War");
        game2.setGenre("Action");
        game2.setPrice(-50.0);

/*        game1.printInfo();
        game2.printInfo();
        game1.printMediaReviews();
        game2.printMediaReviews();*/

        System.out.printf("Jogo: %s | Gênero: %s | Preço: R$ %.2f%n", game1.getName(), game1.getGenre(), game1.getPrice());
        System.out.printf("Jogo: %s | Gênero: %s | Preço: R$ %.2f%n", game2.getName(), game2.getGenre(), game2.getPrice());

    }
}
