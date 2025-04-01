
package org.example;

public class PasswordValidator {
    public boolean isValid(String password) {
        // Check minimum length of 8 characters
        if (password.length() < 8) {
            return false;
        }
        // Check for at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        // Check for at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        return true;
    }
}
