import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main (String[] args) {
        pickARandomNumber(100);
        System.out.println("Guess the number!");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int random = pickARandomNumber(100);
        System.out.println(random);

    }

    public static int pickARandomNumber (int bound) {
        Random rand = new Random();
        String message = "The random number is " + rand.nextInt(100);
        System.out.println(message);

        int randomNumber = rand.nextInt(bound);
        return randomNumber;
    }

    public static String highOrLow (int randomNumber) {
        System.out.println(randomNumber);
        return "This is a string";
    }
}
