package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Scanner myScanner = new Scanner(System.in);

        Student mcKenneth = new Student("mcKenneth");
        Student mcCody = new Student("mcCody");
        Student mcShanshan = new Student("mcShanshan");
        Student mcDouglas = new Student("mcDouglas");

        mcKenneth.addGrade(44);
        mcKenneth.addGrade(84);
        mcKenneth.addGrade(34);
        mcCody.addGrade(42);
        mcCody.addGrade(62);
        mcCody.addGrade(82);
        mcShanshan.addGrade(95);
        mcShanshan.addGrade(96);
        mcShanshan.addGrade(98);
        mcDouglas.addGrade(90);
        mcDouglas.addGrade(90);
        mcDouglas.addGrade(90);

        students.put("theDarkKnight", mcDouglas);
        students.put("dontGiveADuck", mcCody);
        students.put("ken2cool", mcKenneth);
        students.put("shanshan^_^", mcShanshan);

        boolean continueFlag = true;
        System.out.println("Welcome to the grade application . . loading . .");
        System.out.println("- - - - - - - - - - - - - - - - ");

        while(continueFlag) {

            System.out.println("Hello! Here are the GitHub usernames of our STUDENTS:");
            String message = " | ";
            for (String ghName : students.keySet()) {
                message += ghName + " | ";
            }
            System.out.println(message);
            System.out.println("Which student did you want to get more information on?");
            String userSearch = myScanner.nextLine();

            Student result = students.get(userSearch);

            if (result == null) {
                System.out.println("No student found.");
            } else {
                System.out.printf("Match found for GitHub username %s. %s is the name of the student. Here is their current grade average: %s%n", userSearch, result.getName(), result.getGradeAverage());
            }

            System.out.println("Would you like to search again? [Yes/No]");
            String userResponse = myScanner.nextLine();
            if(userResponse.equalsIgnoreCase("yes")){
               continueFlag = true;
            } else {
                System.out.println("Thank you for using our application");
                continueFlag = false;
            }
        }


    }
}

