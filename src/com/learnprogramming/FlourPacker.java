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
        int difference = goal - bigCount * 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0 ||
                bigCount * 5 + smallCount < goal) {
            return false;
        } else if (goal == 5 && bigCount > 1) {
            return true;
        } else return smallCount >= difference;
    }
}


