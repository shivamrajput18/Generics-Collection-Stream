package com.bridgelab.RegexAndJunit.Regex;

public class HexColorValidator {

     /* Validates a hex color code.
     * - Must start with a `#` symbol.
     * - Followed by exactly **6** hexadecimal characters (0-9, A-F, a-f).
     */

    public static boolean isValidHexColor(String color) {
        return color.matches("^#[0-9A-Fa-f]{6}$");
        
        // ^         → Start of the string.
        // #         → Must start with a `#`.
        // [0-9A-Fa-f]{6} → Exactly 6 hexadecimal characters (0-9, A-F, a-f).
        // $         → End of the string.
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidHexColor("#FFA500")); //  true (Valid)
        System.out.println(isValidHexColor("#ff4500")); //  true (Valid)
        System.out.println(isValidHexColor("#123"));    //  false (Too short)
        System.out.println(isValidHexColor("FFA500"));  //  false (Missing #)
        System.out.println(isValidHexColor("#GGGGGG")); //  false (Invalid hex characters)
        System.out.println(isValidHexColor("#000000")); //  true (Valid)
        System.out.println(isValidHexColor("#abc123")); //  true (Valid)
    }
}
