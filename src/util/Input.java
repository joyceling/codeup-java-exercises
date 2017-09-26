package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input (Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
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

    public int getInt(){
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

    public double getDouble() {
        return scanner.nextDouble();
    }
}
