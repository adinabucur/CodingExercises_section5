package com.learnprogramming;

public class EvenDigitSum {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) { //check the condition for looping
            if (number % 2 == 0) { //check for even number
                sum = sum + (number % 10); //if even => sum the even found digit
            }
            number = number / 10;  // if is not even, extract the whole part of the number
        }
        return sum; //sum of all even numbers
    }
}
