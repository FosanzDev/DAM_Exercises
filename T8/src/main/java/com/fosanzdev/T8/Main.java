package com.fosanzdev.T8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {

        final String[] textButtons = {"ON","OFF","CE","/","7","8","9","*","4","5","6","-","1","2","3","+","0",".","%","="};

        //Creamos un objeto de la clase Display (JFrame)
        Display display = new Display("Mi ventana");

        //Creamos un JPanel
        JPanel panelsouth = new JPanel();
        JPanel panelnorth = new JPanel();

        //Creamos el container por defecto
        JPanel panelprincipal = new JPanel();

        //Añadimos el contenido del panel a la pantalla
        display.setContentPane(panelprincipal);
        panelprincipal.setLayout(new BorderLayout());

        //Opción de Layout responsive (Border Layout default)
        panelnorth.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelsouth.setLayout(new GridLayout(5,4));

        JLabel label = new JLabel("0");

        Calculator calculator = new Calculator();

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                label.setText(calculator.addSymbol(button.getText().charAt(0)));
            }
        };


        //Creamos el boton y lo añadimos al panel
        for(int i = 0;i<20;i++){
            JButton button = new JButton(textButtons[i]);
            panelsouth.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }
        panelnorth.add(label);

        panelprincipal.add(panelnorth,BorderLayout.NORTH);
        panelprincipal.add(panelsouth,BorderLayout.CENTER);

    }
}