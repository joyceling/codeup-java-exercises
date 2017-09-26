import java.util.Random;

public class ServerNameGenerator {

    private static String [] adjectives = {
        "brave", "calm", "delightful", "eager",
        "faithful", "gentle", "happy", "generous",
        "observant", "delicate"
    };

    private static String [] nouns = {
        "bag", "wall", "duck", "jacket", "sheets",
        "fan", "fork", "bread", "hair", "chest"
    };

    private static String returnARandomElement (String[] array) {
        Random ran = new Random();
        int randomNum = ran.nextInt(11);
        return array[randomNum];
    };


    public static void main (String [] args) {
        System.out.print(returnARandomElement(adjectives));
        System.out.print("-");
        System.out.print(returnARandomElement(nouns));

    }
}
