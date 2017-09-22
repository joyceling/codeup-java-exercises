public class MethodsExercises {


    public static void main (String[] args) {
        System.out.println(add(5, 7));
        System.out.println(subtract(5, 7));
        System.out.println(multiply(5, 7));
        System.out.println(divide(5, 0));
        System.out.println(modulus(22, 10));
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

}
