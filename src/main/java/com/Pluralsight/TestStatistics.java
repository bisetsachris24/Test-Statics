package com.Pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {
        int[] testScores = {30, 50, 40, 65, 76, 87, 38, 32, 80, 99};

        int sum = 0;
        int high = testScores[0];


        for (int testScore : testScores) {
            sum += testScore;

        }
        for (int i = 0; i < testScores.length; i++) {
            if (testScores[i] > high) {
                high = testScores[i];
            }


            System.out.println(" The sum is " + sum);

            System.out.println("Average is " + sum / testScores.length);

            System.out.println("HighScore is " + Arrays.stream(testScores).max());

            System.out.println(" Low score is " + Arrays.stream(testScores).min());
        }
        System.out.println(" High is  "+ high);

    }
}
