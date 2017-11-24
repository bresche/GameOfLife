package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridTest {

    @Test
    void cellHasNoLivingNeighbours_neighbourCountIsZero() {
        Grid grid = new Grid(3,3);
        Cell aLivingCell = new Cell();
        aLivingCell.setAlive(true);
        grid.addCellAtPosition(aLivingCell, 1,1);
        grid.countNeighboursForAllCellsInGrid();
        assertEquals(0, aLivingCell.getNeighbourCount());
    }

    @Test
    void cellHasThreeLivingNeighbours_neighbourCountIsThree() {
        Grid grid = new Grid(3,3);
        Cell aLivingCell = new Cell();
        aLivingCell.setAlive(true);
        Cell theLivingCellToCheck = new Cell();
        theLivingCellToCheck.setAlive(true);
        grid.addCellAtPosition(aLivingCell, 0,0);
        grid.addCellAtPosition(aLivingCell, 1,0);
        grid.addCellAtPosition(theLivingCellToCheck, 1,1);
        grid.addCellAtPosition(aLivingCell, 2,2);
        grid.countNeighboursForAllCellsInGrid();
        assertEquals(3, theLivingCellToCheck.getNeighbourCount());
    }

    @Test
    void cellHasEightLivingNeighbours_neighbourCountIsEight() {
        Grid grid = new Grid(3,3);
        Cell aLivingCell = new Cell();
        aLivingCell.setAlive(true);
        Cell theLivingCellToCheck = new Cell();
        theLivingCellToCheck.setAlive(true);
        grid.addCellAtPosition(aLivingCell, 0,0);
        grid.addCellAtPosition(aLivingCell, 1,0);
        grid.addCellAtPosition(aLivingCell, 2,0);
        grid.addCellAtPosition(aLivingCell, 0,1);
        grid.addCellAtPosition(theLivingCellToCheck, 1,1);
        grid.addCellAtPosition(aLivingCell, 2,1);
        grid.addCellAtPosition(aLivingCell, 0,2);
        grid.addCellAtPosition(aLivingCell, 1,2);
        grid.addCellAtPosition(aLivingCell, 2,2);
        grid.countNeighboursForAllCellsInGrid();
        assertEquals(8, theLivingCellToCheck.getNeighbourCount());
    }

}