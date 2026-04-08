package br.com.nerdstore.domain;

public class Game {
    public String name;
    public String genre;
    public double price;

    public void printInfo() {
        System.out.printf("Jogo: %s | Gênero: %s | Preço: R$ %.2f%n", this.name, this.genre, this.price);
    }
}
