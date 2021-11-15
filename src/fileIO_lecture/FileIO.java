package fileIO_lecture;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {

    public static void printPoem(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath); //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }




    public static void main(String[] args) throws IOException {
        Path filepath = Paths.get("./src/fileIO_lecture/wcw.txt"); //relative
//        Path filepath = Paths.get("/Users/kennethhowell/IdeaProjects/quasar-java-exercises/src/fileIO_lecture/wcw.txt"); //used intelliJ to grab the absolute

        //Absolute path would be good - if we were writing an application that would be working with a set system file [the map wouldn't be changing]
        //Relative path - preferred for many operations to move from the 'current working directory' and on out
//        printPoem(filepath);

      Path definitelyNotAPath =  Paths.get("/nota/actual/filepath.txt");



        System.out.println("Files.exists(definitelyNotAPath) = " + Files.exists(definitelyNotAPath));
        System.out.println("Files.exists(filepath) = " + Files.exists(filepath));
        System.out.println();
        System.out.println("filepath = " + filepath);

    //Let's make some new stuff - CREATING files and directories in JAVA
    String directory = "./src/data";
    String filename = "groceryList.txt";
    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);
    //building the whole shebang! A path combining: the directory's path + the desired filename at the end :D

    System.out.println(dataFile);

    if(Files.notExists(dataDirectory)){
//        Files.createDirectories(dataDirectory); //a plural method worked with one
        Files.createDirectory(dataDirectory);
    }

    if(Files.notExists(dataFile)){
        Files.createFile(dataFile);
    }

 //An example of how to write into a .txt file

        Path groceriesTxtPath = Paths.get(directory, filename); //we got the whole SHEBANG again - directory + file combined into one PATH

        System.out.println("groceriesTxtPath = " + groceriesTxtPath);
        System.out.println("Files.exists(groceriesTxtPath) = " + Files.exists(groceriesTxtPath));



//        List<String> groceryList = Arrays.asList("dog food", "coffee creamer", "artisanal bread", "cashew milk"); //Arrays helper class is called here - we use "ASLIST" to make a List datatype of what we passed into our arrays helper class
        List<String> groceryList = new ArrayList<>();
        String myVar = "dog food";
        groceryList.add(myVar);
        groceryList.add("bread");
        groceryList.add("cashew milk");
        groceryList.add("cat litter");
        System.out.println("groceryList = " + groceryList); //et voila - a grocery list! now we need to write

        Files.write(groceriesTxtPath, groceryList);
        System.out.println();
        //Reading from the file
        List<String> printList = Files.readAllLines(groceriesTxtPath);
        System.out.println("printList = " + printList);

        //We can write our own print method now :) - let's do it!

        for(int i = 0; i < printList.size(); i++){
            System.out.println((i + 1) + ": " + printList.get(i));
        }

        Files.write(groceriesTxtPath, Arrays.asList("eggs", "milkbones"), StandardOpenOption.APPEND);

        System.out.println();

        //Woops: We need to go check and get the UPDATED text file
        printList = Files.readAllLines(groceriesTxtPath);


        for(int i = 0; i < printList.size(); i++){
            System.out.println((i + 1) + ": " + printList.get(i));
        }

        //Last example: Dive into the .txt document, get the current number of items [the lines], and look for ONE to update

        //Let's get the current groceryList from our files

        groceryList = Files.readAllLines(groceriesTxtPath);
        List<String> newList = new ArrayList<>(); //IS THAT YOU POLYMORPHISM? BACK AGAIN?

        for (String line : groceryList){
            if(line.equalsIgnoreCase("artisanal bread")){
                newList.add("iron kid's bread");
                continue;
            }
            newList.add(line);


        }

        System.out.println(newList);

        Files.write(groceriesTxtPath, newList);


    }

}
