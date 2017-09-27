package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    public static void main (String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            Input input1 = new Input(scan);

            String[] whatWouldYouLiketoDo = {
                    "exit",
                    "view all movies",
                    "view movies in the animated category",
                    "view movies in the drama category",
                    "view movies in the horror category",
                    "view movies in the scifi category"};


            for (int i = 0; i < 6; i++) {
                System.out.println(i + " - " + whatWouldYouLiketoDo[i]);
            }

            System.out.println();
            System.out.println();
            int userInput = input1.getInt(0, 6, "What would you like to do?");

            Movie[] movies = MoviesArray.findAll();

            switch (userInput) {
                case 0:
                    break;
                case 1:
                    // view all movies
                    for (int i = 0; i < movies.length; i++) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                    break;
                case 2:
                    // animated cat
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory().equals("animated")) {
                            System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                        }
                    }
                    break;
                case 3:
                    // drama cat
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory().equals("drama")) {
                            System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                        }
                    }
                    break;
                case 4:
                    // horror cat
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory().equals("horror")) {
                            System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                        }
                    }
                    break;
                case 5:
                    // scifi cat
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory().equals("scifi")) {
                            System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                        }
                    }
                    break;
            }

            System.out.println();
            System.out.println();
            input1.yesNo("Would you like to continue?");

            if (!input1.yesNo()) {
                break;
            }
        }

    }
}
