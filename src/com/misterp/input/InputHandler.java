package com.misterp.input;

import java.util.Scanner;

public class InputHandler {

    public static Integer readInteger() {
        Scanner scanner = new Scanner(System.in);
        Object input;

        while (true) {
            try {
                input = scanner.nextLine();

                if (input != null) {
                    try {
                        return new Wrapper(Integer.parseInt((String) input)).getInt();
                    } catch (NumberFormatException e) {
                        return null;
                    }
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        Object input;

        while (true) {
            try {
                input = scanner.nextLine();

                if (input != null) {
                    return (new Wrapper(String.valueOf(input))).getStrValue();
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

}
