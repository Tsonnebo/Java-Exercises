package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sumOdds = 0;
        for (int i = 0; i < 50; i++) {
            System.out.println(2 * i + 1);
            sumOdds += (2 * i + 1);
        }
        System.out.println (sumOdds);
    }
}
