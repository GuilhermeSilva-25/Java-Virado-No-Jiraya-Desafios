package br.com.nerdstore.test;

import br.com.nerdstore.domain.CartConfig;

public class CartConfigTest {
    public static void main(String[] args) {
        CartConfig cart1 = new CartConfig("Guilherme");
        CartConfig cart2 = new CartConfig("Midoriya");

        cart1.printConfig();
        cart2.printConfig();

        CartConfig.MAX_ITEMS = 20;

        cart1.printConfig();
        cart2.printConfig();
    }
}
