package main.java;
import java.util.Random;
import main.java.model.Grid;

import javax.swing.*;

public class Application {
    public static JFrame frame;

    public static void main(String[] args) {
        initializeFrame();
    }


    //get a random button through the array and change the property of that button


    public static void initializeFrame() {
        frame = new JFrame("Grid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setLocation(250, 250);
        frame.setContentPane(new Grid(10,10));
        frame.setVisible(true);

    }


}
