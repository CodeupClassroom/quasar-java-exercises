import java.util.Scanner;

public class Highlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my number guessing game!");
        int myNumber = (int)Math.floor(Math.random() * 100);
        int userInput;

        System.out.println("Guess my number!");

        do{
            System.out.println("Choose a number between 1-100:");
            userInput = scanner.nextInt();

            if(userInput > myNumber){
                System.out.println("LOWER");
            }else if(userInput < myNumber){
                System.out.println("HIGHER");
            }else{
                System.out.println("GOOD GUESS");
            }
        }while(userInput != myNumber);
    }

    //    5. Game Development 101

//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    - Game picks a random number between 1 and 100.
//    - Prompts user to guess the number.
//    - All user inputs are validated.
//    - If user's guess is less than the number, it outputs "HIGHER".
//    - If user's guess is more than the number, it outputs "LOWER".
//    - If a user guesses the number, the game should declare "GOOD GUESS!"



}
