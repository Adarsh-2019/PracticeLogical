package org.logical.april;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashtableIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> hashtable = new HashMap<>();
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");

        // Using Iterator to iterate over entries
        Iterator<Map.Entry<Integer, String>> iterator = hashtable.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            // Removing an element using iterator's remove method
            if (entry.getKey() == 2) {
                iterator.remove();
            }
        }

        System.out.println("After removal: " + hashtable);
    }
}
