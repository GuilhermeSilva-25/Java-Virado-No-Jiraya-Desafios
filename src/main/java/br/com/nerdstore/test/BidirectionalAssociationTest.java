package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;
import br.com.nerdstore.domain.Studio;

public class BidirectionalAssociationTest {
    public static void main(String[] args) {
        var fromSoftware = new Studio("FromSoftware");
        var darkSouls = new Game("Dark Souls", "RPG", 150.0);
        var eldenRing = new Game("Elden Ring", "RPG", 250.0);

        darkSouls.setStudio(fromSoftware);
        eldenRing.setStudio(fromSoftware);

        Game[] games = {darkSouls, eldenRing};

        fromSoftware.setGames(games);

        darkSouls.printInfo();
        eldenRing.printInfo();
        fromSoftware.printInfo();
    }
}
