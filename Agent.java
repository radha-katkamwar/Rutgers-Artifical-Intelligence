package main.java.model;

public class Agent {
    int row;
    int columns;
    private Cell currentLocation = new Cell ();
    public Agent(int rows, int columns) {
        RandomGenerator rand = new RandomGenerator ();
        this.row = rand.getRandomRowNum(rows);
        this.columns = rand.getRandomColNum(columns);

    }

}
