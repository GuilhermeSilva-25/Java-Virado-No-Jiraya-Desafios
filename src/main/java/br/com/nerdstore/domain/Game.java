package br.com.nerdstore.domain;

public class Game {
    public String name;
    public String genre;
    public double price;
    public double[] reviews;

    public void printInfo() {
        System.out.printf("Jogo: %s | Gênero: %s | Preço: R$ %.2f%n", this.name, this.genre, this.price);
    }

    public void printMediaReviews() {
        if (this.reviews == null || this.reviews.length == 0) {
            System.out.printf("Nenhuma avaliação cadastrada para o jogo: %s%n", this.name);
            return;
        }

        double sum = 0;
        for (double grade : this.reviews) {
            sum += grade;
        }

        double average = sum / this.reviews.length;

        System.out.printf("Média de avaliações do jogo %s: %.2f%n", this.name, average);
    }
}
