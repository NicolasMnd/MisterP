package com.misterp.ui;

import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;

public class OptionDisplay extends GraphicalUnit {

    private final Ansi.Color colorLetter, colorRest, colorPrompt;
    private final String[] options;
    private final String prompt, whitespace;

    public OptionDisplay(String prompt, String whitespace, Ansi.Color colorPrompt, Ansi.Color colorLetter, Ansi.Color colorRest, String... options) {
        this.options = options;
        this.colorLetter = colorLetter;
        this.colorPrompt = colorPrompt;
        this.colorRest = colorRest;
        this.prompt = prompt;
        this.whitespace = whitespace;
    }

    public OptionDisplay(String prompt, String whitespace, String... options) {
        this.options = options;
        this.colorLetter = CYAN;
        this.colorPrompt = WHITE;
        this.colorRest = WHITE;
        this.prompt = prompt;
        this.whitespace = whitespace;
    }

    @Override
    public void print() {

        System.out.println(ansi().fg(colorPrompt).a(prompt));
        for(int i = 0; i < options.length; i++) {
            System.out.print(ansi().fg(WHITE).a(whitespace).a("[").fg(colorLetter).a(Character.toString(options[i].toUpperCase().charAt(0))).fg(colorRest).a("]").a(options[i].toLowerCase().substring(1)));
        }
        System.out.println(ansi().fg(colorPrompt).a("\nEnter: "));


    }

}
