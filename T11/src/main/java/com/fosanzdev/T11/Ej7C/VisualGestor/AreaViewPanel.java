package com.fosanzdev.T11.Ej7C.VisualGestor;

import com.fosanzdev.T11.Ej7C.Area;

import javax.swing.*;
import java.awt.*;

public class AreaViewPanel extends JPanel{

    private JPanel mainPanel;
    private Area area;

    public AreaViewPanel(Area area){
        this.area = area;
        setPreferredSize(new Dimension(area.getNumAsientos()*20, area.getNumFilas()*20));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid((Graphics2D) g);
        drawGrid((Graphics2D) g);
    }

    public void drawGrid(Graphics2D g){
        g.setColor(Color.BLACK);
        //Dibujar lineas verticales
        for(int x = 0; x < area.getNumAsientos(); x++){
            g.drawLine(x*20, 0, x*20, area.getNumFilas()*20);
        }
        //Dibujar lineas horizontales
        for(int y = 0; y < area.getNumFilas(); y++){
            g.drawLine(0, y*20, area.getNumAsientos()*20, y*20);
        }
    }

    public void paintGrid(Graphics2D g){
        for(int i=0; i<area.getNumFilas(); i++){
            for(int j=0; j<area.getNumAsientos(); j++){
                boolean ocupado = area.getFilas()[i].getAsientos()[j].isOcupado();
                boolean vip = area.getFilas()[i].isVip();
                if(ocupado){
                    g.setColor(Color.RED);
                    g.fillRect(j*20, i*20, 20, 20);
                }else if (vip){
                    g.setColor(Color.CYAN);
                    g.fillRect(j*20, i*20, 20, 20);
                } else {
                    g.setColor(Color.GREEN);
                }
            }
        }
    }

    public static void main(String[] args) {
        Area area = new Area("Prueba", 10, 30, new int[]{8,9,10}, 10.0);
        area.getFilas()[2].getAsientos()[5].setOcupado(true);
        JFrame frame = new JFrame("AreaViewPanel");
        frame.setContentPane(new AreaViewPanel(area));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
