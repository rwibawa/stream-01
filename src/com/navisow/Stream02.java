package com.navisow;

import java.util.Arrays;

public class Stream02 {
    public static void main(String[] args) {
        // total length of the string array
        String[] arr = new String[] { "one", "two", "three", "four", "five"};
        int totalLength = Arrays.stream(arr)
                .reduce(
                        0,  // seed
                        (acc, item) -> acc + item.length(), // accumulator
                        (t1, t2) -> t1 + t2 // combiner
                );
        System.out.println(totalLength);

        // the sequential result and the parallel result should be the same
        totalLength = Arrays.stream(arr)
                .parallel()
                .reduce(
                        0,
                        (acc, item) -> acc + item.length(),
                        (t1, t2) -> t1 + t2
                );
        System.out.println(totalLength);
    }
}
