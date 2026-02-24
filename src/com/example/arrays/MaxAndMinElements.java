package com.example.arrays;

public class MaxAndMinElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }

        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);

    }
}
