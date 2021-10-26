import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        // Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.
        //Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        Scanner scanner = new Scanner(System.in);
        String sentence;
        boolean keepTalking;

        System.out.println("Bob is a lackadaisical teenager.\nHe doesn't really have a lot friends. Let's talk to him to make friends.");
        System.out.println("Let's start the conversation:)");

        do {
            System.out.println("What would you like to talk to Bob?");
            sentence = scanner.nextLine();

            if (sentence.endsWith("?")) {
                System.out.println("Bob keeps his head down looking at his shoes and says: \"Sure.\"");
            } else if (sentence.endsWith("!")) {
                System.out.println("Bob looks at you in shock and yells: \"Whoa, chill out!\"");
            } else if (sentence.equals("")) {
                System.out.println("Bob turns around and says: \"Fine. Be that way!\"");
            } else {
                System.out.println("Bob whispered: \"Whatever.\"");
            }

            System.out.println("Would you like to keep talking with Bob? (y/n)");
            keepTalking = scanner.nextLine().equalsIgnoreCase("y");
        } while (keepTalking);
    }
}
