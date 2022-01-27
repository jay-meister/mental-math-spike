package com.gradle.mental_math;

public class MultiplicationGame {
    private ConsoleWriter writer;

    public MultiplicationGame(ConsoleWriter writer) {
        this.writer = writer;
    }

    public void start() {
        this.writer.print("New game!");
        this.writer.print("Pick a number you want to practice your multiplication skills for...");
    }
}
