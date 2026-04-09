package br.com.nerdstore.test;

import br.com.nerdstore.domain.ShoppingCart;

public class ShoppingCartTest {
    public static void main(String... args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.calculateTotal("Cliente 1", 150.0);
        shoppingCart.calculateTotal("Cliente 2", 50.0, 100.0, 25.50);
        shoppingCart.calculateTotal("Cliente 3");
    }
}
