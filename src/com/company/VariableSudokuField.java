package com.company;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VariableSudokuField extends SudokuField{


    @Override
    protected void setValue(int value) {
        super.setValue(value);
        setDisplayedValue();
    }

    public VariableSudokuField(FieldValueChangeListener listener) {
        super(0);
        JPopupMenu popupMenu =new JPopupMenu();
        setBorder( BorderFactory.createEtchedBorder());
        addPopup(this,popupMenu);
        JMenuItem mi;
        popupMenu.add(mi = new JMenuItem("Wyczyść"));
        mi.addActionListener(e -> {
            setValue(0);
            listener.fieldsChanged();
        });

        JMenuItem mi1;
        popupMenu.add(mi1 = new JMenuItem("1"));
        mi1.addActionListener(e -> {
            setValue(1);
            listener.fieldsChanged();
        });

        JMenuItem mi2;
        popupMenu.add(mi2 = new JMenuItem("2"));
        mi2.addActionListener(e -> {
            setValue(2);
            listener.fieldsChanged();
        });

        JMenuItem mi3;
        popupMenu.add(mi3 = new JMenuItem("3"));
        mi3.addActionListener(e -> {
            setValue(3);
            listener.fieldsChanged();
        });

        JMenuItem mi4;
        popupMenu.add(mi4 = new JMenuItem("4"));
        mi4.addActionListener(e -> {
            setValue(4);
            listener.fieldsChanged();
        });

        JMenuItem mi5;
        popupMenu.add(mi5 = new JMenuItem("5"));
        mi5.addActionListener(e -> {
            setValue(5);
            listener.fieldsChanged();
        });

        JMenuItem mi6;
        popupMenu.add(mi6 = new JMenuItem("6"));
        mi6.addActionListener(e -> {
            setValue(6);
            listener.fieldsChanged();
        });

        JMenuItem mi7;
        popupMenu.add(mi7 = new JMenuItem("7"));
        mi7.addActionListener(e -> {
            setValue(7);
            listener.fieldsChanged();
        });

        JMenuItem mi8;
        popupMenu.add(mi8 = new JMenuItem("8"));
        mi8.addActionListener(e -> {
            setValue(8);
            listener.fieldsChanged();
        });

        JMenuItem mi9;
        popupMenu.add(mi9 = new JMenuItem("9"));
        mi9.addActionListener(e -> {
            setValue(9);
            listener.fieldsChanged();
        });

    }

    private void addPopup(VariableSudokuField variableSudokuField, JPopupMenu popupMenu) {
        variableSudokuField.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.isPopupTrigger()){
                    showMenu(e);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger()){
                    showMenu(e);
                }
            }

            private void showMenu(MouseEvent e) {
                popupMenu.show(e.getComponent(), e.getX(), e.getY());
            }

        });
    }
}
