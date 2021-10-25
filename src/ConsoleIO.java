import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("\n");

//        String name = "Shanshan";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//
//        String greeting = "Howdy";
//        String cohortName = "Quasar";
//
//        System.out.printf(":) %s , %s!", cohortName, cohortName);

        System.out.print("Enter something thrice: ");

        String userInput = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

//        String userInput2 = scanner.nextLine();

        System.out.printf("We've gotten %s, %s, %s", userInput, userInput2, userInput3);
    }
}
