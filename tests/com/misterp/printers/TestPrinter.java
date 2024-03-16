package com.misterp.printers;

import com.misterp.core.MisterP;
import com.misterp.printers.DebugPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPrinter {

    @Test
    public void testBooleans() {

        DebugPrinter p = new DebugPrinter("source");

        assertEquals(p.header, "[source]: ");
        assertTrue(p.allowPrints);

        p.stopPrints();
        assertFalse(p.allowPrints);

        p.allowPrints();
        assertTrue(p.allowPrints);

        assertEquals(p.buildString("abc", "def", "ghi"), "abcdefghi");


    }

}
