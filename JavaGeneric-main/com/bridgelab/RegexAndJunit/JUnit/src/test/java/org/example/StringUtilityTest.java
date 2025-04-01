package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class StringUtilityTest {

    @Test
    public void testReverseString() {
        StringUtility utils = new StringUtility();
        assertEquals("dcba", utils.reverseString("abcd"));
        assertEquals("", utils.reverseString(""));
        assertEquals("racecar", utils.reverseString("racecar"));
    }

    @Test
    public void testIsPalindrome() {
        StringUtility utils = new StringUtility();
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("RaceCar"));
        assertFalse(utils.isPalindrome("hello"));
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    public void testUpperCases() {
        StringUtility utils = new StringUtility();
        assertEquals("HELLO", utils.convertUpperCases("hello"));
    }
}
