package com.navisow;

import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        Stream.of("lorem", "ipsum", "dolor", "sit", "amet").forEach(System.out::println);
    }
}
