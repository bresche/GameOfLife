package com.company;

public class Grid {

    private Cell[][] gridArray;
    private int rows;
    private int columns;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        gridArray = new Cell[rows][columns];

        initGridWithDeadCells();
    }

    private void initGridWithDeadCells() {
        for(int i = 0; i<this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                gridArray[i][j] = new Cell();
            }
        }
    }

    public void generateNextCellGeneration() {

        countNeighboursForAllCellsInGrid();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                gridArray[i][j].evoluteMe();
            }
        }
    }

    public void addCellAtPosition(Cell cell, int row, int col) {
        gridArray[row][col] = cell;
    }

    public void countNeighboursForAllCellsInGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int numberOfNeighbours = countNeighbourCellsForCellAtPosition(i, j);
                gridArray[i][j].setNeighbourCount(numberOfNeighbours);
            }
        }
    }

    private int countNeighbourCellsForCellAtPosition(int row, int column) {
        int neighbourCount = 0;

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {

                int rowToCheck = row + i;
                int columnToCheck = column + j;

                if (boundariesAreValid(rowToCheck, columnToCheck)) {

                    if (!isSameCell(row, column, rowToCheck, columnToCheck)) {

                        Cell neighbour = gridArray[rowToCheck][columnToCheck];

                        if (neighbour.isAlive()) {
                            neighbourCount++;
                        }
                    }
                }
            }
        }
        return neighbourCount;
    }

    private boolean isSameCell(int row, int column, int rowToCheck, int columnToCheck) {
        return rowToCheck == row && columnToCheck == column;
    }

    private boolean boundariesAreValid(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public Cell getCellAtPosition(int row, int column) {
        return gridArray[row][column];
    }
}
