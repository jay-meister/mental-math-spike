package com.gradle.mental_math;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplicationTesterTest {
    @Test
    void multiplyZeroByZeroIsZero() {
        Random rng = new RandomStub(0);
        MultiplicationTester tester = new MultiplicationTester(0, rng);
        Question question = tester.generateQuestion();

        boolean correct = tester.check(0, question);
        assertTrue(correct);

        assertEquals("0 x 0", question.toString());
        assertEquals(0, question.getAnswer());
    }

    @Test
    void multiplyOneByOne() {
        Random rng = new RandomStub(1);
        MultiplicationTester tester = new MultiplicationTester(1, rng);
        Question question = tester.generateQuestion();

        boolean correct = tester.check(1, question);
        assertTrue(correct);

        assertEquals("1 x 1", question.toString());
        assertEquals(1, question.getAnswer());
    }

    @Test
    void multiplyByRandomNumber() {
        Random rng = new RandomStub(3);
        MultiplicationTester tester = new MultiplicationTester(2, rng);
        Question question = tester.generateQuestion();

        boolean correct = tester.check(6, question);
        assertTrue(correct);

        assertEquals("3 x 2", question.toString());
        assertEquals(6, question.getAnswer());
    }

    static class RandomStub extends Random {
        private int value;

        public RandomStub(int value) {
            this.value = value;
        }

        @Override
        public int nextInt() {
            return value;
        }
    }
}
