package com.company;

import javax.swing.*;
import java.awt.*;

public abstract class SudokuField extends JLabel {
    private int value ;

    public SudokuField(int value) {
        setValue(value);
    }

    protected int getValue() {
        return value;
    }

    protected void setValue(int value) {
        this.value = value;
    }

    protected void setDisplayedValue(){
        setText(value==0 ? "" : String.valueOf(value));
    }

    public void setError(boolean error){
        setBackground(error==true ? Color.red : UIManager.getColor("Panel.background"));
    }

}
