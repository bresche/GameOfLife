package com.company;

public class Visualisation {

    CustomJFrame frame;

    public Visualisation(Grid grid) {
        frame = new CustomJFrame(grid.getRows(), grid.getColumns());
    }

    public void drawNextGeneration(Grid grid) {


        for (int row = 0; row < grid.getRows(); row++) {
            for (int column = 0; column < grid.getColumns(); column++) {

                if (grid.getCellAtPosition(row, column).isAlive()) {
                    frame.addText("x");
                } else {
                    frame.addText("_");
                }

            }
            frame.addNewLine();
        }

        grid.generateNextCellGeneration();

    }


    public void clear() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        frame.clearTextArea();
    }
}
