import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        System.out.println("Lexical Twist Puzzle");
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        if (word1.contains(" ") || word2.contains(" ")) {
            System.out.println("Invalid input");
            return;
        }
        String reversed = new StringBuilder(word1).reverse().toString();
        if (reversed.equalsIgnoreCase(word2)) {
            System.out.println("Reverse match found");
        } else {
            System.out.println("No reverse match");
        }
    }
}
