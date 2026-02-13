import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        if (word1.contains(" ") || word2.contains(" ")) {
            return;
        }
        String reversed = new StringBuilder(word1).reverse().toString();
        if (reversed.equalsIgnoreCase(word2)) {
            String lower = reversed.toLowerCase();
            String transformed = lower.replaceAll("[aeiou]", "@");
            System.out.println(transformed);
        }
    }
}
