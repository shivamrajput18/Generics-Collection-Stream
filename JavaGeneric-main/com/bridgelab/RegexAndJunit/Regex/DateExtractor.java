package com.bridgelab.RegexAndJunit.Regex;

import java.util.regex.*;
import java.util.*;

public class DateExtractor {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Regex pattern to match dates in dd/mm/yyyy format
        String datePattern = "\\b(\\d{2})/(\\d{2})/(\\d{4})\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(text);

        // Store matched dates
        List<String> dates = new ArrayList<>();

        while (matcher.find()) {
            dates.add(matcher.group()); // Extract matched date
        }

        // Print extracted dates
        System.out.println("Extracted Dates: " + String.join(", ", dates));
    }
}














