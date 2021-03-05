package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfOccurrenceInArray {
    public static void main(String[] args) {
        String word = "aabbccdde";


        HashMap<Character, Integer> hm = new HashMap<>();
        char[] characterArray = word.toCharArray(); //change string to array
        //loop through character array
        for(char c : characterArray){
            if(hm.containsKey(c)){  //if character is not present in map, store in map and count
               hm.put(c, hm.get(c) + 1);
            } else{
                hm.put(c,1);
            }
        }
        System.out.println(hm);

    }
}
