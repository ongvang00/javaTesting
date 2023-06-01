package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @Test
    void main() {
        double sumResult = AverageMethod.sum(1,1,1);
        double averageResult = AverageMethod.average(sumResult);
        double correct = 1;
        assertEquals(1, averageResult);
    }
}