package org.logical.logicals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElementsFromArray {

    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};
        findDuplicate(inputArray);
    }

    private static void findDuplicate(int[] inputArray) {

        Map<Integer, Integer> integerMap=new HashMap<>();

        for(int num:inputArray){
            if(!integerMap.containsKey(num)){
                integerMap.put(num,1);
            }
            else
            {
                integerMap.put(num,integerMap.get(num)+1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet=integerMap.entrySet();
        System.out.println("Duplicate Elements are ");
        for(Map.Entry<Integer,Integer> entry:entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+ ":"+entry.getValue());
            }
        }
    }
}
