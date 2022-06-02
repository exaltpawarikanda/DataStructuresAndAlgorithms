package com.exaltpawarikanda.solutions.datastructures.array;

public class MergeTwoSorted2 {
    public static void main(String[] args){

        int[] numbers1 = {0,3,4,31};
        int[] numbers2 = {4,6,30,90,99,108};
        int[] mergedArray = mergeSortedArray(numbers1, numbers2);
        System.out.print("[ ");
        for(int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }


    public static int[] mergeSortedArray(int[] array1, int[] array2){

        int pointerArray1 = 0;
        int pointerArray2 = 0;
        int sizeArray1 = array1.length;
        int sizeArray2 = array2.length;
        int[] mergedArray = new int[sizeArray1 + sizeArray2];
        int pointerMergedArray = 0;

        if(sizeArray1 == 0){
            return array2;
        }

        if(sizeArray2 == 0){
            return array1;
        }

        do{
            if(array1[pointerArray1] < array2[pointerArray2]){
                mergedArray[pointerMergedArray] = array1[pointerArray1];
                pointerArray1++;
            }else{
                mergedArray[pointerMergedArray] = array2[pointerArray2];
                pointerArray2++;
            }
            pointerMergedArray++;
        }while(pointerArray1 < sizeArray1 && pointerArray2 < sizeArray2);

        while(pointerArray1 < sizeArray1){
            mergedArray[pointerMergedArray] = array1[pointerArray1];
            pointerArray1++;
            pointerMergedArray++;
        }

        while(pointerArray2 < sizeArray2){
            mergedArray[pointerMergedArray] = array2[pointerArray2];
            pointerArray2++;
            pointerMergedArray++;
        }


       return mergedArray;
    }

}
