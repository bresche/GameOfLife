package de.balvi.gol.visualisation;

import javax.swing.*;
import java.awt.*;

public class CustomJFrame extends JFrame {

    JTextArea textArea;

    public CustomJFrame(int rows, int columns) {
        textArea = new JTextArea();
        textArea.setVisible(true);
        textArea.setSize(250, 250);
        textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 25));
        this.add(textArea);

        this.setSize(250, 250);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void addText(String s) {
        textArea.append(s);
    }

    public void addNewLine() {
        textArea.append("\n");
    }

    public void clearTextArea() {
        textArea.setText("");
    }
}
