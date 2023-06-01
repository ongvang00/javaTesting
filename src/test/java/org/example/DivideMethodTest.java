package org.example;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {
    @org.junit.jupiter.api.Test
    void divide() {
        double result = DivideMethod.divide(6,2);
        double correct = 3;
        assertEquals(3,result);
    }
}