package org.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeperateWords {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple banana cherry",
                "apple orange banana",
                "grape apple orange banana",
                "cherry orange grape"
        );
        Set<Map.Entry<Boolean, List<String>>> entrySet = strings.stream().collect(Collectors.partitioningBy(str -> str.startsWith("a"))).entrySet();
        for (Map.Entry<Boolean,List<String>> entry:entrySet){
            if (entry.getKey()){
                System.out.println("Word start with 'a':");
            }
            else {
                System.out.println("Word start with other than 'a':");
            }
            System.out.println("-------------------------------");
            List<String> words=entry.getValue();
            for (String word:words) {
                System.out.println(word);
            }
        }
    }
}
