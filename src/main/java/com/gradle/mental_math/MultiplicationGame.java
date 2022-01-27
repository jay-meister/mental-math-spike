package com.gradle.mental_math;

import java.util.Scanner;

public class MultiplicationGame {
    private Scanner scanner;
    private ConsoleWrapper wrapper;

    public MultiplicationGame(ConsoleWrapper wrapper) {
        this.wrapper = wrapper;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        this.wrapper.print("New game!");
        this.wrapper.print("Pick a number you want to practice your multiplication skills for...");

        String times = this.scanner.next();
    }
}
