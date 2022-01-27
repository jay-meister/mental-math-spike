package com.gradle.mental_math;

import java.io.PrintStream;

public class ConsoleWriter {
    private PrintStream printStream;

    public ConsoleWriter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void print(String toPrint) {
        this.printStream.println(toPrint);
    }
}
