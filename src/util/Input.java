package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
//        System.out.println("Enter a string.");
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    // The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
    public boolean yesNo() {
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt() {
        try{
        String s = getString();
        return Integer.valueOf(s);
        } catch (NumberFormatException nfe){
            System.out.println("Please enter an integer:");
            return getInt();
        }
    }

    public int getInt(String prompt) {
        int number;
        try{
            number = Integer.valueOf(getString(prompt));
            return number;
        }catch (NumberFormatException nfe){
            System.out.println("Wrong Input, try again: ");
            return getInt(prompt);
        }
    }

    // getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
    public int getInt(int min, int max) {
        int userInt;
            System.out.printf("Please enter a whole number between %d and %d: %n", min, max);
            userInt = this.scanner.nextInt();
            if(userInt > max || userInt < min){
                return getInt(min,max);
            }else{
                return userInt;
            }

    }

    public int getInt(int min, int max, String prompt) {
        int userInt;
        do {
            System.out.println(prompt);
            userInt = this.scanner.nextInt();
        } while(userInt > max || userInt < min);
        return userInt;
    }

    public double getDouble() {
        try{
        String s = getString();
        return Double.valueOf(s);
        }catch (NumberFormatException nfe){
            System.out.println("Please enter a double:");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        double number;
                try{
                    number = Double.valueOf(getString(prompt));
                    return number;
                } catch (NumberFormatException nfe){
                    System.out.println("Wrong type please enter a double:");
                    return getDouble(prompt);
                }

    }

    public double getDouble(double min, double max) {
        double userDouble;
            System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
            userDouble = this.scanner.nextDouble();
            if(userDouble > max || userDouble < min){
                return getDouble(min,max);
            } else {
                return userDouble;
            }

    }

    public double getDouble(double min, double max, String prompt) {
        double userDouble;
        do {
            System.out.println(prompt);
            userDouble = this.scanner.nextDouble();
        } while (userDouble > max || userDouble < min);

        return userDouble;
    }

}
