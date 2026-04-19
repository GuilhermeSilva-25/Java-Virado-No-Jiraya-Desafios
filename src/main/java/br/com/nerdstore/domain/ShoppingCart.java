package br.com.nerdstore.domain;

public class ShoppingCart {
    private String customerName;
    private Game[] games;

    public ShoppingCart() {};

    public ShoppingCart(String customerName) {
        this.customerName = customerName;
    }

    public ShoppingCart(String customerName, Game[] games) {
        this.customerName = customerName;
        this.games = games;
    }

    public void printCart() {
        System.out.println("##################################################################");
        System.out.printf("Nome do cliente: %s%n", this.customerName);

        if (this.games == null) {
            return;
        }

        for (Game game : this.games) {
            if (game != null) {
                System.out.printf("Jogo: %s | Preço: R$ %.2f%n", game.getName(), game.getPrice());
            }
        }
        System.out.println("##################################################################");
    }

    public void printTotal() {
        if (this.games == null) {
            System.out.println("Total: R$ 0.00 (Carrinho vazio)");
            return;
        }

        double total = 0;

        for (Game game : this.games) {
            if (game != null) {
                total += game.getPrice();
            }
        }

        System.out.printf("Total do carrinho do(a) %s: R$ %.2f%n", this.customerName, total);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
}
