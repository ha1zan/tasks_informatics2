import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLong()) {
            long m = scanner.nextLong();
            long n = scanner.nextLong();
            long x = scanner.nextLong();
            long y = scanner.nextLong();

            if (x > 1) {
                System.out.println((x - 1) + " " + y);
            }
            if (x < m) {
                System.out.println((x + 1) + " " + y);
            }
            if (y > 1) {
                System.out.println(x + " " + (y - 1));
            }
            if (y < n) {
                System.out.println(x + " " + (y + 1));
            }
        }

        scanner.close();
    }
}