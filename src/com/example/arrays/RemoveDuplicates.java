package com.example.arrays;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num); // duplicates automatically ignored
        }

        // Convert back to array
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }

        System.out.println(Arrays.toString(uniqueArr));
    }
}

