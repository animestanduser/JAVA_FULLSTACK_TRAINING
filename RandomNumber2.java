public class RandomNumber2 {
    public static void main(String[] args) {

        double r = Math.random();
        int low  = 10;
        int high = 100;
        int result = (int) (r*(high-low) + low);
        System.out.println(result);
    }
}