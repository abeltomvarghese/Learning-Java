package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FormPanel extends JPanel {

    private JLabel nameLabel;
    private JLabel occupationLabel;
    private JTextField nameField;
    private JTextField occupationField;
    private JButton btnSubmit;
    private FormListener listener;
    private JList ageList;
    private JComboBox employmentCombo;
    private static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public FormPanel() {

        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(0, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        nameLabel = new JLabel("name:");
        occupationLabel = new JLabel("occupation:");
        nameField = new JTextField(10);
        occupationField = new JTextField(10);
        btnSubmit = new JButton("Submit");
        ageList = new JList();
        employmentCombo = new JComboBox();

        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement(new AgeCategory(0,"Under 18"));
        listModel.addElement(new AgeCategory(1,"Over 18"));
        listModel.addElement(new AgeCategory(2,"Over 40"));
        listModel.addElement(new AgeCategory(3,"Over 60"));
        ageList.setModel(listModel);

        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        comboModel.addElement("employed");
        comboModel.addElement("self-employed");
        comboModel.addElement("unemployed");
        employmentCombo.setModel(comboModel);

        ageList.setPreferredSize(new Dimension(105,75));

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String occupation = occupationField.getText();
                AgeCategory selection = (AgeCategory) ageList.getSelectedValue();
                String employment = (String) employmentCombo.getSelectedItem();

                logger.log(Level.INFO, Integer.toString(selection.getId()));
                logger.log(Level.INFO, employment);

                FormEvent formEvent = new FormEvent(e, name, occupation);

                if (listener != null) {
                    listener.setText(formEvent);
                }
            }
        });

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        Insets spaceInset = new Insets(0, 0, 0, 5);

        /* FIRST ROW */
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = spaceInset;
        add(nameLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(nameField, gc);

        /*SECOND ROW */
        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = spaceInset;
        add(occupationLabel, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(occupationField, gc);

        /*THIRD ROW */
        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = spaceInset;
        add(new JLabel("Age:"), gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(ageList, gc);

        /* FOURTH ROW */
        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Employment:"), gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(employmentCombo, gc);

        /*FIFTH ROW */
        gc.weighty = 1;
        gc.gridx = 1;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(btnSubmit, gc);

    }

    public void setFormListener(FormListener pListener) {
        this.listener = pListener;
    }

    private class AgeCategory {
        private int id;
        private String ageCategory;

        public AgeCategory(int id, String ageCat) {
            this.id = id;
            this.ageCategory = ageCat;
        }

        public int getId() {return this.id;}

        public String getAgeCategory() {return this.ageCategory;}

        public String toString() {
            return ageCategory;
        }

    }
}


