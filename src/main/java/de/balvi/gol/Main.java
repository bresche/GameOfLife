package de.balvi.gol;


import de.balvi.gol.visualisation.Visualisation;

public class Main {
    public static void main(String[] args) {
        Visualisation visualisation = new Visualisation();

        for (int i = 0; i < 3; i++) {
            visualisation.clear();
            visualisation.drawNextGeneration();
        }
    }
}
