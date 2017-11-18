package com.company;

public class Cell {
    private boolean alive;
    private int neighbourCount;

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setNeighbourCount(int neighbourCount) {
        this.neighbourCount = neighbourCount;
    }

    public int getNeighbourCount() {
        return neighbourCount;
    }
}
