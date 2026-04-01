import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String word1 = RandomSelector.randomWord();
        String word2;

        do {
            word2 = RandomSelector.randomWord();
        } while (word1.equals(word2));

        int suffix = RandomNumber.getRandomNumber();

        System.out.printf("Your New Username is: %s%s%s", word1, word2, suffix);
    }
}
