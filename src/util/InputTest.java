package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        String myString = input.getString();
        System.out.println("myString = " + myString);

        System.out.println("Do you like pizza?");
        boolean likePizza = input.yesNo();
        System.out.println("likePizza = " + likePizza);

        System.out.println("Please enter a whole number.");
        int myInt = input.getInt();
        System.out.println("myInt = " + myInt);

        int myInt2 = input.getInt(1, 100);
        System.out.println("myInt2 = " + myInt2);

        System.out.println("Please enter a decimal number.");
        double myDouble = input.getDouble();
        System.out.println("myDouble = " + myDouble);

        double myDouble2 = input.getDouble(1, 100);
        System.out.println("myDouble2 = " + myDouble2);

        String myString2 = input.getString("Please enter a string:)");
        System.out.println("myString2 = " + myString2);

        boolean isContinue = input.yesNo("Would you like to continue?");
        System.out.println("isContinue = " + isContinue);

        int myInt3 = input.getInt(1, 10, "Please enter a whole number between 1 and 10");
        System.out.println("myInt3 = " + myInt3);

        int myInt4 = input.getInt("Please enter a whole number.");
        System.out.println("myInt4 = " + myInt4);

        double myDouble3  = input.getDouble("Give me a decimal number.");
        System.out.println("myDouble3 = " + myDouble3);

        double myDouble4 = input.getDouble(1, 10, "Please give me a decimal number between 1 and 10");
        System.out.println("myDouble4 = " + myDouble4);

    }
}
