package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilityTest {
    NumberUtility obj = new NumberUtility();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void isEven(int number) {
        boolean expected = (number % 2 == 0);
        assertEquals(expected, obj.isEven(number));

    }
}