package com.gradle.mental_math;

import java.util.Random;

public class MultiplicationTester {
    private int table;
    private Random rng;

    public MultiplicationTester(int table, Random rng) {
        this.table = table;
        this.rng = rng;
    }

    public Question generateQuestion() {
        return new Question(rng.nextInt(), table);
    }

    public boolean check(int answer, Question question) {
        return answer == question.getAnswer();
    }
}
