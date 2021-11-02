public class Person {
    // Create Person class inside of src that has a private name property that is a string, and the following methods:
    private String name;
    protected int age;


    // The class should have a constructor that accepts a `String` value and sets
    //the person's name to the passed string.
    // constructor
//    public Person(){};

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
        //TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hello from " + this.name);
    }

    // Create a `main` method on the class that creates a new `Person` object and
    //tests the above methods.
    public static void main(String[] args) {
//        Person shan = new Person("Shanshan");
//
//        String shanName = shan.getName();
//        String shanName2 = shan.name;
//        System.out.println("shanName = " + shanName);
//        System.out.println("shanName2 = " + shanName2);
//
//        shan.setName("Shanshan Su");
//        System.out.println("shan.getName() = " + shan.getName());
//
//        shan.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println("person1 = " + person1);
//        System.out.println("person2 = " + person2);
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println("person1 = " + person1);
//        System.out.println("person2 = " + person2);
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }

}
