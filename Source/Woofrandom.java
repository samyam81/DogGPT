import java.util.Random;

public class Woofrandom {
    private Random random;

    public Woofrandom() {
        random = new Random();
    }

    public String getRandomWoof() {
        int woofCount = random.nextInt(10, 20) + 1; // Random number between 20 and 10
        StringBuilder woofs = new StringBuilder();
        for (int i = 0; i < woofCount; i++) {
            woofs.append("woof ");
        }
        return woofs.toString().trim();
    }
}
