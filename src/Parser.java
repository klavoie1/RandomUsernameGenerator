import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class Parser {
    private static List<String> cachedWords = null;

    public static synchronized List<String> getWords() throws IOException {
        if (cachedWords == null) {
            try (var is = Parser.class.getResourceAsStream("resources/word.txt")) {
                if (is == null) throw new IOException("Word list not found in resources");

                try (var reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
                    cachedWords = reader.lines()
                            .map(String::trim)
                            .filter(line -> !line.isEmpty())
                            .toList();
                }
            }
        }
        return cachedWords;
    }
}