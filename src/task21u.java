import java.util.Arrays;
import java.util.Scanner;

public class task21u {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLong()) {
            long[] sides = new long[3];
            sides[0] = scanner.nextLong();
            sides[1] = scanner.nextLong();
            sides[2] = scanner.nextLong();

            Arrays.sort(sides);

            long a = sides[0];
            long b = sides[1];
            long c = sides[2];

            if (a + b <= c) {
                System.out.println("impossible");
            } else {
                long sumSq = a * a + b * b;
                long cSq = c * c;

                if (sumSq == cSq) {
                    System.out.println("right");
                } else if (sumSq > cSq) {
                    System.out.println("acute");
                } else {
                    System.out.println("obtuse");
                }
            }
        }

        scanner.close();
    }
}