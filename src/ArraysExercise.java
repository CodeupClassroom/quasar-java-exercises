import java.util.Arrays;

public class ArraysExercise {

//    1

//    Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

//    Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] people, Person person){
        Person[] newPeople = Arrays.copyOf(people,people.length + 1);
        newPeople[newPeople.length - 1] = person;
        return newPeople;

    }

    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person("Larry");
        people[1] = new Person("Terry");
        people[2] = new Person("Jerry");

        Person person = new Person("Barry");

        Person[] people2 = addPerson(people,person);

        for(int i = 0; i < people2.length; i++){
            System.out.println(people2[i].getName());
        }
    }
}
