package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextPanel extends JPanel {
    JTextArea textArea;

    public TextPanel() {
        textArea = new JTextArea();

        Border border = BorderFactory.createLineBorder(Color.WHITE);
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,10);
        setBorder(outerBorder);

        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void append(String text) {
        textArea.append(text);
    }
}
