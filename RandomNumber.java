import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(90);
        n += 10;

        System.out.println(n);
    }
}