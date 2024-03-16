package com.misterp.printers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {
    public static <T> String arrayToString(T[] arr) {
        return "[" + Arrays.stream(arr)
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + "]";
    }

}

