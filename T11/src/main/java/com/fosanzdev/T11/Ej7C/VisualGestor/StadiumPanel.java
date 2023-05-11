package com.fosanzdev.T11.Ej7C.VisualGestor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StadiumPanel extends JFrame {
    private JButton PALCOCENTRALSUPERIORNORTEButton;
    private JButton PALCOCENTRALINFERIORNORTEButton;
    private JButton PALCOSUPERIORESTEButton;
    private JButton PALCOINFERIORESTEButton;
    private JButton PALCOSUPERIOROESTEButton;
    private JButton PALCOINFERIOROESTEButton;
    private JButton PALCOCENTRALINFERIORSURButton;
    private JButton PALCOCENTRALSUPERIORSURButton;
    private JPanel mainPanel;
    private JPanel PalcosNorte;
    private JPanel PalcosEste;
    private JPanel PalcosOeste;
    private JPanel PalcosSur;
    private JPanel Centro;

    public StadiumPanel(){
        super("Estadio");
        setContentPane(mainPanel);
        this.pack();
        this.setResizable(false);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
    
}