package com.bridgelab.RegexAndJunit.Regex;

import java.util.regex.*;
import java.util.*;

public class EmailExtractor {
    /*
       Extracts all email addresses from the given text.
      Matches valid email formats like "user@example.com".
       Supports multiple email addresses in a text.
     */

    public static List<String> extractEmails(String text) {
        // Regular expression for matching email addresses
        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // List to store extracted emails
        List<String> emails = new ArrayList<>();

        // Find and add all matching emails
        while (matcher.find()) {
            emails.add(matcher.group());
        }

        return emails;
    }

    public static void main(String[] args) {
        // Example text
        String text = "Contact us at support@example.com and info@company.org. Also, reach out to admin123@domain.net";

        // Extract emails
        List<String> emails = extractEmails(text);

        // Print extracted emails
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
