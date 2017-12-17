package com.company;

public class Main {

    public static void main(String[] args) {
        Grid grid = new Grid(6, 6);

        /*  initial cells - Bipole:
            - - - - - -
            - x x - - -
            - x x - - -
            - - - x x -
            - - - x x -
            - - - - - -
        */
        grid.addCellAtPosition(new Cell().living(), 1, 1);
        grid.addCellAtPosition(new Cell().living(), 1, 2);
        grid.addCellAtPosition(new Cell().living(), 2, 1);
        grid.addCellAtPosition(new Cell().living(), 2, 2);
        grid.addCellAtPosition(new Cell().living(), 3, 3);
        grid.addCellAtPosition(new Cell().living(), 3, 4);
        grid.addCellAtPosition(new Cell().living(), 4, 3);
        grid.addCellAtPosition(new Cell().living(), 4, 4);

        Visualisation visualisation = new Visualisation(grid);

        for (int i = 0; i < 10; i++) {
            visualisation.clear();
            visualisation.drawNextGeneration(grid);
        }
    }
}
