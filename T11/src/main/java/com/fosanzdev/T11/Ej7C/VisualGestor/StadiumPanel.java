package com.fosanzdev.T11.Ej7C.VisualGestor;

import com.fosanzdev.T11.Ej7C.Area;

import javax.swing.*;
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

    Area palcoSuperiorEste = new Area("Palco Superior Este", 10, 10, new int[]{8,9,10}, 10.0);
    Area palcoInferiorEste = new Area("Palco Inferior Este", 10, 10, new int[]{8,9,10}, 10.0);
    Area palcoSuperiorOeste = new Area("Palco Superior Oeste", 10, 10, new int[]{8,9,10}, 10.0);
    Area palcoInferiorOeste = new Area("Palco Inferior Oeste", 10, 10, new int[]{8,9,10}, 10.0);
    Area palcoCentralSuperiorNorte = new Area("Palco Central Superior Norte", 10, 30, new int[]{8,9,10}, 10.0);
    Area palcoCentralInferiorNorte = new Area("Palco Central Inferior Norte", 10, 30, new int[]{8,9,10}, 10.0);
    Area palcoCentralSuperiorSur = new Area("Palco Central Superior Sur", 10, 30, new int[]{8,9,10}, 10.0);
    Area palcoCentralInferiorSur = new Area("Palco Central Inferior Sur", 10, 30, new int[]{8,9,10}, 10.0);


    public StadiumPanel(String name){
        super(name);
        setContentPane(mainPanel);
        this.pack();
        this.setResizable(false);
        JFrame defaultFrame = new JFrame();
        defaultFrame.setDefaultCloseOperation(defaultFrame.DISPOSE_ON_CLOSE);

        //Adding action listeners per each button to show the area related to it

        PALCOSUPERIOROESTEButton.addActionListener(e -> packAndShow(defaultFrame, palcoSuperiorOeste));

        PALCOSUPERIORESTEButton.addActionListener(e -> packAndShow(defaultFrame, palcoSuperiorEste));

        PALCOINFERIOROESTEButton.addActionListener(e -> packAndShow(defaultFrame, palcoInferiorOeste));

        PALCOINFERIORESTEButton.addActionListener(e -> packAndShow(defaultFrame, palcoInferiorEste));

        PALCOCENTRALSUPERIORNORTEButton.addActionListener(e -> packAndShow(defaultFrame, palcoCentralSuperiorNorte));

        PALCOCENTRALINFERIORNORTEButton.addActionListener(e -> packAndShow(defaultFrame, palcoCentralInferiorNorte));

        PALCOCENTRALSUPERIORSURButton.addActionListener(e -> packAndShow(defaultFrame, palcoCentralSuperiorSur));

        PALCOCENTRALINFERIORSURButton.addActionListener(e -> packAndShow(defaultFrame, palcoCentralInferiorSur));
    }                               

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private void packAndShow(JFrame frame, Area area){
        frame.setTitle(area.getNombre());
        AreaEditorPanel editor = new AreaEditorPanel(area);
        frame.setContentPane(editor);
        frame.pack();
        frame.setVisible(true);
        new Thread(editor).start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StadiumPanel");
        frame.setContentPane(new StadiumPanel("StadiumPanel").mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}