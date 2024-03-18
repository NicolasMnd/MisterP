package com.misterp.ui;

/**
 * A screen class holds a set of {@link GraphicalUnit} objects that are printed in the order in which they are given.
 */
public class Screen {

    public static final int WIDTH = 40;
    private GraphicalUnit[] graphics;
    private final String name;

    public Screen(String name, GraphicalUnit... graphics) {
        this.name = name;
        this.graphics = graphics;
    }

    /**
     * Displays the current screen
     */
    public void display() {

        cls();
        (new Header(name, WIDTH)).print();

        for(GraphicalUnit u : graphics)
            u.print();

    }

    /**
     * Clears the screen on windows
     */
    private void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Clearscreen command failed");
        }
    }

}
