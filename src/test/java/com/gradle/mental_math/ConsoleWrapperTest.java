// attempting to create ConsoleWriter class
// https://stackoverflow.com/a/21216342

package com.gradle.mental_math;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleWrapperTest {
    @Test
    void ConsoleWrapperWrites() {
        ByteArrayInputStream in = new ByteArrayInputStream("".getBytes());

        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outSpy);

        ConsoleWrapper wrapper = new ConsoleWrapper(in, out);
        wrapper.print("hi world");
        assertEquals("hi world\n", outSpy.toString());
    }

    @Test
    void ConsoleWrapperReads() {
        ByteArrayInputStream in = new ByteArrayInputStream("10".getBytes());

        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(outSpy);

        ConsoleWrapper wrapper = new ConsoleWrapper(in, out);

        String userInput = wrapper.getInput();
        // pass in "10"
        assertEquals("10", userInput);
    }
}
