package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    TextPanel textPanel;
    JButton btn;
    Toolbar toolbar;
    FormPanel formPanel;

    public MainFrame() {
        super("hello world");

        textPanel = new TextPanel();
        btn = new JButton("Click Me");
        toolbar = new Toolbar();
        formPanel = new FormPanel();

        setLayout(new BorderLayout());
        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.append(text);
            }
        });

        formPanel.setFormListener(new FormListener() {
            @Override
            public void setText(FormEvent event) {
                textPanel.append(event.getName() + ": " + event.getOccupation() + "\n");
            }
        });


    }
}
