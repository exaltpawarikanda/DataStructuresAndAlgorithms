package com.exaltpawarikanda.solutions.datastructures.hashTables;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacter {

    // Write code that checks if two arrays contains any common items:
    /**
     * For example:
     * array1 = ['a', 'b', 'c', 'x']
     * array2 = ['z', 'y', 'i']
     * should return false
     *
     * array1 = ['a', 'b', 'c', 'x']
     * array2 = ['z', 'y', 'x']
     * should return true
     */

    public static void main(String[] args) {
       char[] array1 = new char[]{'a', 'b', 'c', 'x'};
       char[] array2 = new char[]{'z', 'y', 'x'};

        System.out.println(searchForCommonItem(array1, array2));
    }

    public static Boolean searchForCommonItem(char[] array1, char[] array2){
        Map<Character, Boolean> arrayMap = new HashMap<>();

        for(char character1: array1){
            arrayMap.put(character1, true);
        }

        for(char character2: array2){
            if(arrayMap.containsKey(character2)){
                return true;
            } else {
                arrayMap.put(character2, true);
            }
        }

        return false;
    }

}
