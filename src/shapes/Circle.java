package shapes;

public class Circle {
    private double radius;
    private static int numberOfCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public double getArea() {
        return 3.14 * (radius * radius);
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }

    public static int getNumberOfCircles () {
    // read-only property
        return numberOfCircles;
    }

}
