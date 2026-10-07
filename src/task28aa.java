import java.util.Scanner;

public class task28aa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            boolean hasEven = (a % 2 == 0) || (b % 2 == 0) || (c % 2 == 0);
            boolean hasOdd = (a % 2 != 0) || (b % 2 != 0) || (c % 2 != 0);

            if (hasEven && hasOdd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
