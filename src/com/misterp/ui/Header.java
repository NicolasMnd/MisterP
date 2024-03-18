package com.misterp.ui;

import com.misterp.printers.Printer;
import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.Color.WHITE;
import static org.fusesource.jansi.Ansi.ansi;

public class Header extends GraphicalUnit {

    private final int width;
    private final Ansi.Color colorDivider, colorText;
    private final String text;

    Header(String text, Ansi.Color colorDivider, Ansi.Color colorText, int width) {
        this.width = width;
        this.colorDivider = colorDivider;
        this.colorText = colorText;
        this.text = text;
    }

    public Header(String text, int width) {
        this.width = width;
        this.colorDivider = WHITE;
        this.colorText = WHITE;
        this.text = text;
    }

    @Override
    public void print() {
        printDivider();
        Printer.printCenter(ansi().fg(colorText).a(text).toString(), width);
        printDivider();
        System.out.println("");
    }

    private void printDivider() {
        String divider = "";
        int i = 0;

        while(i < width) {
            divider += "-";
            i += 1;
        }

        System.out.println(ansi().fg(colorDivider).a(divider));
    }

}
