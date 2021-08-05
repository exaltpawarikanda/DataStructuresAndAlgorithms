package com.exaltpawarikanda.solutions.interview;

/**
 * Created by Exalt Pawarikanda on 8/5/21
 */
public class Test extends Customer{

    @Override
    public String setCustomerId(){
        return "GS243414414141K";
    }

    @Override
    public String setCustomerName(){
        return "Joe Dor";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Test test1 = new Test();
        Test test2 = new Test();
        //Test test3 = (Test) test1.clone();
        System.out.println(test1 == test2);
        System.out.println(test1.equals(test2));
    }

}
