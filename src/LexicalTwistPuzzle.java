import java.util.*;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        if (word1.contains(" ") || word2.contains(" ")) {
            return;
        }
        String reversed = new StringBuilder(word1).reverse().toString();
        if (!reversed.equalsIgnoreCase(word2)) {
            String combined = (word1 + word2).toUpperCase();
            LinkedHashSet<Character> vowelSet = new LinkedHashSet<>();
            LinkedHashSet<Character> consonantSet = new LinkedHashSet<>();
            int vowels = 0;
            int consonants = 0;
            for (int i = 0; i < combined.length(); i++) {
                char ch = combined.charAt(i);
                if ("AEIOU".indexOf(ch) != -1) {
                    vowels++;
                    vowelSet.add(ch);
                } else if (Character.isLetter(ch)) {
                    consonants++;
                    consonantSet.add(ch);
                }
            }
            if (vowels > consonants) {
                int count = 0;
                for (char c : vowelSet) {
                    if (count < 2) {
                        System.out.print(c);
                        count++;
                    }
                }
            } else if (consonants > vowels) {
                int count = 0;
                for (char c : consonantSet) {
                    if (count < 2) {
                        System.out.print(c);
                        count++;
                    }
                }
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
