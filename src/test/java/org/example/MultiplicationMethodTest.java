package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationMethodTest {

    @Test
    void multiply() {
        double result = MultiplicationMethod.multiply(6,2);
        double correct = 12;
        assertEquals(12,result);
    }
}