package com.exaltpawarikanda.solutions.datastructures.hashTables;

import java.util.HashMap;
import java.util.Map;

public class RecurringCharacter {

    //Google Question
    //Given an array = [2,5,1,2,3,5,1,2,4]:
    //It should return 2

    //Given an array = [2,1,1,2,3,5,1,2,4]:
    //It should return 1

    //Given an array = [2,3,4,5]:
    //It should return undefined

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        System.out.println(firstRecurringChar(numbers));
    }

    public static Integer firstRecurringChar(int[] numbers) {
       Map<Integer, Boolean> numberKeys = new HashMap<>();

       for(int num : numbers){
           if(numberKeys.containsKey(num)){
               return num;
           }else{
               numberKeys.put(num, true);
           }
       }

       return null;
    }


}
