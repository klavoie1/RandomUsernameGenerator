import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

    int requests;
    int count = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of requests: ");
    requests = input.nextInt();
    input.close();

    while (count < requests) {
        try {
            String word1 = RandomSelector.randomWord();
            String word2;
            do {
                word2 = RandomSelector.randomWord();
            } while (word1.equals(word2));

            int suffix = RandomNumber.getRandomNumber();

            System.out.printf("%s: %s%s%s\n", count, word1, word2, suffix);
            count++;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    }
}

