package com.learnprogramming;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(5));
    }

    public static boolean isPerfect(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            int factor = number % i;
            if (factor == 0) {
                sum = sum + i;
            }
        }

        return sum == number;

    }
}
