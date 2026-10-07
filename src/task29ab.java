import java.util.Scanner;

public class task29ab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();

            int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < values.length; i++) {
                while (x >= values[i]) {
                    result.append(symbols[i]);
                    x -= values[i];
                }
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}
