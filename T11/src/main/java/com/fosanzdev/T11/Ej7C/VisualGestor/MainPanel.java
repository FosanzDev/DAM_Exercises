package com.fosanzdev.T11.Ej7C.VisualGestor;

import javax.swing.*;

public class MainPanel extends JFrame {
    private JPanel mainPanel;
    private JButton infoEstadioButton;
    private JButton button3;
    private JButton button4;
    private JButton button6;

    public MainPanel(){
        super("Estadio");
        setContentPane(mainPanel);
        this.pack();
        this.setResizable(false);
    }
}
