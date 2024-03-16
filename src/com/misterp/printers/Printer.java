package com.misterp.printers;

import java.util.List;

public class Printer {

    /**
     * Source: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println/5762502#5762502
     */
    //Normal
    final String ANSI_RESET = "\u001B[0m";
    final String BLACK = "\033[0;90m";  // BLACK
    final String RED = "\033[0;91m";    // RED
    final String GREEN = "\033[0;92m";  // GREEN
    final String YELLOW = "\033[0;93m"; // YELLOW
    final String BLUE = "\033[0;94m";   // BLUE
    final String PURPLE = "\033[0;95m"; // PURPLE
    final String CYAN = "\033[0;96m";   // CYAN
    final String WHITE = "\033[0;97m";
    //Darker
    final String BLACKD = "\033[0;30m";   // BLACK
    final String REDD = "\033[0;31m";     // RED
    final String GREEND = "\033[0;32m";   // GREEN
    final String YELLOWD = "\033[0;33m";  // YELLOW
    final String BLUED = "\033[0;34m";    // BLUE
    final String PURPLED = "\033[0;35m";  // PURPLE
    final String CYAND = "\033[0;36m";    // CYAN
    final String WHITED = "\033[0;37m";   // WHITE
    //Bold
    final String GREEN_BOLD = "\033[1;32m";  // GREEN
    final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    final String BLUE_BOLD = "\033[1;34m";   // BLUE
    final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    final String CYAN_BOLD = "\033[1;36m";   // CYAN
    final String WHITE_BOLD = "\033[1;37m";  // WHITE
    //Bold light
    final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

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
