package br.com.nerdstore.domain;

public class Studio {
    private String name;
    private Game[] games;

    public Studio(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("#########################################################################");
        System.out.printf("Desenvolvedora: %s%n", this.name);
        if (this.games == null) {
            return;
        }

        for (Game game : this.games) {
            if (game != null) {
                System.out.printf("Jogo: %s%n", game.getName());
            }
        }
        System.out.println("#########################################################################");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }
}
