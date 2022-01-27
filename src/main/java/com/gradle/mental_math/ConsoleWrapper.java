package com.gradle.mental_math;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleWrapper {
    private final PrintStream out;
    private final Scanner scanner;

    public ConsoleWrapper(InputStream in, PrintStream out) {
        this.out = out;
        this.scanner = new Scanner(in);
    }

    public void print(String toPrint) {
        this.out.println(toPrint);
    }

    public String getInput() {
        return this.scanner.next();
    }
}
