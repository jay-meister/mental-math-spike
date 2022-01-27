// attempting to create ConsoleWriter class
// https://stackoverflow.com/a/21216342

package com.gradle.mental_math;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConsoleWriterTest {
    @Test
    void ConsoleWriterWrites(){
        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
        ConsoleWriter writer = new ConsoleWriter(new PrintStream(outSpy));
        writer.print("hi world");
        assertEquals("hi world\n", outSpy.toString());
    }
}
