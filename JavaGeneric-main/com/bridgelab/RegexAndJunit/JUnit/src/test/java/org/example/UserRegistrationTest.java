package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("JohnDoe", "john@example.com", "SecureP@ss1"));
        assertDoesNotThrow(() -> registration.registerUser("Alice", "alice123@gmail.com", "HelloWorld9"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "valid@mail.com", "Password9"));
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser(null, "valid@mail.com", "Password9"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "invalid-email", "Password9"));
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Alice", "alice@.com", "HelloWorld9"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("JohnDoe", "john@example.com", "short"));
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Alice", "alice@gmail.com", "nocapital9"));
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Bob", "bob@gmail.com", "NOLOWERCASE9"));
    }
}
