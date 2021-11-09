package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();//String = GH username, and it is attached to 1 student object :D

        Student mcKenneth = new Student("mcKenneth");
        Student mcJackie = new Student("mcJackie");
        Student mcPatric = new Student("mcPatric");
        Student mcCody = new Student("mcCody");

        mcKenneth.addGrade(88);
        mcKenneth.addGrade(75);
        mcKenneth.addGrade(90);

        mcJackie.addGrade(92);
        mcJackie.addGrade(100);
        mcJackie.addGrade(80);

        mcPatric.addGrade(78);
        mcPatric.addGrade(83);
        mcPatric.addGrade(95);

        mcCody.addGrade(99);
        mcCody.addGrade(96);
        mcCody.addGrade(98);

        students.put("ken2cool", mcKenneth);
        students.put("quasarMan", mcJackie);
        students.put("chillindude210", mcPatric);
        students.put("dontGiveADuck", mcCody);

//        System.out.println(mcKenneth);
//        System.out.println(students);

        //We need a command line application - search inside of HashMap, if they want to search again, we need a looping structure - I'm thinking let's use a bool flag

        boolean continueFlag = true;

        System.out.println("Welcome to the grade application . . . now loading");
        System.out.println(" - - - - - - - - - - -");

        while(continueFlag){
            System.out.println("Hello user! Here are the GitHub usernames of our students:");
            String message = "| ";
            for(String ghName : students.keySet()){
              message += ghName + " | ";
            }
            System.out.println(message);
            System.out.println("Which student did you want to get more information on?");

           String userSearch = myScanner.nextLine();

           Student result = students.get(userSearch);//Either A.) No results found == we get NULL; or B.) result found! the proper student is stored in the 'result' variable

            if(result == null){
                System.out.printf("No result found for %s%n",userSearch);
            } else {
                System.out.printf("Match found for GitHub username %s. %s is the name of the student. Here is their current grade average : %.2s%n", userSearch, result.getName(), result.getGradeAverage());
            }

            System.out.println("Would you like to search again? [Yes/No]");
            String userResponse = myScanner.nextLine();
            if(userResponse.equalsIgnoreCase("yes")){
                continueFlag = true;
            } else {
                System.out.println("Thank you for using our grading application - code well!");
                continueFlag = false;
            }
        }
    }

}
