public class HelloWorld {

    public static void main(String[] args) {

//        System.out.print("Hello,");
//        System.out.print(" World");

        // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 36;
        System.out.println(myFavoriteNumber);


        // 2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Quasar";
        System.out.println(myString);


        // 3. Change your code to assign a character value to myString. What do you notice?
        myString = "Q";
        // incompatible types: char cannot be converted to java.lang.String


        // 4. Change your code to assign the value 3.14159 to myString. What happens?
        myString = "3.14159";
        // incompatible types: double cannot be converted to java.lang.String


        // 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);
//        //  variable myNumber might not have been initialized


        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 3.14;
//        // incompatible types: possible lossy conversion from double to long


        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        long myNumber = 123L;
//        System.out.println(myNumber);


        // 8. Change your code to assign the value 123 to myNumber.
        // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?


        // 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        float myNumber = 3.14F;
//        double myNumber = 3.14;
        float myNumber = (float) 3.14;
        System.out.println(myNumber);
        // incompatible types: possible lossy conversion from double to float


        // 10. Copy and paste the following code blocks one at a time and execute them
        //int x = 5;
        //System.out.println(x++);
        //System.out.println(x);
        //
        //int x = 5;
        //System.out.println(++x);
        //System.out.println(x);
        //
        //What is the difference between the above code blocks? Explain why the code outputs what it does.
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);


        // 11. Try to create a variable named class. What happens?
//        String class;
//        // not a statement


        // 12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        //
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //
        //Copy and paste the code above and then run it. Does the result match with your expectation?
        //
        //How is the above example different from the code block below?
        //
//        int three = (int) "three";
        //  java.lang.String cannot be converted to int
        //What are the two different types of errors we are observing?


        // 13. Rewrite the following expressions using the relevant shorthand assignment operators:
        //
//        int x = 4;
////        x = x + 5;
//        x += 5;
//        System.out.println("x = " + x);

        //
//        int x = 3;
//        int y = 4;
//        y = y * x;
////        y *= x;
//        System.out.println("y = " + y);

        //
        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
        x /= y;
        y -= x;
        System.out.println("y = "  + y);


        // 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        //
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//        int number = 214748364700;
        // integer number too large
        int number = Integer.MAX_VALUE + 1;
        // -2147483648
        System.out.println(number);

    }

}
