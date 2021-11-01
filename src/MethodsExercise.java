import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MethodsExercise {

//    1.Basic Arithmetic
//
//    a. Create four separate methods. Each will perform an arithmetic operation:
//    -Addition
//    -Subtraction
//    -Multiplication
//    -Division
//    b. Each function needs to take two parameters/arguments so that the operation can be performed.
//    c. Test your methods and verify the output.
//    d. Add a modulus method that finds the modulus of two numbers.
//
//    Food for thought: What happens if we try to divide by zero? What should happen?

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int num1, int num2){
        return num1 / num2;
    }

    public static int modulus(int num1, int num2){
        return num1 % num2;
    }



//    2. Create a method that validates that user input is in a certain range
//
//    The method signature should look like this:
//
//      public static int getInteger(int min, int max);
//
//    and is used like this:
//
//      System.out.print("Enter a number between 1 and 10: ");
//      int userInput = getInteger(1, 10);

//    If the input is invalid, prompt the user again.

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userNum = sc.nextInt();
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Number not between 1-10. Enter another number:");
        return getInteger(min, max);
    }




//    3. Calculate the factorial of a number.
//
//    - Prompt the user to enter an integer from 1 to 10.
//    - Display the factorial of the number entered by the user.
//    - Ask if the user wants to continue.
//    - Use a for loop to calculate the factorial.
//    - Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    - Use the long type to store the factorial.
//    - Continue only if the user agrees to.
//    - A factorial is a number multiplied by each of the numbers before it.
//    - Factorials are denoted by the exclamation point (n!). Ex:

//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24

    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        int userInput;
        String isContinue;
        long factorial = 1;
        String middle = "1";

        do{
            userInput = getInteger(1,10);
            for(int i = 1; i<= userInput; i++){
                if(i>1){
                    middle += "x" + i;
                }
                factorial *= i;
                System.out.printf("%2d! = %-45s = %d%n", i,middle,factorial);
            }
            System.out.println("Would you like continue? (y/n)");
             isContinue = scanner.nextLine();

        }while (isContinue.equalsIgnoreCase("y"));

    }


//    4. Create an application that simulates dice rolling.
//
//    - Ask the user to enter the number of sides for a pair of dice.
//    - Prompt the user to roll the dice.
//    - "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//    - Use static methods to implement the method(s) that generate the random numbers.
//    - Use the .random method of the java.lang.Math class to generate random numbers.

    public static void dice(){
        Scanner sc = new Scanner(System.in);
        String answer;
        System.out.println("How many sides would you like this dice to have:");
        int sides = sc.nextInt();
        System.out.println("Would you like to roll the dice?(y/n)");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("y")){
            do{


            int dice1 = (int) Math.floor(Math.random() * sides);
            int dice2 = (int) Math.floor(Math.random() * sides);
            System.out.println(dice1);
            System.out.println(dice2);

                System.out.println("would to play again?(y/n)");
                answer = sc.next();
            }while (answer.equalsIgnoreCase("y"));

        }
    }



    public static void main(String[] args) {
//        1
//        System.out.println("Add: " + add(1, 1));
//        System.out.println("Subtract: " + subtract(5, 4));
//        System.out.println("Multiply: " + multiply(6, 4));
//        System.out.println("Divide: " + divide(8, 2));
//        System.out.println("Modulus:" + modulus(8, 5));
//        2
//        System.out.println(getInteger(1,10));
//        3
//        factorial();
//        4
        dice();
    }


}
