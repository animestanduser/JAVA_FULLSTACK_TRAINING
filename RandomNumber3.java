import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber3 {
    public static void main( String args[] ) {
        int random = ThreadLocalRandom.current().nextInt(90);
        random += 10;

        System.out.println(random);
    }
}