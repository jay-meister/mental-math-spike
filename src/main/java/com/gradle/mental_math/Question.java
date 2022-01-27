package com.gradle.mental_math;

public class Question {
    int value1;
    int value2;

    public Question(int value, int table) {
        value1 = value;
        value2 = table;
    }

    public String toString() {
        return this.value1 + " x " + this.value2;
    }

    public int getAnswer() {
        return this.value1 * this.value2;
    }
}
