package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for (Object element : objects) {
            if (element instanceof Integer)
                System.out.println(element + " is type of Integer ");
            else if (element instanceof Double)
                System.out.println(element + " is type of Double ");
        }
    }
}
