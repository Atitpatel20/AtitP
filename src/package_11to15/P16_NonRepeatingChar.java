package package_11to15;

import java.util.LinkedHashMap;
import java.util.Map;

public class P16_NonRepeatingChar {
    // Non repeating character from string

    public static void main(String[] args) {
        String str = "JavaTpoint";
        char c = firstNonRepeating(str);
        if (c!= '\0') {
            System.out.println("The first character which is not repeating is: " + c);
        } else {
            System.out.println("Either all characters are repeating or string is empty");
        }
    }

    public static char firstNonRepeating(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }
}

