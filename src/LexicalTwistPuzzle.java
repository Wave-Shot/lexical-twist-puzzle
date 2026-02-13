import java.util.Scanner;

public class LexicalTwistPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        if (!WordValidator.isValid(word1) || !WordValidator.isValid(word2)) {
            System.out.println("Invalid word");
            return;
        }
        LexicalAnalyzer.process(word1, word2);
    }
}
