package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTest {

    Cell cell;
    @BeforeEach
    void createCell(){
        cell = new Cell();
    }

    @Test
    void newDeadCellIsCreated() {
        assertEquals(cell.isAlive(), false);
    }

    @Test
    void setNeighbourCount(){
        cell.setNeighbourCount(3);
        assertEquals(cell.getNeighbourCount(), 3);
    }

}