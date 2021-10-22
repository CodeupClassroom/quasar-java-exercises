public class SyntaxLecture {

    public static void main(String[] argus){

        System.out.print(" And \\ Or \\ For \\ \n Nor \\ But \\ Yet \\ So");

         int SIDES_OF_A_DICE = 6;

        //I HAVE A 12 SIDED DICE - woops, let's see if I can update my dice var. .

        SIDES_OF_A_DICE += 6;

        System.out.print("\n How many sides are on the dice? " + SIDES_OF_A_DICE);

        int myInteger = 900;
        long morePrecise = myInteger;

        System.out.println("This is a long: "+ (morePrecise + 10000000000L));

        double pi = 3.14159;
        int almostPi = (int) pi;

        System.out.println("This is our version of pi :" + pi);

        System.out.println("This is almostPi: " + almostPi);


    }

}
