public class ServerNameGenerator {
//    2
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

//    Create a method that will return a random element from an array of strings.

//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    public static String[] adjectives = {"Awful", "Blushing","Enthusiastic","Lazy","Talented","Strange","Jittery","Successful","Modern","Mysterious"};

    public static String[] nouns = {"dog","cat","bat","frog","human","cow","horse","goat","camel","llama"};

    public static String randomElem(String[] arg){
        return arg[(int)Math.floor((Math.random() * (arg.length - 1)))];

    }

    public static void main(String[] args) {
        System.out.println("Your server today is: ");
        System.out.println(randomElem(adjectives) + "-" + randomElem(nouns));
    }
}
