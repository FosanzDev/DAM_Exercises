package com.fosanzdev.T11.Ej7C;

import com.fosanzdev.T11.Ej7C.VisualGestor.StadiumPanel;

import javax.swing.*;

public class Ej7C {

    public static void main(String[] args) throws InterruptedException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        StadiumPanel stadiumPanel = new StadiumPanel();
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        JPanel mainPanel = new JPanel();
        JFrame frame = new JFrame("Ejercicio 7C");
        frame.add(stadiumPanel.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
