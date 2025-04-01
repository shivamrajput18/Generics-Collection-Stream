package com.bridgelab.RegexAndJunit.Regex;

import java.util.regex.*;
import java.util.*;

public class CapitalizedWordExtractor {
    /*
     * Extracts all capitalized words from a given sentence.
     *  A capitalized word starts with an uppercase letter (A-Z).
     *  Followed by lowercase letters (optional).
     */

    public static List<String> extractCapitalizedWords(String text) {
        // Regular expression to match words that start with a capital letter
        String regex = "\\b[A-Z][a-z]*\\b";
        

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // List to store extracted capitalized words
        List<String> capitalizedWords = new ArrayList<>();

        // Find and add all matching words
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        return capitalizedWords;
    }

    public static void main(String[] args) {
        // Example sentence
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Extract capitalized words
        List<String> words = extractCapitalizedWords(text);

        // Print extracted words
        System.out.println(words);
    }
}






