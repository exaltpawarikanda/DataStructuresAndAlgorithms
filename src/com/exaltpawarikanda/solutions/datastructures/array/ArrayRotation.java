package com.exaltpawarikanda.solutions.datastructures.array;

public class ArrayRotation {


    void rotate(int[] inputArray, int shift, int arraySize) {

        for (int i = 0; i < shift; i++) {

            leftRotationbyOne(inputArray, arraySize);
        }

    }

    void leftRotationbyOne(int[] inputArray, int arraySize) {
        int temp = inputArray[0];
        for (int j = 0; j < arraySize - 1; j++) {
            inputArray[j] = inputArray[j + 1];
        }
        inputArray[arraySize - 1] = temp;
    }


    void print(int[] inputArray) {
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        ArrayRotation arrayRotation = new ArrayRotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        arrayRotation.rotate(arr, 2, 7);
        arrayRotation.print(arr);

    }
}
