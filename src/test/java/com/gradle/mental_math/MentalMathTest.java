package com.gradle.mental_math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MentalMathTest {

    @Test
    public void generateQuestionReturnsQuestionWithChosenNumberAndAnswer() {
        MentalMath mentalMath = new MentalMath();
        int[] question = mentalMath.generateQuestion(7);
        assertEquals(3, question.length);
        assertEquals(7, question[0]);

        assertTrue(3 <= question[1] && question[1] <= 12);
        assertEquals(question[0] * question[1], question[2]);
    }

    @Test
    public void generateQuestionGeneratesRandomNumber() {
        MentalMath mentalMath = new MentalMath();

        for (int i = 1; i <= 20; i++) {
            int[] question = mentalMath.generateQuestion(7);
            assertTrue(3 <= question[1] && question[1] <= 12);
        }
    }

    @Test
    public void correctAnswerReturnsTrue() {
        MentalMath mentalMath = new MentalMath();

        int[] question = mentalMath.generateQuestion(7);
        assertTrue(mentalMath.isAnswerCorrect(question, 7 * question[1]));

    }

    @Test
    public void incorrectAnswerReturnsFalse() {
        MentalMath mentalMath = new MentalMath();

        int[] question = mentalMath.generateQuestion(7);
        assertFalse(mentalMath.isAnswerCorrect(question, 7 * question[1] + 1));

    }
}