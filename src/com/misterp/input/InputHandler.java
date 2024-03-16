package com.misterp.input;

import java.util.Scanner;

public class InputHandler {

    public static Wrapper getInput() {
        Scanner scanner = new Scanner(System.in);
        Object input;

        while (true) {
            try {
                input = scanner.nextLine();

                if (input != null) {
                    try {
                        return new Wrapper(Integer.parseInt((String) input));
                    } catch (NumberFormatException e) {
                        return new Wrapper((String) input);
                    }
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

}
