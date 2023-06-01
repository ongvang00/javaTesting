package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {
    @Test
    public void testDoubleToIntConversion() {
        double num = 112.35;
        int expectedValue = 112;
        int actualValue = (int) num;
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testStringToIntConversion() {
        String fortynine = "49";
        int expectedValue = 49;
        int actualValue = Integer.parseInt(fortynine);
        assertEquals(expectedValue, actualValue);
    }
}
