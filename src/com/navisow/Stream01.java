package com.navisow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        Stream.of("lorem", "ipsum", "dolor", "sit", "amet").forEach(System.out::println);

        List<String> alphabet = Stream.of("a", "b", "c", "d", "e", "f").collect(Collectors.toList());
        alphabet.stream().forEach(System.out::println);

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.merge("a", 1, (v1, v2) -> v1 + v2);
        map.merge("b", 1, (v1, v2) -> v1 + v2);
        map.forEach((k, v) -> System.out.printf("%s ==>> %d\n", k, v));
    }
}
