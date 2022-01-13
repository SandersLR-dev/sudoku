package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SudokuWindow extends JFrame implements FieldValueChangeListener {

    private List<String> puzzle;
    private int[][] tablica;
    private FieldValueChangeListener fieldValueChangeListener = new FieldValueChangeListener() {
        @Override
        public void fieldsChanged() {

        }
    };

    public SudokuWindow() {
        readPuzzle();
        createGui();
        System.out.println(getPuzzle());
        System.out.println(tablica[0][1]);
    }

    private void readPuzzle() {
        try {
            puzzle = Files.readAllLines(Paths.get("puzzle.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        tablica = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablica[i][j] = Integer.parseInt(puzzle.get(i).substring(j, j + 1));
            }
        }

    }

    private void createGui() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(0, 3, 0, 0));

        JPanel jPanel_1 = new JPanel();
        jPanel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_1);
        jPanel_1.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                createSudokuField(jPanel_1, i, j);
            }
        }//3X3

        JPanel jPanel_2 = new JPanel();
        jPanel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_2);
        jPanel_2.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                createSudokuField(jPanel_2, i, j);
            }
        }//3X6

        JPanel jPanel_3 = new JPanel();
        jPanel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_3);
        jPanel_3.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                createSudokuField(jPanel_3, i, j);
            }
        }//3X9

        JPanel jPanel_4 = new JPanel();
        jPanel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_4);
        jPanel_4.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                createSudokuField(jPanel_4, i, j);
            }
        }//6X3

        JPanel jPanel_5 = new JPanel();
        jPanel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_5);
        jPanel_5.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                createSudokuField(jPanel_5, i, j);
            }
        }//6X6

        JPanel jPanel_6 = new JPanel();
        jPanel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_6);
        jPanel_6.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                createSudokuField(jPanel_6, i, j);
            }
        }//6X9

        JPanel jPanel_7 = new JPanel();
        jPanel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_7);
        jPanel_7.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                createSudokuField(jPanel_7, i, j);
            }
        }//9X3

        JPanel jPanel_8 = new JPanel();
        jPanel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_8);
        jPanel_8.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                createSudokuField(jPanel_8, i, j);
            }
        }//9X6

        JPanel jPanel_9 = new JPanel();
        jPanel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.add(jPanel_9);
        jPanel_9.setLayout(new GridLayout(0, 3, 0, 0));

        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                createSudokuField(jPanel_9, i, j);
            }
        }//9X9
        setBounds(100,100,570,466);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
    }

    private void createSudokuField(JPanel jPanel, int i, int j) {
        if (tablica[i][j] != 0) {
            FixedSudokuField sudokuField = new FixedSudokuField(tablica[i][j]);
            sudokuField.setHorizontalAlignment(SwingConstants.HORIZONTAL);
            jPanel.add(sudokuField);
        } else {
            VariableSudokuField sudokuField = new VariableSudokuField(fieldValueChangeListener);
            sudokuField.setHorizontalAlignment(SwingConstants.HORIZONTAL);
            jPanel.add(sudokuField);
        }
    }


    @Override
    public void fieldsChanged() {
        //usuwa errory ze wszystkich pól
        //sprawdza wszystkie pola i ustawia errory jeżeli występują
    }

    public List<String> getPuzzle() {
        return puzzle;
    }
}
