package groceries;


import java.util.HashMap;
import java.util.Scanner;

public class GroceryApplication {

    public static void main(String[] args) {
        String groceryName = "";
        int groceryQuantity = 0;
        String correctItem = "";
        Scanner myScanner = new Scanner(System.in);

        HashMap<String, Integer> dairy = new HashMap<>();
        HashMap<String, Integer> meat = new HashMap<>();
        HashMap<String, Integer> frozen = new HashMap<>();
        HashMap<String, Integer> produce = new HashMap<>();

        System.out.println("Would you like to make a grocery list? [Yes/No]");

        String usrContinue = myScanner.nextLine();
        if(usrContinue.equalsIgnoreCase("no")){
            System.out.println("Thank you for using our grocery list application");
            System.exit(0);
        }
        boolean makeList = true;
        while(makeList){
        System.out.println("Excellent, let's add groceries.");
        System.out.println("Would you like to make an addition to 1. DAIRY, 2. MEAT, 3. FROZEN, or 4. PRODUCE, 5. EXIT");
        int usrResponse = myScanner.nextInt();
        switch(usrResponse){
            case 1:
                myScanner.nextLine();
                System.out.println("Please enter the name of your dairy product");
                 groceryName = myScanner.nextLine();
                System.out.println("Please enter the quantity of " + groceryName + " you would like.");
                 groceryQuantity = myScanner.nextInt();
                System.out.println("Is it correct you want to add " + groceryName + " in the amount of " + groceryQuantity + "? [YES/NO]");
                myScanner.nextLine();
                 correctItem = myScanner.nextLine();
                if(correctItem.equalsIgnoreCase("yes")){
                    dairy.put(groceryName, groceryQuantity);
                    System.out.println("dairy = " + dairy);
                    break;
                } else if (correctItem.equalsIgnoreCase("no")){
                    System.out.println("Our apologies. Returning to main menu");
                    break;
                }
            case 2:
                myScanner.nextLine();
                System.out.println("Please enter the name of your meat product");
                groceryName = myScanner.nextLine();
                System.out.println("Please enter the quantity of " + groceryName + " you would like.");
                groceryQuantity = myScanner.nextInt();
                System.out.println("Is it correct you want to add " + groceryName + " in the amount of " + groceryQuantity + "? [YES/NO]");
                myScanner.nextLine();
                correctItem = myScanner.nextLine();
                if(correctItem.equalsIgnoreCase("yes")){
                    meat.put(groceryName, groceryQuantity);
                    System.out.println("meat = " + meat);
                    break;
                } else if (correctItem.equalsIgnoreCase("no")){
                    System.out.println("Our apologies. Returning to main menu");
                    break;
                }
            case 3:
                myScanner.nextLine();
                System.out.println("Please enter the name of your frozen product");
                groceryName = myScanner.nextLine();
                System.out.println("Please enter the quantity of " + groceryName + " you would like.");
                groceryQuantity = myScanner.nextInt();
                System.out.println("Is it correct you want to add " + groceryName + " in the amount of " + groceryQuantity + "? [YES/NO]");
                myScanner.nextLine();
                correctItem = myScanner.nextLine();
                if(correctItem.equalsIgnoreCase("yes")){
                    frozen.put(groceryName, groceryQuantity);
                    System.out.println("frozen = " + frozen);
                    break;
                } else if (correctItem.equalsIgnoreCase("no")){
                    System.out.println("Our apologies. Returning to main menu");
                    break;
                }
            case 4:
                myScanner.nextLine();
                System.out.println("Please enter the name of your produce product");
                groceryName = myScanner.nextLine();
                System.out.println("Please enter the quantity of " + groceryName + " you would like.");
                groceryQuantity = myScanner.nextInt();
                System.out.println("Is it correct you want to add " + groceryName + " in the amount of " + groceryQuantity + "? [YES/NO]");
                myScanner.nextLine();
                correctItem = myScanner.nextLine();
                if(correctItem.equalsIgnoreCase("yes")){
                    produce.put(groceryName, groceryQuantity);
                    System.out.println("produce = " + produce);
                    break;
                } else if (correctItem.equalsIgnoreCase("no")){
                    System.out.println("Our apologies. Returning to main menu");
                    break;
                }

        }
            System.out.println("done with groceries?");
            String userComplete = myScanner.nextLine();
            if(userComplete.equalsIgnoreCase("yes")){
                makeList = false;
            }

        }
        System.out.println("Wrapped up with ordering groceries! Here's what you have ordered:");
        System.out.println("Dairy:");
        System.out.println(dairy);
        System.out.println("Meat:");
        System.out.println(meat);
        System.out.println("Frozen:");
        System.out.println(frozen);
        System.out.println("Produce:");
        System.out.println(produce);



    }

}
