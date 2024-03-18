package com.misterp.printers;

import java.util.List;

public class Printer {

    /**
     * Determines if this printer should allow print commands
     */
    boolean allowPrints = true;

    public Printer() {}

    /**
     * Allows the printer to output print statements
     */
    public void allowPrints() {
        allowPrints = true;
    }

    /**
     * Stops the printer from outputting statements.
     */
    public void stopPrints() {
        allowPrints = false;
    }

    /**
     * Prints a string in the center of given columns
     * @param s The string which is to be printed
     * @param columns The amount of columns available
     */
    public static void printCenter(String s, int columns) {
        // "abc" over 6: 6 - 3 = 3 -> 4/2 == 2 white spaces in the beginning
        int remainingSpaces = columns - s.length() % 2 != 0 ? (columns - s.length() + 1) / 2 : (columns - s.length()) / 2;
        String whitespace = "";
        while(remainingSpaces > 0) {
            whitespace += " ";
            remainingSpaces--;
        }
        Printer.prints(whitespace + s);
    }

    /**
     * Default printer
     * @param s The string to be printed
     */
    public void print(String s) {
        if(allowPrints)
            System.out.println(s);
    }

    public static void prints(String s) {
        System.out.println(s);
    }

    public void print(String... s) {
        if(allowPrints)
            System.out.println(buildString(s));
    }

    public static void prints(String... s) {
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < s.length; i++) {
            b.append(s[i]);
        }
        System.out.println(b.toString());
    }

    /**
     * Efficient String maker given an array of strings. This can save 100s or even 1000s of nanoseconds
     * @param s all given strings which should be mended together
     * @return the string mended together
     */
    public final String buildString(String... s) {
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < s.length; i++) {
            b.append(s[i]);
        }
        return b.toString();
    }

    /**
     * Function that returns a string representation of a list
     * @param list the list which should be transformed into a string
     * @return a formatted version of the list
     */
    public String listString(List<?> list) {
        StringBuilder b = new StringBuilder();
        b.append("[");
        for(int i = 0; i < list.size(); i++) {
            b.append(list.get(i));
            if(i < list.size()-1) b.append(", ");
        }
        b.append("]");
        return b.toString();
    }

}
