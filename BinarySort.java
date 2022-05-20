import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int[] numbers = { 34 , 43 , 3443 , 434 , 35 , 67 ,2323};
        int[] sortednumbers = { 0 , 0 , 0, 0 , 0 , 0 , 0};

        int index = 0;

        for(int i = 0; i <= numbers.length - 1; i++){
            for(int j = 0; j < numbers.length; j++){
                if(numbers[i]>numbers[j]){
                    index = index + 1;
                }
            }
            sortednumbers[index] = numbers[i];
            System.out.println(index);
            index = 0;
        }
        System.out.println(Arrays.toString(sortednumbers));
    }
}