package br.com.nerdstore.domain;

public class Game {
    private String name;
    private String genre;
    private double price;
    private double[] reviews;
    private double average;
    private int[] barCode;

    {
        this.barCode = new int[5];
        for (int i = 0; i < barCode.length; i++) {
            this.barCode[i] = i + 1;
        }

        System.out.println("Log: Novo objeto Game está sendo alocado na memória...");
    }

    public Game() {
    }

    public Game(String name, double price) {
        this(name, "Desconhecido", price);
    }

    public Game(String name, String genre, double price) {
        this.name = name;
        this.genre = genre;
        this.setPrice(price);
        System.out.println("Log: Construtor invocado.");
    }

    public void printInfo() {
        System.out.printf("Jogo: %s | Gênero: %s | Preço: R$ %.2f%n", this.name, this.genre, this.price);
    }

    public void printMediaReviews() {
        if (this.reviews == null || this.reviews.length == 0) {
            System.out.printf("Nenhuma avaliação cadastrada para o jogo: %s%n", this.name);
            return;
        }

        double average = getAverageReviews();

        System.out.printf("Média de avaliações do jogo %s: %.2f%n", this.name, average);
    }

    public double getAverageReviews() {
        if (reviews == null || this.reviews.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double grade : this.reviews) {
            sum += grade;
        }

        return sum / this.reviews.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
            return;
        }
        this.price = price;
    }

    public double[] getReviews() {
        return reviews;
    }

/*    public void setReviews(double[] reviews) {
        this.reviews = reviews;
        this.average = getAverageReviews();
    }*/

    public double getAverage() {
        return average;
    }

    public int[] getBarCode() {
        return barCode;
    }
}
