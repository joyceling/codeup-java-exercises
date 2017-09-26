package util;
import java.util.Scanner;

public class InputTest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Input input1 = new Input(scan);

        System.out.println(input1.getString("Print a string below."));

        System.out.println(input1.yesNo("Would you like to continue? (y/n)"));

        System.out.println(input1.getInt(1, 10, "Enter a number between 1 and 10"));

        System.out.println(input1.getDouble(1, 10, "Enter a decimal between 1 and 10"));
    }
}
