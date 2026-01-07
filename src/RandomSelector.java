import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomSelector {

    public static String randomWord() throws IOException {
        ArrayList<String> words = Parser.scannerParser();

        Random random = new Random();

        int randomNumber = random.nextInt(words.size());

        return words.get(randomNumber);
    }

}
