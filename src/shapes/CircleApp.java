package shapes;
import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main (String[] args) {

        while (true) {
            Scanner scan2 = new Scanner(System.in);
            Input input2 = new Input(scan2);

            System.out.println("Enter the radius of a circle below");
            int radius = input2.getInt();
            Circle circle = new Circle(radius);

            System.out.println("This is the circumference");
            System.out.println(circle.getCircumference());

            System.out.println("This is the area");
            System.out.println(circle.getArea());

            System.out.println("Would you like to continue? (y/n)");

            if (!input2.yesNo()) {
                System.out.println("You have created " + Circle.getNumberOfCircles() + " circles");
                break;
            }

        }
    }

}
