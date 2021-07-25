package com.exaltpawarikanda.solutions.datastructures.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayBasics {

    // for each loop is another traversing technique like for loop, while loop, do-while loop introduced in Java5.
    /*
     * For-each loops are not appropriate when you want to modify the array:
     * For-each loops do not keep track of index. So we can not obtain array index using For-Each loop
     * For-each only iterates forward over the array in single steps
     * For-each cannot process two decision making statements at once
     * For-each also has some performance overhead over simple iteration:
     * */
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];


        for (int num : numbers)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }



/*
* Using Generics to change an array to a list
* This will not work for array of primitive types, such as int[], boolean[], double[],...
*  You have to use their class wrappers instead: Integer[], Boolean[], Double[], ...
* or overload your method for each needed primitive type separately.
* */
    public static <T> List<?> changeArrayToList(T[] inputArray){

        List<?> list = Arrays.asList(inputArray);

        return list;

    }


    public static void main(String[] args)
    {
        {
            int[] marks = { 125, 132, 95, 116, 110 };

            Integer[] numbers = { 125, 132, 95, 116, 110 };

           String[] names = { "John", "Pater", "Grace", "Malvern", "Harold" };

            System.out.println("Integer Array as List using Arrays class: " + changeArrayToList(numbers));
            System.out.println("Integer Array as List using Arrays class: " + changeArrayToList(names));

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }
}
