package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }


    public double getArea() {
        return this.length * this.width;
    }


    public void setLength(double length) {
        this.length = length;
    }


    public void setWidth(double width) {
        this.width = width;
    }
//    // It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
//    //
//    //Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
//    //
//    //
//    //perimeter = 2 x length + 2 x width
//    //area = length x width
//
//    protected double length;
//    protected double width;
//
//    // constructor
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter() {
//        return 2 * (this.length + this.width);
//    }
}
