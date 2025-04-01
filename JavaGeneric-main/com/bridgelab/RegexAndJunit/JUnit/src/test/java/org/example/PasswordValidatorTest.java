package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPasswords() {
        assertTrue(validator.isValid("StrongP@ss1"));
        assertTrue(validator.isValid("MySecure123"));
        assertTrue(validator.isValid("Password9"));
    }

    @Test
    void testInvalidPasswords() {
        assertFalse(validator.isValid("weak")); // Too short
        assertFalse(validator.isValid("onlylowercase")); // No uppercase, no digit
        assertFalse(validator.isValid("ALLUPPERCASE")); // No digit
        assertFalse(validator.isValid("12345678")); // No uppercase letter
    }
}
