import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {34, 43, 3443, 434, 35, 67, 2323};


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

        int firstElement = 0;
        int lastElement = numbers.length - 1;
        int mid = (firstElement + lastElement) / 2;
        int looper = 0;

        while ( firstElement < lastElement ){
            if (numbers[mid]==input) {
                System.out.println("");
                break;
            } else if(numbers[mid] > input){
                lastElement = mid;
            } else if(numbers[mid] < input){
                firstElement = mid;
            }

            looper++;
        }
    }
}
