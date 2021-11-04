package shapes;

public class Rectangle {
    // It should have protected properties for both length and width. Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties.
    //
    //Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
    //
    //
    //perimeter = 2 x length + 2 x width
    //area = length x width

    protected double length;
    protected double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
