import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        // Table of Powers

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter an integer below: ");
//        int integer = scan.nextInt();
//        System.out.println("number | squared | cubed");
//        System.out.println("-------|---------|--------");
//
//        for (long i = 1; i <= integer; i++) {
//
//            System.out.println(i + "      |" + i*i + "        |" +i*i*i);
//        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade percentage below: ");
        int integer = scan.nextInt();

        if (integer < 100 && integer > 88) {
            System.out.println("You got an A!");
        } else if (integer < 87 && integer > 80) {
            System.out.println("You got a B!");
        } else if (integer < 79 && integer > 67) {
            System.out.println("You got a C!");
        } else if (integer < 66 && integer > 60) {
            System.out.println("You got a D!");
        } else if (integer < 60 && integer > 0) {
            System.out.println("You got an F!");
        } else {
            System.out.println("That isn't a valid entry. Please try again.");
        }


    };
}
