package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        // create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//        //verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//        //create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        //verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//
//        Rectangle box1 = new Rectangle(4, 5);
//        Rectangle box2  = new Square(5); // polymorphism
//
//        System.out.println("box1's area and perimeter: ");
//        System.out.println("area: " + box1.getArea());
//        System.out.println("perimeter: " + box1.getPerimeter());
//
//        System.out.println("-------------------------------");
//
//        System.out.println("box2's area and perimeter: ");
//        System.out.println("area: " + box2.getArea());
//        System.out.println("perimeter: " + box2.getPerimeter());
//
//        // How can you determine which getArea and getPerimeter methods are being called on each object?
//        // It depends on the instance from which class (Square or Rectangle -- after new keyword)


        Quadrilateral myShape = new Rectangle(4, 5);
        System.out.println("myShape's area: " + myShape.getArea());
        System.out.println("myShape's perimeter: " + myShape.getPerimeter());

        System.out.println("-----------------");

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


        // Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        // shapes.Rectangle is not abstract and does not override abstract method getArea() in shapes.Measurable

        // What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
        myShape.getLength(); // Cannot resolve method 'getLength' in 'Measurable'
        System.out.println("-----------------");
        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());

    }
}