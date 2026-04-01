import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;

public class RandomSelector {
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static String randomWord() throws IOException {
        List<String> words = Parser.getWords();
        return words.get(SECURE_RANDOM.nextInt(words.size()));
    }
}
