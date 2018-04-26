package com.navisow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class WordCount03 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/com/navisow/assets/original.txt");
        Map<String, Long> wordCount = Files.lines(path)
            .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
            .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
            .filter(word -> word.length() > 0)
            .map(word -> new SimpleEntry<>(word, 1))
            .collect(groupingBy(SimpleEntry::getKey, counting()));


        wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));
    }
}
