package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        boolean myBoolean = true;
        double myDouble = Double.MAX_VALUE - 1;
        // Step 2: Convert primitive variables to wrapper objects
        Boolean myBooleanWrapper = myBoolean;
        Double myDoubleWrapper = myDouble;
        // Step 2a: Update primitive variables to their default values
        myBoolean = false;
        myDouble = 0;
        // Step 3: Print the values of the wrapper objects
        printVariables(myBooleanWrapper, myDoubleWrapper);
        // Step 4: Convert wrapper objects back to primitive variables
        myBoolean = myBooleanWrapper;
        myDouble = myDoubleWrapper;
        // Step 5: Print the values of the primitive variables
        printVariables(myBoolean, myDouble);

    }

    private static void printVariables(boolean myBoolean, double myLong) {
        System.out.println("________________");
        System.out.println(myBoolean);
        System.out.println(myLong);
    }
}
