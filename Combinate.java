import java.util.HashMap;

public class Combinate {
    public static void main(String[] args){

        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char pairOfCharacters;

        HashMap<Character,Integer> hashMapOfPairs = new HashMap<>();

        for(int i = 0; i < characters.length; i++){
            for(int j = i + 1 ; j < characters.length; j++){
                pairOfCharacters = (char)(characters[i] & characters[j]);
                System.out.println(characters[i] + " and " + characters[j] + " gives " + pairOfCharacters);
                if(!hashMapOfPairs.containsKey(pairOfCharacters)){
                    hashMapOfPairs.put(pairOfCharacters, 1);
                } else{
                    hashMapOfPairs.put(pairOfCharacters,hashMapOfPairs.get(pairOfCharacters)+1);
                }
            }
        }
        System.out.println(hashMapOfPairs);
    }
}
