import java.util.Scanner;

public class task30ac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();

            if (x > 0) {
                System.out.println(1);
            } else if (x < 0) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }
}