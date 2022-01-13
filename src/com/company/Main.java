package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    new SudokuWindow().setVisible(true);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });

    }
}
