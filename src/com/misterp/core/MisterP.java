package com.misterp.core;

import com.misterp.ui.Header;
import com.misterp.ui.NumberedOptionDisplay;
import com.misterp.ui.OptionDisplay;

/**
 * UI helper
 */
public class MisterP {

    /**
     * Prints a header on the screen given a certain width.
     * @param headerText the text in the header
     * @param width the width of the header
     */
    public static void printHeader(String headerText, int width) {
        Header h = new Header(headerText, width);
        h.print();
    }

    /**
     * Prints a set of options on the screen
     * @param prompt the prompt before the options
     * @param options the options in style [T]est
     */
    public static void printOptions(String prompt, String... options) {
        OptionDisplay optionsDisplay = new OptionDisplay(prompt, "   ", options);
        optionsDisplay.print();
    }

    /**
     * Prints a set of numbered options on the screen
     * @param prompt the prompt before the options
     * @param options the options in a numbered style
     */
    public static void printNumberedOptions(String prompt, String... options) {
        NumberedOptionDisplay optionsDisplay = new NumberedOptionDisplay(prompt, "   ", options);
        optionsDisplay.print();
    }

    /**
     * Prints some newlines on the screen
     * @param amount the amount of newlines
     */
    public static void skipLines(int amount) {
        System.out.println();
    }

    /**
     * Clears the screen on windows
     */
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Clearscreen command failed");
        }
    }

}