import java.util.Arrays;

public class ArrayLoop {
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
    }
}