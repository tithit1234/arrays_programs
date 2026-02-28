package com.example.arrays;
import java.util.*;

//{9,4,1,6,3,8,2,12,7} find the list of subsets which has 2 numbers whose summation is equals to the target number. target= 10

public class SubsetSumPairs {
    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 6, 3, 8, 2, 12, 7};
        int target = 10;

        // Use a HashSet for fast lookups
        Set<Integer> seen = new HashSet<>();
        List<List<Integer>> subsets = new ArrayList<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                // Found a valid pair
                subsets.add(Arrays.asList(num, complement));
            }
            seen.add(num);
        }

        // Print results
        System.out.println("Subsets with sum = " + target + ":");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}

