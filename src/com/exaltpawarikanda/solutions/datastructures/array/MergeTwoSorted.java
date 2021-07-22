package com.exaltpawarikanda.solutions.datastructures.array;

import java.util.Scanner;

class MergeTwoSorted
{

    public static void mergeArrays(int[] arr1, int[] arr2)
    {
        int n1 = arr1.length;

        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];

        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i= 0 ; i < n; i++){
            a[i] =  scanner.nextInt();
        }
        n = scanner.nextInt();
        int b[] = new int[n];
        for(int i= 0 ; i < n; i++){
            b[i] =  scanner.nextInt();
        }


        mergeArrays(a, b);

        System.out.println("Array after merging");
        int[] arr3 = new int[a.length + b.length];
        for (int i=0; i < arr3.length; i++)
            System.out.println(arr3[i] + " ");
    }
}


