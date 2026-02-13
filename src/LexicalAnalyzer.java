import java.util.*;

public class LexicalAnalyzer {
    public static void process(String word1, String word2) {
        String reversed = new StringBuilder(word1).reverse().toString();
        if (reversed.equalsIgnoreCase(word2)) {
            String result = reversed.toLowerCase().replaceAll("[aeiou]", "@");
            System.out.println(result);
        } else {
            String combined = (word1 + word2).toUpperCase();
            LinkedHashSet<Character> vowels = new LinkedHashSet<>();
            LinkedHashSet<Character> consonants = new LinkedHashSet<>();
            int v = 0;
            int c = 0;
            for (int i = 0; i < combined.length(); i++) {
                char ch = combined.charAt(i);
                if ("AEIOU".indexOf(ch) != -1) {
                    v++;
                    vowels.add(ch);
                } else if (Character.isLetter(ch)) {
                    c++;
                    consonants.add(ch);
                }
            }
            if (v > c) {
                int count = 0;
                for (char ch : vowels) {
                    if (count < 2) {
                        System.out.print(ch);
                        count++;
                    }
                }
            } else if (c > v) {
                int count = 0;
                for (char ch : consonants) {
                    if (count < 2) {
                        System.out.print(ch);
                        count++;
                    }
                }
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
