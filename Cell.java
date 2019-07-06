package main.java.model;
import javax.swing.*;

public class Cell extends JButton {
    int row;
    int column;
    int Block;

    public Cell() {
        super();
    }

    public Cell(int r, int c) {
        super();
        this.column = c;
        this.row = r;

    }


    public void printLocation() {
        System.out.println("row:" + row + ",column:" + column);
    }

}

