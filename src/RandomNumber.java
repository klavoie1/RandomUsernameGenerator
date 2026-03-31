import java.util.Date;
import java.util.Random;

public class RandomNumber {
    public static int getRandomNumber() {

        Date currentDate = new Date();

        Random random = new Random(currentDate.getTime() - 1);

        return random.nextInt(9999);
    }

}
