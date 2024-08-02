package com.misterp.printers;

import java.util.Formatter;

public class ByteArrayPrinter {

    public ByteArrayPrinter() {

    }

    public String getBytes(String st) {
        Formatter formatter = new Formatter();
        for(byte b : st.getBytes()) formatter.format("%02x", b);
        return formatter.toString();
    }

    public String getBytes(byte[] st) {
        Formatter formatter = new Formatter();
        for(byte b : st) formatter.format("%02x", b);
        return formatter.toString();
    }

}
