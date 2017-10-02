package grades;
import java.util.HashMap;
import util.Input;
import java.util.Scanner;

public class GradesApplication {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        Input input1 = new Input(scan);

        Student Joyce = new Student ("Joyce");
        Student Bob = new Student("Bob");
        Student George = new Student("George");
        Student Ann = new Student("Ann");

        Joyce.addGrade(3.8);
        Joyce.addGrade(3.1);
        Joyce.addGrade(2.5);

        Bob.addGrade(2.5);
        Bob.addGrade(1.9);
        Bob.addGrade(3.1);

        George.addGrade(3.98);
        George.addGrade(3.75);
        George.addGrade(3.89);

        Ann.addGrade(2.9);
        Ann.addGrade(3.2);
        Ann.addGrade(3.3);

        // create your hashmap
        HashMap<String, Student> students = new HashMap<>();
        students.put("joyceling", Joyce);
        students.put("bobbyboy", Bob);
        students.put("georgeman", George);
        students.put("redannie", Ann);



        while (true) {
            System.out.println("\nHere are the github usernames of our students:\n");
            for (String student : students.keySet()) {
                System.out.print(" | " + student);
            }

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1 - Get more info for a specific student");
            System.out.println("2 - Show info for all students");
            System.out.println("3 - Exit");
            System.out.println("\nSelect an option above.");

            int option = input1.getInt(1, 4);
            scan.nextLine();

            switch (option) {
                case 1:
                    while (true) {
                        System.out.println("\n\nWhat student would you like to see more information on?");
                        String userInput = input1.getString();

                        Student student = students.get(userInput);

                        if(students.get(userInput) != null) {
                            System.out.println("Name: " + student.getName());
                            System.out.println("Username: " + userInput);
                            System.out.println("Current Average:" + student.getGradeAverage());
                            System.out.println("All grades:" + student.getGrades());
                            break;
                        } else {
                            System.out.println("Sorry, no student found with the github username of " + "'" + userInput + "'");
                        }
                    }
                    break;
                case 2:
                    for (String username : students.keySet()) {
                        Student student = students.get(username);

                        System.out.println("\nName: " + student.getName());
                        System.out.println("Username: " + username);
                        System.out.println("Current Average:" + student.getGradeAverage());
                        System.out.println("All grades:" + student.getGrades() +"\n");
                    }

                    break;

                case 3:
                    System.out.println("\nGoodbye, and have a fantastic day! :)");
                    System.exit(0);
                    break;
            }


                if (option != 3) {
                    System.out.println("\nWould you like to return to main menu? (y/n)");
                }

                if (!input1.yesNo()) {
                    System.out.println("\nGoodbye, and have a fantastic day! :)");
                    break;
            }

        }

    }

}

