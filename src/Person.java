public class Person {
    //A class: This is the template or a blueprint for a 'PERSON'

    //instance variables
    public String firstName;
    public String lastName;
    public int age;

    //instance method
    public String joinChat(){
      return lastName + " , " + firstName + " has joined the chat!";
    };

    //make a static property - representing the world population
    public static long worldPop = 7_900_000_000L;



    public static void main(String[] args) {
        Person ken = new Person();
        Person mary = new Person();

        mary.firstName = "Mary";
        mary.lastName = "White";
//        Scanner sc = new Scanner(System.in); //We've seen this in scanner :)

        ken.firstName = "Ken";
        ken.lastName = "Howell";

        System.out.println("ken = " + ken);
        System.out.println(ken.firstName + " " + ken.lastName + " is my name!");
        System.out.printf("%s %s is my name!%n", ken.firstName, ken.lastName);

        System.out.println(ken.joinChat());
        System.out.println();
        System.out.println(mary.firstName + " " + mary.lastName + " is my name!");
        System.out.println(mary.joinChat());

        System.out.println("worldPop = " + worldPop);

        Person douglas = new Person();
        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";

        //Douglas didn't get counted in the worldPop :O how would I add him into our count?

        //Would I - access the variable alone?
        //Maybe instead: Access through the class name. . and dot notation
        Person.worldPop += 1;

        System.out.println("worldPop with Douglas :D = " + worldPop);
        System.out.println(douglas.worldPop); //Again: this WILL work, but it is NOT PROPER CODE and NOT BEST PRACTICE

        //Can we . . talk to Person.firstName??

//        System.out.println(Person.firstName); //CTE - no going forward until we fix this


    }


}
