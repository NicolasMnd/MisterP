package com.misterp.ui;

import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;

public class NumberedOptionDisplay extends GraphicalUnit {

    private final String[] options;
    private final String prompt, whitespace;
    private final Ansi.Color colorPrompt, colorOptions, colorNumbers;

    public NumberedOptionDisplay(String prompt, String whitespace, Ansi.Color colorPrompt, Ansi.Color colorOptions, Ansi.Color colorNumbers, String... options) {
        this.options = options;
        this.prompt = prompt;
        this.colorOptions = colorOptions;
        this.colorPrompt = colorPrompt;
        this.colorNumbers = colorNumbers;
        this.whitespace = whitespace;
    }

    public NumberedOptionDisplay(String prompt, String whitespace, String... options) {
        this.options = options;
        this.prompt = prompt;
        this.colorOptions = WHITE;
        this.colorPrompt = WHITE;
        this.colorNumbers = WHITE;
        this.whitespace = whitespace;
    }

    public int getAmount() {
        return this.options.length;
    }

    @Override
    public void print() {

        System.out.println(ansi().fg(colorPrompt).a(prompt));
        System.out.println();

        for(int i = 0; i < options.length; i++)
            System.out.println(ansi().fg(colorNumbers).a(Integer.toString(i+1) + ") ").fg(colorOptions).a(options[i]).reset());
        System.out.println("\n");

    }

}
