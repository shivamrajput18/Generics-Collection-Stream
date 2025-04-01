package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator obj = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, obj.add(2,3), "Addition test failed");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, obj.subtract(3,2), "Subtraction test failed");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, obj.multiply(3,2), "Multiplication test failed");
    }
}
