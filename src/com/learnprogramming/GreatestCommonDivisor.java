package com.learnprogramming;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int first = 12;
        int second = 30;
        int min = Math.min(first, second);

        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0) {
                System.out.println(i);
            }

        }
   /* public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int min = Math.min(first, second);

        for (int i = 1; i <= min; i++) {
            if (first % i == 0 && second % i == 0){
                return i;
            }

        }

        return -2;
    }*/
    }
}
