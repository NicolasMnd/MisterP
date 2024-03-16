package com.misterp.printers;

import com.misterp.printers.ArrayPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayPrinter {

    @Test
    public void testArrayPrinter() {

        Integer[] s = {1,2,3,4};
        assertEquals(ArrayPrinter.arrayToString(s), "[1, 2, 3, 4]");

        Double[] t = {1d,2d,3d,4d};
        assertEquals(ArrayPrinter.arrayToString(t), "[1.0, 2.0, 3.0, 4.0]");

    }

}
