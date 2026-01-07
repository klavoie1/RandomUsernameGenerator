import java.util.Random;

public class RandomNumber {
    public static int getRandomNumber() {
        Random random = new Random();

        return random.nextInt(1000);
    }

}
