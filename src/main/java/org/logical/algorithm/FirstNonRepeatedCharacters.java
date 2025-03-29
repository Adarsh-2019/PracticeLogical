package org.logical.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedCharacters {
    public static void main(String[] args) {
        String input = "Today is Monday";
        char firstNonRepeatedCharacters = firstNonRepeatedCharacters(input);
        System.out.println(firstNonRepeatedCharacters);
    }

    private static char firstNonRepeatedCharacters(String input) {
        char[] chars = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch:chars){
            map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }
}
