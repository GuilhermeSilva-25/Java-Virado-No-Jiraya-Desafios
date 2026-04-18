package br.com.nerdstore.test;

import br.com.nerdstore.domain.Game;
import br.com.nerdstore.domain.Studio;

public class GameStudioTest {
    public static void main(String[] args) {
        Studio nintendo = new Studio("Nintendo");
        Game zelda = new Game("Zelda", "Aventura", 99.0);
        Game mario = new Game("Mario", "Plataforma", 50.0);
        Game gran = new Game("Gran Turismo", "Corrida", 99.0);

        zelda.setStudio(nintendo);
        mario.setStudio(nintendo);

        zelda.printInfo();
        mario.printInfo();
        gran.printInfo();
    }
}
