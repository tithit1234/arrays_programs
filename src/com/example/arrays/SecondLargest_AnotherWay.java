package com.example.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

//Important Program for Interview
public class SecondLargest_AnotherWay {

    static void main(String[] args) {
        int[] arr = {9, 4, 7, 3};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println("First way - The second largest element is " + arr[arr.length - 2]);
        System.out.println("The smallest element is " + arr[0]);

        //Another way using Java 8
        Integer[] arr1 = {9, 4, 7, 3};
        Optional<Integer> first = Arrays.asList(arr1).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if (first.isPresent()) {
            System.out.println("Second way -The second largest element is " + first.get());
        }

        //Arrays.stream(arr4)
        int[] arr4 = {9, 4, 7, 3};
        int secondLargest2 = Arrays.stream(arr4).distinct().sorted().skip(arr4.length - 2).findFirst().getAsInt();
        System.out.println("Third way - Second largest: " + secondLargest2);

        //Arrays.sort
        int[] arr2 = {9, 4, 7, 3};
        Arrays.sort(arr2); // sorts ascending
        int secondLargest = arr2[arr2.length - 2];
        System.out.println("Fourth way - Second largest: " + secondLargest);

        //Single Pass
        int[] arr3 = {9, 4, 7, 3};
        int largest = Integer.MIN_VALUE;
        int secondLargest1 = Integer.MIN_VALUE;

        for (int num : arr3) {
            if (num > largest) {
                secondLargest1 = largest;
                largest = num;
            } else if (num > secondLargest1 && num != largest) {
                secondLargest1 = num;
            }
        }
        System.out.println("Fifth way - Second largest: " + secondLargest1);




    }

}
