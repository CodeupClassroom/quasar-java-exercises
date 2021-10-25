import java.util.Scanner;

public class ConsoleExercises {
  public static void main(String[] args) {

    // ====
    //  Pi
    // ====
    double pi = 3.14159;
    // %.2f
    // ----
    // %  -> This is a format specifier
    // .2 -> Use two decimal places
    // f  -> Print this as a floating point value
    System.out.printf("The value of pi is approximately %.2f.", pi);

    // =========
    //  nextInt
    // =========
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int someInt = sc.nextInt(); // Not int? java.util.InputMismatchException
    System.out.println(someInt);

    // =======
    //  Words
    // =======
    System.out.print("Enter three words: ");
    String wordOne = sc.next();
    String wordTwo = sc.next();
    String wordThree = sc.next();
    // Less than 3? Waits for next word.
    // More than 3? Ignores last word.
    System.out.printf("1: %s\n2: %s\n3: %s", wordOne, wordTwo, wordThree);

    // ==========
    //  Sentence
    // ==========
    System.out.println("Enter a sentence:");
    // Only takes the first word, because the default delimiter is whitespace!
    // String sentence = sc.next();
    String sentence = sc.nextLine();
    System.out.println(sentence);

    // ==================
    //  Area / Perimeter
    // ==================
    System.out.print("Enter a length: ");
    String lString = sc.nextLine();
    int l = Integer.parseInt(lString);

    System.out.print("Enter a width: ");
    String wString = sc.nextLine();
    int w = Integer.parseInt(wString);

    int area = l * w;
    int perimeter = (2 * l) + (2 * w);

    // Note: Using %f here would throw a formatting exception
    // because area & perimeter are integers!
    System.out.printf("Area: %d\nPerimeter: %d\n", area, perimeter);

    // Always close your scanners, kids!
    sc.close();
  }
}
