package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;

import java.util.Locale;

public class GameTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.of("pt", "BR"));
        Game game = new Game();

        game.name = "The Witcher 3";
        game.genre = "RPG";
        game.price = 150.00;

        System.out.printf("Jogo: %s | Gênero: %s | Preço: %.2f%n", game.name, game.genre, game.price);
    }
}
