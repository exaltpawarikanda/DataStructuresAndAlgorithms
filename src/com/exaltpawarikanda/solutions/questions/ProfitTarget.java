package com.exaltpawarikanda.solutions.questions;

import java.util.Arrays;

/**
 * Created by Exalt Pawarikanda on 7/28/21
 */
public class ProfitTarget {

    public static void main(String[] args) {
        int[] stocksProfit = {5,7,9,13,11,6,6,3,3};
        int n = stocksProfit.length;
        int target = 12;
        Arrays.sort(stocksProfit);//sort Array stocksProfit
        int low = 0;// declare variable low = 0
        int high = n-1;// declare variable high = n-1
        int countPair = 0;//to store pair's of profit
        //continue while loop till low < high
        while(low<high){
            // if stocksProfit[low] plus stocksProfit[high] equal to target, increase countPair,
            // and low by 1 and decrease high by 1
            if(stocksProfit[low] + stocksProfit[high] == target){
                countPair += 1;
                low += 1;
                high -= 1;
            }
            // if stocksProfit[low] plus stocksProfit[high] less than target, increase low by 1
            if(stocksProfit[low] + stocksProfit[high] < target){
                low += 1;
            }
            // if stocksProfit[low] plus stocksProfit[high] greater than target, decrease high by 1
            else{
                high -= 1;
            }
        }
        //display result
        System.out.println(countPair);
    }


}
