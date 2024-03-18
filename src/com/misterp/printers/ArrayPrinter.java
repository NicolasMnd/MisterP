package com.misterp.printers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ArrayPrinter {
    public static <T> String arrayToString(T[] arr) {
        return "[" + stream(arr)
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + "]";
    }

    public static <T> String listToString(List<T> arr) {
        return "[" + arr.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + "]";
    }

}

