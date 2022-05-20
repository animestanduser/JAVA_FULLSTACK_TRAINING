import java.util.Arrays;
import java.util.Scanner;

public class ScannerSearch {
    public static void main(String[] args){
        int[] numbers = { 34 , 43 , 3443 , 434 , 35 , 67 ,2323};


        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
            System.out.println("enter number to find: ");
        double input = scanner.nextDouble();

            for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == input) {
                System.out.println("we found " + numbers[i] + " at position " + (i + 1));
            }
        }

            for (int i = 1; i < numbers.length; i++) {
            int x = numbers.length / 2;
            if (numbers[x] == input) {
                System.out.println("we found " + numbers[x] + " at position " + (x + 1));
            } else if (input < numbers[x]) {
                x = x / 2;

            } else if (input > numbers[x]) {
                x += x / 2;

            }
        }
    }
}
