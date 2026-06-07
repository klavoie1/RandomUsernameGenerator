import java.security.SecureRandom;

public class RandomNumber {

    private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static int getRandomNumber() {
        return SECURE_RANDOM.nextInt(10001);
    }
}
