// First iteration: MentalMath
// 1. Ask which number to practice with
// 2. Ask 1 question to practice
// 3. Display answer to user

package com.gradle.mental_math;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MentalMath {
    public static void main(String[] args) {
        // start game and get initial number to practice with
        System.out.println("New Game!");
        System.out.println("Pick the number you want to practice...");
        Scanner scan = new Scanner(System.in);
        int chosenNumber = scan.nextInt();

        int[] question = generateQuestion(chosenNumber);

        System.out.println(question[0] + " x " + question[1] + " = ...");
        int userAnswer = scan.nextInt();

        if (isAnswerCorrect(question, userAnswer)) {
            System.out.println("Correct, well done!");
        } else {
            System.out.println("Wrong!");
            System.out.println(question[0] + " x " + question[1] + " = " + question[2]);
        }
    }

    // seemingly has to be static
    public static int[] generateQuestion(int chosenNumber) {
        int min = 3;
        int max = 12;
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
        int[] question = {chosenNumber, randomNumber, chosenNumber * randomNumber};
        return question;
    }

    public static boolean isAnswerCorrect(int[] question, int userAnswer) {
        return question[2] == userAnswer;
    }
}
