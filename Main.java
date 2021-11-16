package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Random lotoNumbers = new Random();
        int tryTimes = 0;
        int loto[] = new int[6];
        int extraNumber = lotoNumbers.nextInt(1, 7);
        while (tryTimes < 6) {
            loto[tryTimes] = lotoNumbers.nextInt(1, 50);
            tryTimes = tryTimes + 1;
        }

        for (int check1 = 5; check1 > 1; check1--) {
            for (int check = check1 - 1; check > 0; check--) {
                if (loto[check1] == loto[check]) {
                    loto[check] = lotoNumbers.nextInt(1, 50);
                }
            }


        }
        for (int q = 0; q < 6; q++) {
            System.out.println(loto[q]);
        }

            System.out.print("  extra number is: " + extraNumber);

    }

}