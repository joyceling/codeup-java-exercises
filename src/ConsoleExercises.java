import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Print an integer below: ");
        int integer = scan.nextInt();

        System.out.println("Enter a 3 word sentence below: ");
        String first = scan.next();
        String second = scan.next();
        String third = scan.next();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        scan.nextLine();

        System.out.println("Enter a sentence below: ");
        String sentence = scan.nextLine();
        System.out.println(sentence);


        System.out.println("Enter the length and width of the classroom (in ft.), respectively: ");
        byte length = scan.nextByte();
        byte width = scan.nextByte();

        System.out.println("The area of the room is: " + length*width);
        System.out.println("The perimeter of the room is: " + (2*length) + (2*width));

    }

}
