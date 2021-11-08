import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {
        //Old way: Array initializer .. not as easy to work with :/
//        String[] nameOfVar = {"thing1", "thing2", "thing3"};
//
//        System.out.println(nameOfVar[3]);

        ArrayList<String> students = new ArrayList<>();

        students.add("mcKenneth");
        students.add("mcCody");

        System.out.println("students.size() = " + students.size());
        System.out.println(students);

        ArrayList<Integer> myFavoriteNums = new ArrayList<>();

        myFavoriteNums.add(13);
        myFavoriteNums.add(222);
        myFavoriteNums.add(0, 7);
        myFavoriteNums.add(myFavoriteNums.size(), 42);
        myFavoriteNums.add(myFavoriteNums.size(), 24);
        myFavoriteNums.add(myFavoriteNums.size(), 21);
        myFavoriteNums.add(2, 21);

        System.out.println(myFavoriteNums);
        System.out.println("myFavoriteNums " + myFavoriteNums.size());

        System.out.println("myFavoriteNums.indexOf(222) = " + myFavoriteNums.indexOf(222));
        System.out.println("myFavoriteNums.get(2) = " + myFavoriteNums.get(2));

        System.out.println("myFavoriteNums.contains(42) = " + myFavoriteNums.contains(42));

        System.out.println(myFavoriteNums);

        //7, 13, 21, 222, 42, 24, 21
        System.out.println("myFavoriteNums.lastIndexOf(21) = " + myFavoriteNums.lastIndexOf(21));
        System.out.println("myFavoriteNums.indexOf(21) = " + myFavoriteNums.indexOf(21));



//        System.out.println("myFavoriteNums.isEmpty() = " + myFavoriteNums.isEmpty());
        System.out.println();
        //Test:
        ArrayList<Integer> removalList = new ArrayList<>();
        removalList.add(21);
        removalList.add(42);
        removalList.add(24);

//        myFavoriteNums.remove( (Integer) 21); //passed object version of int to remove '21'
//        myFavoriteNums.remove( myFavoriteNums.indexOf(21)); //target whatever is at this index

        myFavoriteNums.removeAll(removalList);

        System.out.println(myFavoriteNums);

        System.out.println("-~-~-~-~ Hash Maps ~-~-~-~- \n");

        //HashMap<keyDatatype, valueDatatype> nameVar = new HashMap<>();

        HashMap<String, String> usernames = new HashMap<>();

        //Inserting k : v pairs into HashMap
        usernames.put("Kenneth", "ken2cool");
        usernames.put("Shanshan", "theGOAT");
        usernames.put("Cody", "codynotTheDuck");

        System.out.println("usernames.get(\"Shanshan\") = " + usernames.get("Shanshan"));

        //Oops: We looked for "Alex" as a key . . no results found :( we end up with a return of NULL
        System.out.println("usernames.get(\"Alex\") = " + usernames.get("Alex"));

        //Providing a default might be better:

        System.out.println("usernames.getOrDefault(\"Alex\", \"noUserFound\") = " + usernames.getOrDefault("Alex", "noUserFound"));

        //.contains with our above experimentation:

        System.out.println("usernames.containsKey(\"Alex\") = " + usernames.containsKey("Alex"));
        System.out.println("usernames.containsKey(\"Shanshan\") = " + usernames.containsKey("Shanshan"));
        System.out.println("usernames.containsValue(\"theGOAT\") = " + usernames.containsValue("theGOAT"));
        System.out.println("usernames.containsValue(\"aGoat\") = " + usernames.containsValue("aGoat"));
        System.out.println();

        System.out.println(usernames);

        usernames.putIfAbsent("Shanshan", "shanshan210");
        usernames.putIfAbsent("Alex", "majinAlex");

        System.out.println(usernames);

        System.out.println("usernames.getOrDefault(\"Alex\", \"noUserFound\") = " + usernames.getOrDefault("Alex", "noUserFound")); //expecting: I do have an "Alex" now, so I'm expecting majinAlex
        System.out.println("usernames.get(\"James\") = " + usernames.get("James"));
        System.out.println("usernames.getOrDefault(\"Fenix\", \"he's a dog\") = " + usernames.getOrDefault("html.input", "User not found")); //no key of "Fenix" - expecting: "he's a dog"

        System.out.println();
        System.out.println(usernames);
        usernames.remove("Alex");
        System.out.println(usernames);
        usernames.replace("Shanshan", "shanshan210");
        System.out.println(usernames);
        usernames.clear();
        System.out.println("usernames = " + usernames);
        System.out.println("usernames.getOrDefault(\"Shanshan\", \"are you there?\") = " + usernames.getOrDefault("Shanshan", "are you there?"));
        System.out.println("usernames.containsKey(\"Cody\") = " + usernames.containsKey("Cody"));
        System.out.println("usernames.isEmpty() = " + usernames.isEmpty());

    }

}
