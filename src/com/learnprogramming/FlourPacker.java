package com.learnprogramming;

public class FlourPacker {
    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(2, 1, 5));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0 ||
                bigCount * 5 + smallCount < goal) {
            return false;
        }
        int neededBigCount = goal / 5;
        int remaining = 0;

        if (bigCount < neededBigCount) {
            remaining = ((neededBigCount - bigCount) * 5);
        }
        remaining = remaining + (goal % 5);

        if (remaining <= smallCount) {
            return true;
        } else {
            return false;
        }
    }
}


