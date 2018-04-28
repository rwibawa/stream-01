package com.navisow;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount07 {
    public static void main(String[] args) {
        String[] arr = new String[] { "lorem", "ipsum", "dolor", "lorem", "ipsum", "lorem", "lorem" };
//        Arrays.stream(arr).forEach(System.out::println);
        Map<String, Integer> wordCount = Arrays.stream(arr)
                .parallel()
                .reduce(
                    new LinkedHashMap<>(),
                    (acc, entry) -> {
                        acc.merge(entry, 1,  (value, index) -> value + 1);
                        return acc;
                    },
                    (m1, m2) -> m1
                );

        wordCount.forEach((k, v) -> System.out.printf("%s ==>> %d\n", k, v));
    }
}
