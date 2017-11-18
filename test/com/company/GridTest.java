package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class GridTest {

    @Test
    void testSomething(){
        //given:
        Grid grid = new Grid(1,1);
        grid.setCell(new Cell(),0,0);


        //expected:
        assertNotNull(grid);
    }
}