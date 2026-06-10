import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class Parser {
    private static List<String> cachedWords = null;

    /**
     * Retrieves a list of words from the internal 'word.txt' resource file.
     *
     * <p>This method reads the file once and caches the result in memory for subsequent calls.
     * Each line in the file is trimmed, and empty lines are automatically excluded from the returned list.</p>
     *
     * @return An unmodifiable {@link List} of strings containing the words found in the resource file.
     * @throws IOException If the resource 'resources/word.txt' cannot be found or an error occurs during reading.
     * @author klavoie
     */
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