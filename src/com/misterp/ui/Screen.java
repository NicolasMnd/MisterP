package com.misterp.ui;

public class Screen {

    public static final int WIDTH = 40;
    private GraphicalUnit[] graphics;
    private final String name;

    public Screen(String name, GraphicalUnit... graphics) {
        this.name = name;
        this.graphics = graphics;
    }

    public void display() {

        cls();
        (new Header(name, WIDTH)).print();

        for(GraphicalUnit u : graphics)
            u.print();

    }

    private void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Clearscreen command failed");
        }
    }

}
