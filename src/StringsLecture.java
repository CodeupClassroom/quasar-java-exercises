public class StringsLecture {

    public static void main(String[] args) {

        // ' ~ " * "strings" * " ~ '
        //Strings can be given a more formal definition - some letters, numbers, and special characters combined (STRUNG together) in some fashion
        //In Java . . they are not primitives! They are objects - your variables are a reference type instead. That means == asks if both sides have the same reference vs value
        //This leads us to use object comparison methods (.equals and family) to reliably check the VALUES of the objects vs. the REFERENCES of the objects

        //Don't do this! ! ! This is behavior from a woods-y topic related to how the Java Virtual Machine works

        String thisIsAString = "This is a String";
        String thisIsAString2 = "This is a String";

//        if(thisIsAString2 == thisIsAString){
//            System.out.println("Performing some kind of super important operation with the above!! (Skynet launched!)");
//        }


        //Utilize the methods introduced here instead for consistency and reliability:

//        if(thisIsAString.equals("This is a String")){
//            System.out.println("Everything is a-okay over here! We used .equals, so we're feeling confident in what's going on with our code.");
//        }

        // ' ~ " * "string comparison methods" * " ~ '
        //Expanding on the thought above: we have a range of string comparison methods! These include a couple we've seen (.equals and its sibling .equalsIgnoreCase), but there are also a couple prefix/suffix focused methods (.startsWith  vs .endsWith)

        //.equals + .equalsIgnoreCase (casematch the total string or ignore the casing of the total string?)
        String txCapitalCity = "Austin";
        String lowercaseTxCapitalCity = "austin";
        System.out.println("txCapitalCity = " + txCapitalCity);
        System.out.println("lowercaseTxCapitalCity = " + lowercaseTxCapitalCity);
        System.out.println("lowercaseTxCapitalCity.equals(lowercaseTxCapitalCity) = " + lowercaseTxCapitalCity.equals(lowercaseTxCapitalCity));
        System.out.println("txCapitalCity.equals(txCapitalCity) = " + txCapitalCity.equals(txCapitalCity));
        System.out.println("txCapitalCity.equals(lowercaseTxCapitalCity) = " + txCapitalCity.equals(lowercaseTxCapitalCity));
        System.out.println("txCapitalCity.equalsIgnoreCase(lowercaseTxCapitalCity) = " + txCapitalCity.equalsIgnoreCase(lowercaseTxCapitalCity));


        //.startsWith + .endsWith
        System.out.println();
        String austinSentence = "The capital city of Texas is " + txCapitalCity + ", and it is growing quickly.";
        System.out.println(austinSentence);
        System.out.println("austinSentence.startsWith(\"The capital city\") = " + austinSentence.startsWith("The capital city of Texas is Austin, and it is growing quickly."));
        System.out.println("austinSentence.startsWith(\"the capital city\") = " + austinSentence.startsWith("the capital city"));
        System.out.println("austinSentence.startsWith(\"The capitol city\") = " + austinSentence.startsWith("The capitol city"));
        System.out.println();
        System.out.println("austinSentence.endsWith(\"it is growing quickly.\") = " + austinSentence.endsWith("it is growing quickly."));
        System.out.println("austinSentence.endsWith(\"it is growing QUICKLY.\") = " + austinSentence.endsWith("it is growing QUICKLY."));
        System.out.println("austinSentence.endsWith(\"it is growing quick.\") = " + austinSentence.endsWith("it is growing quick."));



        //' ~ " * "string manipulation methods" * " ~ '
        // .indexOf [search start to finish], .lastIndexOf [start end to finish], .charAt(int index)

        System.out.println();
        System.out.println("austinSentence = " + austinSentence);
        System.out.println("austinSentence.indexOf('x') = " + austinSentence.indexOf('x'));

        System.out.println("austinSentence.charAt(20) = " + austinSentence.charAt(20));
        System.out.println("austinSentence.charAt(21) = " + austinSentence.charAt(21));
        System.out.println("austinSentence.charAt(22) = " + austinSentence.charAt(22));
        System.out.println("austinSentence.charAt(23) = " + austinSentence.charAt(23));
        System.out.println("austinSentence.charAt(24) = " + austinSentence.charAt(24));



        System.out.println();
        System.out.println("austinSentence.indexOf(\"capital city\") = " + austinSentence.indexOf("capital city"));
        System.out.println("austinSentence.indexOf(\"capitol city\") = " + austinSentence.indexOf("capitol city"));

        System.out.println("***************************************************************");
        System.out.println("** indexOf goes start to end, lastIndexOf goes end to start: **");
        System.out.println("***************************************************************");

        System.out.println(austinSentence);
        System.out.println("austinSentence.indexOf(\"is\") = " + austinSentence.indexOf("is"));
        System.out.println("austinSentence.lastIndexOf(\"is\") = " + austinSentence.lastIndexOf("is"));
        System.out.println();
        //int length() - returns length of string

        System.out.println("austinSentence = " + austinSentence);
        System.out.println("austinSentence.length() = " + austinSentence.length());
        System.out.println("txCapitalCity = " + txCapitalCity);
        System.out.println("txCapitalCity.length() = " + txCapitalCity.length());
        System.out.println();

        //String .replace(searchPattern, replacementString) - Returns a copy of the string with the matching pattern replaced by the second argument


        String newAustinSentence = austinSentence.replace("is Austin, and it is", "was five cities before Austin, and the state is");
        System.out.println(austinSentence);
        System.out.println(newAustinSentence);

        //.toLowerCase() & toUpperCase()
        System.out.println();
        System.out.println("txCapitalCity = " + txCapitalCity);
        System.out.println("txCapitalCity.toLowerCase() = " + txCapitalCity.toLowerCase());
        System.out.println("txCapitalCity.toUpperCase() = " + txCapitalCity.toUpperCase());
        System.out.println("txCapitalCity = " + txCapitalCity);


        //,trim() - trim off whitespace on either end of your string

        String paddingAustin = "      austin        ";
        String noPaddingAustin = "austin";
        System.out.println("paddingAustin = " + paddingAustin + ".");
        System.out.println("paddingAustin.trim() = " + paddingAustin.trim() + ".");

        System.out.println("noPaddingAustin = " + noPaddingAustin + ".");
        System.out.println("noPaddingAustin = " + noPaddingAustin.trim() + ".");

        // Woops : Let's talk about substring :O

        System.out.println("austinSentence.substring(20,25) = " + austinSentence.substring(20, 25));

    }


}
