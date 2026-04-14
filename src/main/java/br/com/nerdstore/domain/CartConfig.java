package br.com.nerdstore.domain;

public class CartConfig {
    private String ownerName;
    public static int MAX_ITEMS = 15;

    public CartConfig(String ownerName) {
        this.ownerName = ownerName;
    }

    public void printConfig() {
        System.out.printf("Carrinho de %s | Limite da loja: %d%n", this.ownerName, CartConfig.MAX_ITEMS);
    }
}
