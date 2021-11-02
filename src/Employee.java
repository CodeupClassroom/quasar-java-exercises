public class Employee extends Person{


    public Employee(String employeeName) {
        super(employeeName); //calling the constructor method from Person - Person(employeeName)

    }

    public int getAge(){

        return this.age;
    }

    public void sayHello(){
        System.out.println("Welcome to MegaCorp - how may I help you? My name is " + this.getName());
    }

    public void doWork(){
        System.out.println("Work, work . . .");
    }

    public static void main(String[] args) {

        Person unemployedKen = new Person("Kenni");
        System.out.println(unemployedKen.getName());
        unemployedKen.sayHello();
        System.out.println();

        Employee ken = new Employee("Ken");
        ken.sayHello();
        System.out.println("ken.name = " + ken.getName());

        //Let's try to doWork with our Person and then our Employee . .
        ken.doWork();


    }


}
