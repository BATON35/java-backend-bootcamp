package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int myInt = 4;
        Integer myWrapperInteger = myInt;
        double myDouble = 44;

        String myString = "My string";
        ArrayList<Integer> myArrayList = new ArrayList<>(List.of(myInt));
        int[] myArrayOfPrimitivesInts = new int[]{1, 2, 3, 4, 5, 6, 7};

        // Step 2: Perform arithmetic operations
        myString = myString + " string to concatenation";

        myArrayList.add(myArrayList.get(0) + 1);

        myArrayOfPrimitivesInts[0] = myArrayOfPrimitivesInts[0] + 2;
        myArrayOfPrimitivesInts[1] = myArrayOfPrimitivesInts[1] - 3;
        myArrayOfPrimitivesInts[2] = myArrayOfPrimitivesInts[2] / 2;
        myArrayOfPrimitivesInts[3] = myArrayOfPrimitivesInts[3] * 2;
        myArrayOfPrimitivesInts[4] = myArrayOfPrimitivesInts[4] % 3;
        myArrayOfPrimitivesInts[5] = myArrayOfPrimitivesInts[5] << 1;
        myArrayOfPrimitivesInts[6] = myArrayOfPrimitivesInts[6] >> 1;

        // Step 3: Print the results of the arithmetic operations
        for (int myArrayOfPrimitivesInt : myArrayOfPrimitivesInts) {
            System.out.println(myArrayOfPrimitivesInt);
        }
        System.out.println("_____________________________");
        // Step 4: Perform increment and decrement operations
        myArrayList.set(0, --myInt);
        myArrayList.set(1, ++myInt);

        // Step 5: Print the results of the increment and decrement operations
        for (Integer integer : myArrayList) {
            System.out.println(integer);
        }
        System.out.println("my int after increamentation and decrementation = " + myInt);

        // Step 6: Perform comparison operations
        System.out.println("is 3 > 5 = " + (3 > 5));
        System.out.println("is 3 < 5 = " + (3 < 5));

        // Step 7: Print the results of the comparison operations


        // Step 8: Perform logical operations
        System.out.println("And for true and false = " + (true && false));
        System.out.println("Or for true and false = " + (true || false));
        System.out.println("Negation of ture = " + !true);
        // Step 9: Print the results of the logical operations


    }
}
