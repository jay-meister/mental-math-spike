package com.gradle.mental_math;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationGameTest {
    @Test
    void newGameAsksUserAsksUserForTable() {
        // initialise console writer
        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
        ConsoleWriter writer = new ConsoleWriter(new PrintStream(outSpy));

        MultiplicationGame game = new MultiplicationGame(writer);
        game.start();

        assertEquals("""
                New game!
                Pick a number you want to practice your multiplication skills for...
                """, outSpy.toString());

    }
}

