package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton btnHello;
    private JButton btnGoodBye;
    private StringListener listener;

    public Toolbar() {
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5,5,5,10),BorderFactory.createLineBorder(Color.GRAY)));

        btnHello = new JButton("Hello");
        btnGoodBye = new JButton("GoodBye");
        btnHello.addActionListener(this);
        btnGoodBye.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(btnHello);
        add(btnGoodBye);
    }

    public void setStringListener(StringListener listener) {
        this.listener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnClicked = (JButton) e.getSource();

        if (btnClicked == btnHello && listener != null) {
            listener.textEmitted("hello\n");
        } else if (btnClicked == btnGoodBye && listener != null) {
            listener.textEmitted("Goodbye\n");
        }
    }
}
