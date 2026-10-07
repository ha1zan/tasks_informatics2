import java.util.Scanner;

public class task27z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            String word;

            if (n % 100 >= 11 && n % 100 <= 14) {
                word = "bochek";
            } else if (n % 10 == 1) {
                word = "bochka";
            } else if (n % 10 >= 2 && n % 10 <= 4) {
                word = "bochki";
            } else {
                word = "bochek";
            }

            System.out.println(n + " " + word);
        }

        scanner.close();
    }
}