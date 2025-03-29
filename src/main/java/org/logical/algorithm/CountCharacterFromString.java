package org.logical.algorithm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountCharacterFromString {
    public static void main(String[] args) {
        String input = "Today is Monday";
        countCharacters(input);
    }

    private static void countCharacters(String input) {
        char[] chars = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i])+1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue()>0){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
        }
    }
}
