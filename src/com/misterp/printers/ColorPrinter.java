package com.misterp.printers;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;

public class ColorPrinter extends Printer {

    private Ansi ansi;

    ColorPrinter() {
        AnsiConsole.systemInstall();
        this.ansi = ansi();
    }

    public ColorPrinter str(String s) {
        ansi.a(s);
        return this;
    }

    public static ColorPrinter build() {
        return new ColorPrinter();
    }

    /**
     * Interacts with {@link org.fusesource.jansi.internal.JansiLoader}
     * @param color
     */
    public ColorPrinter c(String color) {
        switch(color) {
            case "a":
                ansi.fgBright(GREEN);
            case "b":
                ansi.fgBright(BLUE);
            case "c":
                ansi.fgBright(RED);
            case "e":
                ansi.fgBright(YELLOW);
            case "f":
                ansi.fgBright(WHITE);
            case "0":
                ansi.fg(BLACK);
            case "1":
                ansi.fg(BLUE);
            case "2":
                ansi.fg(GREEN);
            case "3":
                ansi.fg(CYAN);
            case "4":
                ansi.fg(RED);
            case "5":
                ansi.fg(MAGENTA);
            case "7":
                ansi.fg(WHITE);
            case "8":
                ansi.fg(YELLOW);
            case "9":
                ansi.fg(DEFAULT);
            default:
                ansi.fg(DEFAULT);
        }
        return this;
    }

    public void out() {
        print(ansi.toString());
    }

}
