package com.exaltpawarikanda.solutions.questions;

import java.util.Arrays;

/**
 * Created by Exalt Pawarikanda on 7/28/21
 */
public class ProgrammerContest {

    static int minimizeBias(int[] ratings)
    {
        Arrays.sort(ratings); //sort the array
        int n = ratings.length;
        int ans=0;
        for(int i=1;i<n;i+=2)
        {
            ans += (ratings[i] - ratings[i-1]); //add the difference of the consecutive elements
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,2};
        System.out.println(minimizeBias(arr));
    }
}
