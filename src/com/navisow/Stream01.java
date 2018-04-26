package com.navisow;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;java

public class Stream01 {
    public static void main(String[] args) {
        Stream.of("lorem", "ipsum", "dolor", "sit", "amet").forEach(System.out::println);

        List<String> alphabet = Stream.of("a", "b", "c", "d", "e", "f").collect(Collectors.toList());
        alphabet.stream().forEach(System.out::println);
    }
}
