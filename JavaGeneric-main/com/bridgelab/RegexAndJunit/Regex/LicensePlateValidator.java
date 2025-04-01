package com.bridgelab.RegexAndJunit.Regex;

public class LicensePlateValidator {
    /**
     * Validates a license plate number.
     * - Must start with exactly two uppercase letters (A-Z).
     * - Must be followed by exactly four digits (0-9).
     * - Total length must be exactly 6 characters.
     * 
     * @param plate The license plate number to validate.
     * @return true if the plate is valid, false otherwise.
     */
    public static boolean isValidLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
        
        // ^        → Start of the string.
        // [A-Z]{2} → Exactly two uppercase letters (A-Z).
        // [0-9]{4} → Exactly four digits (0-9).
        // $        → End of the string.
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidLicensePlate("AB1234")); // true (Valid)
        System.out.println(isValidLicensePlate("A12345")); //  false (Only one letter at the start)
        System.out.println(isValidLicensePlate("ABC123")); //  false (Three letters instead of two)
        System.out.println(isValidLicensePlate("AB12"));   //  false (Less than 6 characters)
        System.out.println(isValidLicensePlate("ab1234")); //  false (Lowercase letters)
        System.out.println(isValidLicensePlate("AB12345"));//  false (Too many digits)
        System.out.println(isValidLicensePlate("XY0000")); //  true (Valid)
    }
}
