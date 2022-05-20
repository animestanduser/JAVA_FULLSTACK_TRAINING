public class CharactersSort {

    public static void main(String[] args) {
        char arr[] = new char[]{'a', 'c', 'b'};
        //        int arrInt[] = new int[arr.length];
        char temp = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((int) arr[i] > (int) arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println((arr[i]));
        }
    }
}
    /*
    static int i = 1;

    public static void main(String[] args) {
        String arr[] = {"abc",
                "ccc",
                "bca",
                "dd",
                "aac"};
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : \n%s\n\n",
                Arrays.toString(arr));
    }
}
*/


/// sort array of strings
// Raw Array = {"abc" , "cba" , "bca"}
