package com.bridgelab.RegexAndJunit.Regex;

public class UsernameValidator {
    /**
     * This method checks if a given username is valid based on the following rules:
     * - Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_).
     * - Must start with a letter (a-z or A-Z).
     * - Must be between 5 to 15 characters long.
     */

    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
        
        // ^               → Ensures the username starts at the beginning of the string.
        // [a-zA-Z]        → The first character must be a letter (uppercase or lowercase).
        // [a-zA-Z0-9_]    → Allows only letters, numbers, and underscores (_) for remaining characters.
        // {4,14}          → Limits the remaining part to be between 4 and 14 characters (total length = 5 to 15).
        // $               → Ensures the username ends at the last character (no extra characters allowed).
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidUsername("user_123"));  
        System.out.println(isValidUsername("123user"));   
        System.out.println(isValidUsername("us"));        
        System.out.println(isValidUsername("valid_user"));
        System.out.println(isValidUsername("user#name")); 
        System.out.println(isValidUsername("ThisIsTooLongForAUser"));

    }
}
