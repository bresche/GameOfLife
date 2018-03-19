package de.balvi.gol.visualisation;

public class Visualisation {

    CustomJFrame frame;

    public Visualisation() {
        frame = new CustomJFrame(5, 5);
    }

    public void drawNextGeneration() {


        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                frame.addText("_");
            }
            frame.addNewLine();
        }


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
