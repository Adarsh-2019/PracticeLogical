package org.logical.logicals;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String str="Today is Friday tf";
        Map<Character, Integer> characterIntegerMap = countCharacters(str);
        System.out.println(characterIntegerMap);
    }

    private static Map<Character,Integer> countCharacters(String str) {
        char[] chars=str.toCharArray();
        Map<Character,Integer> maps=new HashMap<>();
        for (char ch:chars){
            if (!maps.containsKey(ch)){
                maps.put(ch,1);
            }else {
                maps.put(ch,maps.get(ch)+1);
            }
        }
       return maps;
    }
}
