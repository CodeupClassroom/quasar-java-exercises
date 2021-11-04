package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }


    public double getPerimeter() {
        double side = this.length;
        return side * 4;
    }


    public double getArea() {
        double side = this.width;
        return side * side;
    }


    public void setLength(double side) {
        this.length = side;
    }


    public void setWidth(double side) {
        this.width = side;
    }
//    private double side;
//
//    // Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    // override the getArea and getPerimeter methods with the following definitions for a square
//    //
//    //
//    //perimeter = 4 x side
//    //area = side ^ 2
//
//    public double getArea() {
//        System.out.println("get area from Square: ");
//        return this.side * this.side;
//    }
//
//    public double getPerimeter() {
//        System.out.println("get perimeter from Square: ");
//        return this.side * 4;
//    }
}
