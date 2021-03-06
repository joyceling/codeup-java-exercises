import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {


    public static void main (String[] args) {

        System.out.println(add(5, 7));
        System.out.println(subtract(5, 7));
        System.out.println(multiply(5, 7));
        System.out.println(divide(5, 0));
        System.out.println(modulus(22, 10));
        getFactorial();
        rollTheDice();
    }

    public static int add (int x, int y) {
        return x + y;
    }

    public static int subtract (int x, int y) {
        return x - y;
    }

    public static int multiply (int x, int y) {
        return x * y;
    }

    public static double divide (int x, int y) {
        return (x*1.0/y*1.0);
    }

    public static int modulus (int x, int y) {
        return (x % y);
    }

    public static int getInteger(int min, int max) {
        while (true) {
            System.out.println("\nEnter a number between " + min + " and " + max + ": ");
            Scanner scan = new Scanner(System.in);
            int integer = scan.nextInt();

            if (integer < min || integer > max) {
                System.out.println("This is not in between 1 and 10");
            } else if (integer >= min && integer <= max) {
                return integer;
            }

        }

    }

    public static long getFactorial () {
        while (true) {
            System.out.println("Enter an integer from 1 to 10: ");
            Scanner scan = new Scanner(System.in);
            int integer = scan.nextInt();

            StringBuilder sb = new StringBuilder();
            String str = integer + "! = ";
            sb.append(str);


            // use a ternary operator to distinguish between just 1 or more than 1!


            int counter = 1;
            for (int i = 1; i <= integer; i++) {

                counter *= i;
                sb.append(i);

            }

            System.out.println(sb + " = " + counter);

            System.out.println("Would you like to continue? (y/n)");
            Scanner continueFactorial = new Scanner(System.in);
            scan.nextLine();
            String yesOrNo = scan.nextLine();

            if (!yesOrNo.equalsIgnoreCase("y")) {
                return counter;
            }
        }
    }

    public static long rollTheDice () {
        System.out.println("Enter the number of sides for a pair of die: ");

        // new scanner
        Scanner scan = new Scanner(System.in);
        int integer = scan.nextInt();

        // random generator
        Random rand = new Random();

        scan.nextLine();
        System.out.println("Would you like to roll the die? (y/n)");
        String yesOrNo = scan.nextLine();

        if (yesOrNo.equalsIgnoreCase("y")) {
            int n = rand.nextInt(integer) + 1;
            int o = rand.nextInt(integer) + 1;

            System.out.println("First die: " + n);
            System.out.println("Second die: " + o);

        }

        return integer;

    }





}
