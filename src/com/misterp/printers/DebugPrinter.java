package com.misterp.printers;

public class DebugPrinter extends Printer {

    final String header;

    public DebugPrinter(String header) {
        this.header = "[" + header + "]: ";
    }

    @Override
    public void print(String s) {
        super.print(header + s);
    }

}
