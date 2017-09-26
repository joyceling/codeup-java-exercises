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
        String string2 = getString();
        System.out.println(string2);
        if (string2.equalsIgnoreCase("yes") | string2.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
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
        int nextInt = scanner.nextInt();
        // clean-up task
        scanner.nextLine();
        return nextInt;
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
        return scanner.nextDouble();
    }

    public double getDouble(String prompts) {
        System.out.println(prompts);
        return scanner.nextDouble();
    }
}
