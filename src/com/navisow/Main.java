package com.navisow;

import java.io.Console;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] arr = new Integer[] { 1, 2, 3, 4, 5};
        Arrays.stream(arr).map(x -> x * 2).forEach(System.out::println);
    }
}
