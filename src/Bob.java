import java.util.Scanner;

public class Bob {

    public static void main (String[] args){

    while (true) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Say something to Bob.");
        String userAnswer = scan.nextLine();

        String lastCharacter = userAnswer.substring(userAnswer.length() - 1);

        if (lastCharacter.equals("?")) {
            System.out.println("Bob: Sure.\n");
        } else if (lastCharacter.equals("!")) {
            System.out.println("Bob: Whoa, chill out!\n");
        } else if (userAnswer.equals("Bob") || userAnswer.equals("bob")) {
            System.out.println("Bob: Fine. Be that way!\n");
        } else {
            System.out.println("Bob: Whatever.\n");
        }

    }




    }

};
