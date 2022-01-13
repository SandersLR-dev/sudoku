package com.company;

public class FixedSudokuField extends SudokuField{

    public FixedSudokuField(int value) {
        super(value);
        setDisplayedValue();
    }
}
