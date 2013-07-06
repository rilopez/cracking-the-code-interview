package crackingTheCodeInterview.arraysandstrings;

import java.util.HashSet;
import java.util.Set;

public class StringAndArrayUtils {
    public static boolean hasUniqueCharacters(String inputString) {
        if(inputString == null || inputString.equals("")) return false;
        Set<Character> charSet = new HashSet<Character>();
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            if(!charSet.contains(character)) {
                charSet.add(character);
            }else{
                return false;
            }
        }
        return true;
    }


    public static boolean hasUniqueCharactersWithoutAdditionalDataStructure(String inputString) {
        if(inputString == null || inputString.equals("")) return false;

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            if(inputString.indexOf(character,i+1)> i) {
                return false;
            }
        }
        return true;
    }
}
