package com.exaltpawarikanda.solutions.interview;

/**
 * Created by Exalt Pawarikanda on 8/5/21
 */
public interface Car {
     String getName();
     String getMake();
     void printDetails();
     default void register(){
        System.out.println("default register implementation.....");
    }
}
