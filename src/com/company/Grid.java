package com.company;

public class Grid {

    private Cell[][] gridArray;
    private int _rows;
    private int _columns;

    public Grid(int rows, int columns)
    {
        _rows = rows;
        _columns=columns;
        gridArray = new Cell[rows][columns];
    }
    public void setCell(Cell cell, int row, int col)
    {
        gridArray[row][col] = cell;
    }
    public void setNeighbourCount()
    {
            for(int i=0;i<_rows;i++)
            {
                for(int j=0;j<_columns;j++)
                {
                   // gridArray[i][j].setNeighbourCount();
                }
            }
    }
}
