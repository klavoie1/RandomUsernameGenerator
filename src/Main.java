import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws IOException {
        int requests = 1; // Default to 1 if no count is provided

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-c") && i + 1 < args.length) {
                try {
                    requests = Integer.parseInt(args[i + 1]);
                    i++;
                } catch (NumberFormatException e) {
                    System.err.println("Error: -c requires a valid integer.");
                    return;
                }
            }
        }

        // Added list here to prevent a repetitive fetching of the word list. This was causing almost
        // 7x the runtime. Fetching 1 million usernames went from ~7.2 sec to ~1.7 seconds
        List<String> words = Parser.getWords();
        int wordCount = words.size();

        // We are using StringBuilder here to batch output instead of printing every line immediately. The print
        // function was unnecessarily printing each run.
        StringBuilder output = new StringBuilder();
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int count = 1; count <= requests; count++) {
            String word1 = words.get(random.nextInt(wordCount));
            String word2;

            // This is used to prevent the Username from being a duplicate like ForestForest3242
            do {
                word2 = words.get(random.nextInt(wordCount));
            } while (word1.equals(word2));

            int suffix = random.nextInt(10001);

            // Fast concatenation of the username. Gets added to the output list and is displayed in "chunks"
            output.append(count).append(": ")
                    .append(word1).append(word2).append(suffix)
                    .append("\n");

            // Periodically flush the buffer to keep memory usage low. Really the program will never print more than
            // 10 usernames at most. If there is an edge case, this will help remove RAM usage.
            if (count % 1000 == 0) {
                System.out.print(output);
                output.setLength(0);
            }
        }
        System.out.print(output);
    }
}