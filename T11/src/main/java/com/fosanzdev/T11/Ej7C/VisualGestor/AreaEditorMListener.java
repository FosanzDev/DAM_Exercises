package com.fosanzdev.T11.Ej7C.VisualGestor;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AreaEditorMListener implements MouseListener {

    protected Click click;
    protected int x;
    protected int y;

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        switch (e.getButton()) {
            case MouseEvent.BUTTON1 -> click = Click.LEFT_CLICK;
            case MouseEvent.BUTTON2 -> click = Click.MIDDLE_CLICK;
            case MouseEvent.BUTTON3 -> click = Click.RIGHT_CLICK;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        click = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
