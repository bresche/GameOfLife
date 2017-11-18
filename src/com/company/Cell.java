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

    public void evoluteMe() {
        if(neighbourCount < 2 || neighbourCount > 3) {
            this.alive = false;
        }
        if(neighbourCount == 3) {
            this.alive = true;
        }
    }
}
