package shapes;

import util.Input;

public class CircleApp {
    private static int circleNum = 0;

    public static int getCircleNum() {
        return circleNum + 1;
    }

    public static void main(String[] args) {
        Input input = new Input();

        do {
            System.out.println("Please enter a circle's radius.");
            double radius = input.getDouble();

            Circle circle = new Circle(radius);
            circleNum = getCircleNum();

            double circumference = circle.getCircumference();
            double area = circle.getArea();
            System.out.printf("The radius is %f%n", radius);
            System.out.printf("The circle's circumference is %f and the area is %f.%n", circumference, area);
            System.out.println("Would you like to make another circle?");
        } while (input.yesNo());

        System.out.printf("You've made %d circles.%n", circleNum);
    }
}
