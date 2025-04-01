package org.example;

import java.util.Stack;

public class StringUtility {

    public String reverseString(String str) {
        String st = "";
        for (int i = str.length()-1; i >= 0; i--) {
            st += str.charAt(i);
        }
        return st;
    }

    public boolean isPalindrome(String str) {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversed); // Case-insensitive comparison
    }



    public String convertUpperCases(String str){
        return str.toUpperCase();
    }


}
