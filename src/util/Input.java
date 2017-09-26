package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // 12 method signatures, 6 methods

    public Input (Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompts) {
        System.out.println(prompts);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String string = getString();
        if (string.equalsIgnoreCase("yes") | string.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompts){
        System.out.println(prompts);
        System.out.println("(y/n)");

        String string2 = getString();
        System.out.println(string2);


        return string2.equalsIgnoreCase("yes") | string2.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max) {
        int integer = getInt();

        while (true) {

            if (integer < min || integer > max) {
                System.out.println("Try again.");
                integer = getInt();
            } else {
                return integer;
            }
        }

    }

    public int getInt(int min, int max, String prompts) {
        System.out.println(prompts);
        int integer = getInt();

        while (true) {

            if (integer < min || integer > max) {
                System.out.println("Try again.");
                integer = getInt();
            } else {
                return integer;
            }
        }

    }

    public int getInt(){
        if (this.scanner.hasNextInt()) {
            return this.scanner.nextInt();
        } else {
            System.out.println("Invalid Input! Try again.");
            scanner.nextLine();
            return getInt();
        }

    }

    public int getInt(String prompts){
        System.out.println(prompts);
        int nextInt = scanner.nextInt();
        // clean-up task
        scanner.nextLine();
        return nextInt;
    }

    public double getDouble(double min, double max) {
        double doubleInt = getDouble();

        while (true) {
            if (doubleInt < min || doubleInt > max) {
                System.out.println("Try again");
                doubleInt = getInt();
            } else {
                return doubleInt;
            }
        }

    }

    public double getDouble(double min, double max, String prompts) {
        System.out.println(prompts);
        double doubleInt = getDouble();

        while (true) {
            if (doubleInt < min || doubleInt > max) {
                System.out.println("Try again");
                doubleInt = getInt();
            } else {
                return doubleInt;
            }
        }

    }

    public double getDouble() {
        if (this.scanner.hasNextDouble()) {
            return this.scanner.nextDouble();
        } else {
            System.out.println("Invalid Input! Try again.");
            scanner.nextLine();
            return getDouble();
        }
    }

    public double getDouble(String prompts) {
        System.out.println(prompts);
        return scanner.nextDouble();
    }
}
