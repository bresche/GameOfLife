package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTest {

    Cell cell;

    @BeforeEach
    void createCell() {
        cell = new Cell();
    }

    @Test
    void newDeadCellIsCreated() {
        assertEquals(cell.isAlive(), false);
    }
    
    @Test
    void setNeighbourCount() {
        cell.setNeighbourCount(3);
        assertEquals(cell.getNeighbourCount(), 3);
    }

    @Test
    void cellDiesIfUnderpopulated(){
        cell.setNeighbourCount(0);
        cell.evoluteMe();
        assertEquals(cell.isAlive(),false);
        cell.setNeighbourCount(1);
        cell.evoluteMe();
        assertEquals(cell.isAlive(),false);
    }

    @Test
    void cellDiesIfOverpopulated(){
        cell.setNeighbourCount(4);
        cell.evoluteMe();
        assertEquals(cell.isAlive(),false);
    }

    @Test
    void cellRevives(){
        cell.setNeighbourCount(3);
        cell.evoluteMe();
        assertEquals(cell.isAlive(),true);
    }

    @Test
    void cellDoesNotChange(){
        cell.setAlive(true);
        cell.setNeighbourCount(2);
        cell.evoluteMe();
        assertEquals(cell.isAlive(),true);
        cell.setAlive(false);
        cell.setNeighbourCount(2);
        cell.evoluteMe();
        assertEquals(cell.isAlive(),false);
    }

}