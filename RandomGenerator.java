package main.java.model;
import java.util.Random;

public class RandomGenerator {
    public int getRandomRowNum(int r) {
        Random rand = new Random();
        int rowRandom = rand.nextInt(r);
        return rowRandom;
    }
    public int getRandomColNum(int c) {
        Random rand = new Random();
        int colRandom = rand.nextInt((c));
        return colRandom;
    }

    public int isBlock() {
        Random rand = new Random();
        int notBlock = rand.nextInt((99));
        if (notBlock >= 0 && notBlock <= 69) {
            return 0;
        }
        else {
            return 1;
        }

    }
}
