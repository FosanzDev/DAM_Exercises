package com.fosanzdev.T11.Ej7C.VisualGestor;

import com.fosanzdev.T11.Ej7C.Area;

import javax.swing.*;
import java.awt.*;

public class AreaEditorPanel extends AreaViewPanel implements Runnable{

    private final static int FPS = 60;
    private final static int DELAY = 1000/FPS;
    private final AreaEditorMListener LISTENER = new AreaEditorMListener();
    Click prevClick = null;

    public AreaEditorPanel(Area area) {
        super(area);
    }

    @Override
    protected void paintComponent(Graphics g){
        superPaint(g);
        paintGrid((Graphics2D) g);
        paintGuide((Graphics2D) g);
        drawLabels((Graphics2D) g);
        drawGrid((Graphics2D) g);
    }

    private void paintGuide(Graphics2D g){
        g.setColor(Color.YELLOW);
        Point p = getMousePosition();
        if(p != null){
            g.fillRect((p.x/CELL_SIZE)*CELL_SIZE, 0, 20, (p.y/CELL_SIZE)*CELL_SIZE+CELL_SIZE);
            g.fillRect(0, (p.y/CELL_SIZE)*CELL_SIZE, (p.x/CELL_SIZE)*CELL_SIZE+CELL_SIZE, CELL_SIZE);
            g.setColor(Color.BLACK);
            g.drawRect((p.x/CELL_SIZE)*CELL_SIZE, (p.y/CELL_SIZE)*CELL_SIZE, CELL_SIZE, CELL_SIZE);
            g.setColor(Color.YELLOW);
        }
    }

    @Override
    public void run() {
        boolean exit = false;
        addMouseListener(LISTENER);

        while(!exit){
            repaint();
            readInput();
        }
    }

    private void readInput() {
        if (LISTENER.click == null || LISTENER.click == prevClick){
            prevClick = LISTENER.click;
            return;
        }
        switch (LISTENER.click){
            case LEFT_CLICK -> {
                Point p = getMousePosition();
                if(p != null){
                    int x = p.y/20-1;
                    int y = p.x/20-1;
                    area.setOcupado(x, y);}
            }
            case RIGHT_CLICK -> {
                Point p = getMousePosition();
                if(p != null){
                    int x = p.y/20-1;
                    int y = p.x/20-1;
                    area.setAsientoVip(x, y);}
            }
        }
        prevClick = LISTENER.click;
    }


    public static void main(String[] args) {
        Area area = new Area("Area 1", 10, 10, new int[]{1,2,3}, 10.0);
        JFrame frame = new JFrame("AreaEditorPanel");
        frame.setResizable(false);
        AreaEditorPanel areaEditorPanel = new AreaEditorPanel(area);
        frame.add(areaEditorPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        new Thread(areaEditorPanel).start();
    }
}
