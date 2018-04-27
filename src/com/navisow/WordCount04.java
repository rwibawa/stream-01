package com.navisow;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount04 {
    public static void main(String[] args) {
        String[] arr = new String[] { "lorem", "ipsum", "dolor", "lorem", "ipsum", "lorem" };
//        Arrays.stream(arr).forEach(System.out::println);
        Map<String, Integer> wordCount = Arrays.stream(arr)
                .parallel()
                .map(word -> new AbstractMap.SimpleEntry<>(word, 1))
                .reduce(
                    new LinkedHashMap<>(),
                    (acc, entry) -> {
//                        System.out.printf("%s ==>> %d\n", entry.getKey(), entry.getValue());
                        acc.computeIfPresent(entry.getKey(), (k, v) -> v + entry.getValue());
                        acc.putIfAbsent(entry.getKey(), entry.getValue());
                        return acc;
                    },
                    (m1, m2) -> {
//                        m2.forEach((k, v) -> {
//                           m1.computeIfPresent(k, (m2k, m2v) -> m2v + v);
//                           m1.putIfAbsent(k, v);
//                        });

                        return m1;
                    }
                );
        wordCount.forEach((k, v) -> System.out.printf("%s ==>> %d\n", k, v));
    }
}
