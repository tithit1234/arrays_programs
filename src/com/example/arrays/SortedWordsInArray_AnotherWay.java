package com.example.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedWordsInArray_AnotherWay {
    public static void main(String[] args) {
        String[] words = {"haradhan", "thakur"};

        Stream<String> stringStream1 = Arrays.asList(words).stream()
                .map(word -> word.chars().sorted().mapToObj(Character::toString).collect(Collectors.joining()));

        String[] sortedWords1 = stringStream1.toArray(String[]::new);
        System.out.println(Arrays.toString(sortedWords1));

    }
}














