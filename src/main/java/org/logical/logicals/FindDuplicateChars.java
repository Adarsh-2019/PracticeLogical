package org.logical.logicals;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChars {

    public static void main(String[] args) {
        String str = "If you have " +
                "best thought " +
                "to other then you " +
                "gate best from other also.";

        Map<Character, Integer> duplicateChars = findDuplicateChars(str);
        System.out.println(duplicateChars);
    }

    private static Map<Character,Integer> findDuplicateChars(String str) {

        char chars[]=str.toCharArray();
        Map<Character,Integer> charCountMap=new HashMap<>();
        for(char ch:chars){
            if(charCountMap.containsKey(ch)){
                charCountMap.put(ch,charCountMap.get(ch)+1);
            }
            else if(!charCountMap.containsKey(ch)){
                charCountMap.put(ch,1);
            }
        }

        return charCountMap;
    }
}
