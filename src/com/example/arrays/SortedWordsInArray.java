package com.example.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedWordsInArray {
    public static void main(String[] args) {
        String[] words = {"haradhan", "thakur"};

        Stream<String> stringStream = Arrays.asList(words).stream()
                .map(word -> word.chars()
                        .sorted()
                        .mapToObj(c -> String.valueOf((char) c)) // cast int to char
                        .collect(Collectors.joining()));         // join without spaces

        // Collect results into an array
        String[] sortedWords = stringStream.toArray(String[]::new);

        // Print results
        System.out.println(Arrays.toString(sortedWords));
    }
}














