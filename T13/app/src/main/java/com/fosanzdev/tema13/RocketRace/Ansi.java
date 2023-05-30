package com.fosanzdev.tema13.RocketRace;

import java.io.PrintStream;

public class Ansi {

    public enum ColorType {
        FOREGROUND, BACKGROUND
    }

    public static final String ESC = "\u001b[";
    public static final String RESET = ESC + "0m";

    public static AnsiColor randomColor() {
        int min = 0;

        int max = AnsiColor.values().length - 1;
        int alea = (int) Math.random() * (max - min + 1) + min;
        return AnsiColor.values()[alea];
    }

    public static void println(String s, boolean bold, AnsiColor fg, AnsiColor bg) {
        println(System.out, s, bold, fg, bg);
    }

    public static void println(PrintStream out, String s, boolean bold, AnsiColor fg, AnsiColor bg) {
        print(out, s, bold, fg, bg);
        out.println();
    }

    public static void print(PrintStream out, String s, boolean bold, AnsiColor fg, AnsiColor bg) {
        for(char c : s.toCharArray()) {
            print(out, c, bold, fg, bg);
        }
    }

    public static void print(String s, boolean bold, AnsiColor fg, AnsiColor bg) {
        print(System.out, s, bold, fg, bg);
    }

    public static void print(PrintStream out, char c, boolean bold, AnsiColor fg, AnsiColor bg) {
        printTo(out, c, -1, -1, bold, fg, bg);
    }

    public static void print(char c, boolean bold, AnsiColor fg, AnsiColor bg) {
        printTo(System.out, c, -1, -1, bold, fg, bg);
    }

    public static void printTo(String s, int row, int col, boolean bold, AnsiColor fg, AnsiColor bg) {
        for(char c : s.toCharArray()) {
            printTo(c, row, col++, bold, fg, bg);
        }
    }

    public static void printTo(char c, int row, int col, boolean bold, AnsiColor fg, AnsiColor bg) {
        printTo(System.out, c, row, col, bold, fg, bg);
    }

    public static void printTo(PrintStream out, char c, int row, int col, boolean bold, AnsiColor fg, AnsiColor bg) {
        String fgColor = getColor(fg, ColorType.FOREGROUND);
        String bgColor = getColor(bg, ColorType.BACKGROUND);
        String negrita = (bold ? "1" : "0");
        String color = "";
        if(!fgColor.isEmpty() || !bgColor.isEmpty()) {
            color = ESC + negrita;
            color += (!fgColor.isEmpty() ? ";" + fgColor : "");
            color += (!bgColor.isEmpty() ? ";" + bgColor : "");
            color += "m";
        }
        if(row >= 0 && col >= 0)
            setCursorTo(row, col);
        out.print(color + c);
        if(!color.isEmpty())
            out.print(RESET);
        out.flush();
    }

    public static void setCursorTo(int row, int col) {
        System.out.print(ESC + row + ";" + col + "f");
    }

    public static String getColor(AnsiColor c, ColorType ct) {
        String result = "";
        if(c != AnsiColor.NONE) {
            switch(ct) {
                case FOREGROUND:
                    result = "3" + c.ordinal();
                    break;
                case BACKGROUND:
                    result = "4" + c.ordinal();
                    break;
            }
        }
        return result;
    }

    public static void clearScreen() {
        System.out.print(ESC + "H");
        System.out.print(ESC + "2J");
        System.out.flush();
    }

    public static void hideCursor() {
        System.out.print(ESC + "?25l");
        System.out.flush();
    }

    public static void showCursor() {
        System.out.print(ESC + "?25h");
        System.out.flush();
    }
}
