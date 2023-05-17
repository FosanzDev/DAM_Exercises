package com.fosanzdev.T11.Ej7C;

import com.fosanzdev.T11.Ej7C.VisualGestor.StadiumPanel;

import javax.swing.*;

public class Ej7C {

    private static Estadio estadio;

    public static void main(String[] args) throws InterruptedException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        StadiumPanel stadiumPanel = new StadiumPanel("Estadio");
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        JPanel mainPanel = new JPanel();
        JFrame frame = new JFrame("Ejercicio 7C");
        frame.add(stadiumPanel.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        estadio = new Estadio("Estadio", 8);
        Area area1 = new Area("Palco Superior Este", 10, 10, new int[]{8,9,10}, 10.0);
    }

}
