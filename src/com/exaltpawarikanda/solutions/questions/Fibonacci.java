package com.exaltpawarikanda.solutions.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Exalt Pawarikanda on 7/28/21
 */
public class Fibonacci {
    public static List<Integer> fib(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        int a = 0;
        int b = 1;
        for(int i=0; i<n;i++){
            if (i <= 1) {
                fibonacci.add(i);
            }else{
                int sum = a + b;
                fibonacci.add(sum);
                a = b;
                b = sum;
            }
        }
        return fibonacci;
    }
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
