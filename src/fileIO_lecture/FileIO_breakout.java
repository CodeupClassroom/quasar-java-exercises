package fileIO_lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIO_breakout {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>(); //Files.readAllLines(groceryListPath);

        boolean buildingGroceryList = true;

        while(buildingGroceryList){
        System.out.println("Give me something you need from the store");
        Scanner myScanner = new Scanner(System.in);

        String myVar = myScanner.nextLine();
        groceryList.add(myVar);
            System.out.println("Are you still adding groceries? yes or no");
            String userContinue = myScanner.nextLine();
            if (userContinue.equalsIgnoreCase("yes")){
                buildingGroceryList = true;
            } else {
                buildingGroceryList = false;
            }

        }

        System.out.println("Here's your list " + groceryList);

        //Okay cool - now let's SAVE it [files.write(pathObj, listVar); <<<<<

        //Start application - List<String> currentList = Files.readAllLines(path) << let's go see what was saved and bring it into the application
        //Menu options
        //Searching - show all from the list that you got on application start up
        //Adding one - take the list we got from the start < copy it and add a new line < save at the end of the interaction
        //Delete path = compare my currentList with a copy, and whatever they wanted to delete skip adding to the new list - SKIP === 'continue'
        // . . . Exit, files.write and save one more time as the user leaves


    }
}
