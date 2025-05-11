package org.logical.javaconcept.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//1) Write a Java program to find duplicate elements in an array?
public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};
        findDuplicate(inputArray);
    }

    private static void findDuplicate(int[] inputArray) {
        /*//Using HashSet
        HashSet<Integer> unique=new HashSet<>();
        for (int number:inputArray){
            if (!unique.add(number)){
                System.out.println("Duplicate number:"+number);
            }
        }*/

        //using HashMap
        Map<Integer,Integer> map=new HashMap<>();
        for (int number:inputArray){
            if (map.containsKey(number)){
                map.put(number,map.get(number)+1);
            }else {
                map.put(number,1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer,Integer> entry:entrySet){
            if (entry.getValue()>1){
                System.out.println("Duplicate Number :"+entry.getKey()+" found_"+entry.getValue());
            }
        }
    }
}
