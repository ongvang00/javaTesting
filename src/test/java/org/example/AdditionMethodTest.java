package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionMethodTest {

    @Test
    void add() {
        double result = AdditionMethod.add(6,2);
        double correct = 8;
        assertEquals(8,result);
    }
}