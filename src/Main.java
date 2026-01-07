import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {

        String randomWordOne = RandomSelector.randomWord();

        String randomWordTwo = RandomSelector.randomWord();

        int randomNumber = RandomNumber.getRandomNumber();

        if (Objects.equals(randomWordOne, randomWordTwo)) {
            String updatedRandomWordTwo = RandomSelector.randomWord();
            System.out.println("Your New Username is: " + randomWordOne + updatedRandomWordTwo + randomNumber);
        } else {
            System.out.println("Your New Username is: " + randomWordOne + randomWordTwo + randomNumber);
        }



    }
}
