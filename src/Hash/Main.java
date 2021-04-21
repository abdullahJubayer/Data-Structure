package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println( findFirstRepeatedCharacter("abcad d ddb"));;
    }


    //Time Complexity of This Method is O(n^2)
    public static char findFirstNonRepeatedCharacter(String str) {
        Map<Character,Integer> map=new HashMap<>();
        var chars=str.toCharArray();
        for (Character character:chars)
            if (map.containsKey(character))
                map.put(character,map.get(character)+1);
            else
                map.put(character,1);


            for (Character c:chars)
                if (map.get(c)==1)
                    return c;

        return Character.MIN_VALUE;
    }

    public static char findFirstRepeatedCharacter(String str) {
        Set<Character> set=new HashSet<>();
        for (char c:str.toCharArray()){
            if (set.contains(c))
                return c;
            set.add(c);
        }

        return Character.MIN_VALUE;
    }

}
