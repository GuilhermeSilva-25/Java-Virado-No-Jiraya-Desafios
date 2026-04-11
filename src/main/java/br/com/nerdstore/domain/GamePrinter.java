package br.com.nerdstore.domain;

public class GamePrinter {
    public void printGame(Game game) {
        System.out.printf("Jogo: %s | Gênero: %s | Preço: R$ %.2f%n", game.getName(), game.getGenre(), game.getPrice());
    }
}
