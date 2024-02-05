package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int myInt = 5;
        // long variable to store a long value
        long myLong = 9223372036854775807L;
        // float variable to store a floating-point value
        float myFloat = 0.5f;
        // double variable to store a double value
        double myDouble = 0;
        // char variable to store a single character
        char myChar = 'e';
        // boolean variable to store a boolean value
        boolean myBoolean = false;
        // String variable to store a string of characters
        String myString = "Its my dummy string";
        // Step 2: Print the values of the variables to the console
        printVariables(myInt, myLong, myFloat, myDouble, myChar, myBoolean, myString);
        // Step 3: Modify the values of the variables and print the updated values
        myInt+=2;
        myLong++;
        myDouble*=2.2;
        myFloat/=2.2F;
        myChar = myString.charAt(0);
        myBoolean = !myBoolean;
        myString = "it's my modified dummy string";
        printVariables(myInt, myLong, myFloat, myDouble, myChar, myBoolean, myString);

    }

    private static void printVariables(int myInt, long myLong, float myFloat, double myDouble, char myChar, boolean myBoolean, String myString) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myString);
    }
}
