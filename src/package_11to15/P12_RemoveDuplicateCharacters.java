package package_11to15;

import java.util.HashSet;
import java.util.Set;

public class P12_RemoveDuplicateCharacters  {
    // Remove duplicate character from string
    public static String removeDuplicates(String str) {

            // Use a HashSet to track characters we've seen before
            Set<Character> seen = new HashSet<>();
            // Use a StringBuilder to build the result string
            StringBuilder result = new StringBuilder();

            // Iterate over each character in the string
            for (char c : str.toCharArray()) {
                // If we haven't seen this character before, add it to the result
                if (!seen.contains(c)) {
                    seen.add(c);
                    result.append(c);
                }
            }
            // Convert the StringBuilder to a string and return it
            return result.toString();
        }
        public static void main(String[] args) {
            String input = "abacabad";
            String result = removeDuplicates(input);
            System.out.println("String after removing duplicates: " + result);

        }
    }
