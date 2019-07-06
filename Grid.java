package main.java.model;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Grid extends JPanel {
    private Cell grid[][];

    public Grid(int rows, int columns) {
        RandomGenerator randomGen = new RandomGenerator();
        GridLayout layout = new GridLayout(rows, columns);
        Agent agent = new Agent (rows, columns);
        Goal goal = new Goal (rows, columns);

        System.out.println("Agent is at row" + agent.row + "and columns " + agent.columns);
        System.out.println("Goal is at row" + goal.row + "and column " + goal.row);
        setLayout(layout);
        grid = new Cell[rows][columns];

        Random rand = new Random();
        int blockCounter = 0;
        int noBlockCounter = 0;
        String b = "Block";
        String nb = "No Block";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Cell cell = new Cell(i, j);
                grid[i][j] = cell;
                cell.Block = randomGen.isBlock();//if Block is 0 then free space if Block is 1 then block
                if (cell.Block == 0) {
                    noBlockCounter++;
                }else {
                    blockCounter ++;
                }
                add(cell);
                /*

                **SETS TEXT FIELD FOR AGENT, GOAL, BLOCK, NO BLOCK**

                */
                if (cell.Block == 1 ) {
                    cell.setText(nb);
                }
                else if (cell.row == agent.row && cell.column == agent.columns) {
                    cell.setText("AGENT");
                }
               else if (cell.row == goal.row && cell.column == agent.columns) {
                    cell.setText("GOAL");
                }
                else if (cell.Block == 0) {
                    cell.setText(b);
                }
                //cell.printLocation();
            }
        System.out.println("num blocks is " + blockCounter + "num nonBlocks is " + noBlockCounter);
        } //TEST to see if block count is 30% and non block count is about 70%


    }

}




