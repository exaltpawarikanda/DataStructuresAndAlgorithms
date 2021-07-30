package com.exaltpawarikanda.solutions.questions;

/**
 * Created by Exalt Pawarikanda on 7/28/21
 */
public class Prime {
    public static int isPrime(long n)  // function definition
    {
        int fact=0;
        for(int i=2;i*i<=n;i++)           // loop from 2 to square root of n
        {
// check if number is divisible by i update the value of variable fact to i and break the loop.

            if(n%i==0)
            {
                fact=i;
                break;     // break from loop
            }
        }
//if value of fact is not zero then number is not prime.
        if(fact!=0)
            return fact;
        else
            return 1;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(24));
    }
}
