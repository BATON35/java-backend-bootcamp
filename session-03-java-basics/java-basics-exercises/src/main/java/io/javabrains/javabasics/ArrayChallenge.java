package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] digits = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] digitsVer1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sumOfDigits = 0;
        int largestDigit = digits[0];
        for (int digit : digits) {
            sumOfDigits += digit;
        }
        for (int digit : digits) {
            if (largestDigit < digit)
                largestDigit = digit;
        }

        System.out.println(sumOfDigits);
        System.out.println((double) sumOfDigits / digits.length);
        System.out.println(largestDigit);

    }
}
