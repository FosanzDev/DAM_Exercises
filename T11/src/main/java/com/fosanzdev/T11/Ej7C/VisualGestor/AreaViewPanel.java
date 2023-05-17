package com.fosanzdev.T11.Ej7C.VisualGestor;

import com.fosanzdev.T11.Ej7C.Area;

import javax.swing.*;
import java.awt.*;

public class AreaViewPanel extends JPanel{

    protected static final int CELL_SIZE = 20;
    protected final Area area;

    public AreaViewPanel(Area area){
        this.area = area;
        setPreferredSize(new Dimension(area.getNumAsientos()*CELL_SIZE+(int) (CELL_SIZE*1.2f), area.getNumFilas()*CELL_SIZE+(int) (CELL_SIZE*1.2f)));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintGrid((Graphics2D) g);
        drawGrid((Graphics2D) g);
        drawLabels((Graphics2D) g);
    }

    protected void superPaint(Graphics g){
        super.paintComponent(g);
    }

    public void drawLabels(Graphics2D g){
        g.setColor(Color.BLACK);
        //Dibujar numeros de asientos
        for(int x = 1; x < area.getNumAsientos()+1; x++){
            g.drawString((String.valueOf((char) (x/26+65)).concat(String.valueOf((char) (x%26+65)))), x*CELL_SIZE+CELL_SIZE/6, CELL_SIZE/2);
        }
        //Dibujar letras de filas
        for(int y = 1; y < area.getNumFilas()+1; y++){
            g.drawString(String.valueOf(y), CELL_SIZE/4, y*CELL_SIZE+CELL_SIZE/2);
        }
    }

    public void drawGrid(Graphics2D g){
        g.setColor(Color.BLACK);
        //We draw the vertical lines with 1 cell of offset to the left
        for(int x = 0; x <= area.getNumAsientos(); x++){
            g.drawLine(x*CELL_SIZE+CELL_SIZE, CELL_SIZE, x*CELL_SIZE+CELL_SIZE, area.getNumFilas()*CELL_SIZE+CELL_SIZE);
        }
        //We draw the horizontal lines with 1 cell of offset to the top
        for(int y = 0; y <= area.getNumFilas(); y++){
            g.drawLine(CELL_SIZE, y*CELL_SIZE+CELL_SIZE, area.getNumAsientos()*CELL_SIZE+CELL_SIZE, y*CELL_SIZE+CELL_SIZE);
        }
    }


    public void paintGrid(Graphics2D g){
        for(int i=0; i<area.getNumFilas(); i++){
            for(int j=0; j<area.getNumAsientos(); j++){
                boolean ocupado = area.getFilas()[i].getAsientos()[j].isOcupado();
                boolean vip = area.getFilas()[i].getAsientos()[j].isVip();
                if(ocupado){
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.GREEN);
                }
                g.fillRect(j*CELL_SIZE+CELL_SIZE, i*CELL_SIZE+CELL_SIZE, CELL_SIZE, CELL_SIZE);

                if(vip){
                    //Vip color is a color that is visible on both red and green
                    g.setColor(Color.YELLOW);

                    //Vip shape is a corner
                    g.fillPolygon(new int[]{j*CELL_SIZE+CELL_SIZE, j*CELL_SIZE+CELL_SIZE, j*CELL_SIZE+CELL_SIZE/2+CELL_SIZE},
                            new int[]{i*CELL_SIZE+CELL_SIZE, i*CELL_SIZE+CELL_SIZE/2+CELL_SIZE, i*CELL_SIZE+CELL_SIZE}, 3);
                }
            }
        }
    }
}
