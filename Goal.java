package main.java.model;

public class Goal {
    int row;
    int columns;
    public Goal (int rows, int columns) {
        RandomGenerator rand = new RandomGenerator ();
        this.row = rand.getRandomRowNum(rows);
        this.columns = rand.getRandomColNum(columns);

    }
}
