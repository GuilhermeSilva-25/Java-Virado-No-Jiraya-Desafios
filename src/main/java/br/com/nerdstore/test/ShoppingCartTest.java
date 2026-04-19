package br.com.nerdstore.test;

import br.com.nerdstore.domain.ShoppingCart;

public class ShoppingCartTest {
    public static void main(String... args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.printTotal();
        shoppingCart.printTotal();
        shoppingCart.printTotal();
    }
}
