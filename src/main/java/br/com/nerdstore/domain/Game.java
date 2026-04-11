package br.com.nerdstore.domain;

public class Game {
    private String name;
    private String genre;
    private double price;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Erro: O preço não pode ser negativo");
            return;
        }

        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
