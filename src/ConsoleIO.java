import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


//        String name = "Shanshan";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//
//        String greeting = "Howdy";
//        String cohortName = "Quasar";
//
//        System.out.printf(":) %s , %s!", cohortName, cohortName);

        System.out.print("Enter something: ");

        String userInput = scanner.nextLine();

        System.out.print("Enter something 2: ");

        String userInput2 = scanner.nextLine();

        System.out.printf("You entered %% %s and %s", userInput, userInput2);

    }


}
