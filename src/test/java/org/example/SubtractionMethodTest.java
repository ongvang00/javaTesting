package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionMethodTest {

    @Test
    void subtract() {
        double result = SubtractionMethod.subtract(6,2);
        double correct = 4;
        assertEquals(4,result);

    }
}