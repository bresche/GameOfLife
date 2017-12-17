package com.company;

import javax.swing.*;
import java.awt.*;

public class CustomJFrame extends JFrame {

    JTextArea textArea;

    public CustomJFrame(int rows, int columns) {
        textArea = new JTextArea();
        textArea.setVisible(true);
        textArea.setSize(500, 500);
        textArea.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        this.add(textArea);

        this.setSize(500,500);
        this.setVisible(true);

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
