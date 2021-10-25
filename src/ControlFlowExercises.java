import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // While

        int i = 5;
        while(i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        // Do While

        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int i = 0;
        do {
            System.out.println(i);
            i += 2;
        } while(i <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.
        int i = 100;
        do {
            System.out.println(i);
            i -= 5;
        } while(i >= -10);

        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000
        long i = 2;
        do {
            System.out.println(i);
            i *= i;
        } while(i <= 1_000_000);

        // Refactor the previous two exercises to use a for loop instead.
        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

        for (long i = 2; i <= 1_000_000; i *= i) {
            System.out.println(i);
        }

        // FizzBuzz

        for (int i = 1; i < 100; i++) {
            boolean divBy3 = (i % 3) == 0;
            boolean divBy5 = (i % 5) == 0;

            if (divBy3 && divBy5) {
                System.out.println("FizzBuzz");
            } else if(divBy5) {
                System.out.println("Buzz");
            } else if (divBy3) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        // Table of Powers

        Scanner sc = new Scanner(System.in);

        boolean confirm;
        do {
            System.out.print("Enter a number: ");
            int userNum = sc.nextInt();

            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= userNum; i++) {
                System.out.printf("%-6d | %-7d | %-5d\n", i, i * i, i * i * i);
            }

            System.out.println("Do you want to continue? (Y/N)");
            confirm = sc.next().equalsIgnoreCase("y");
        } while(confirm);

        // Grade Conversion

        boolean confirm;
        do {

            System.out.print("Enter a numerical grade: ");
            int grade = sc.nextInt();

            if (grade < 60) {
                System.out.println("F");
            } else if(grade < 67) {
                System.out.println("D");
            } else if(grade < 80) {
                System.out.println("C");
            } else if(grade < 88) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }

            System.out.println("Do you want to continue? (Y/N)");
            confirm = sc.next().equalsIgnoreCase("y");

        } while(confirm);

        sc.close();
    }
}
