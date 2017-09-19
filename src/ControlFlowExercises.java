public class ControlFlowExercises {
    public static void main(String[] args) {
        // LOOP BASICS
        // do-while loop
        long i = 2;
        int base = 1;

        do {
            if (i <= 2) {
                System.out.println(i);
                i = i*i;
            } else {
                System.out.println(i);
                i = (i * i);
            };

        } while (i < 100000);

    };
}
