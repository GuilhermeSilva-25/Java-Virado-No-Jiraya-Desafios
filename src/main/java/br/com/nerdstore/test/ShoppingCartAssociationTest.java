package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;
import br.com.nerdstore.domain.ShoppingCart;

public class ShoppingCartAssociationTest {
    public static void main(String[] args) {
        Game game1  = new Game("Zelda", 99.99);
        Game game2 = new Game("Mario", 99.99);

        Game[] games = {game1,game2};

        ShoppingCart shoppingCart = new ShoppingCart("Guilherme", games);

        shoppingCart.printCart();
        shoppingCart.printTotal();
    }
}
