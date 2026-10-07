import java.util.Scanner;

public class task24w {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int cnt60 = n / 60;
            int rem60 = n % 60;

            int cnt10 = rem60 / 10;
            int rem10 = rem60 % 10;
            int cnt1 = 0;

            if (rem10 * 15 > 125) {
                cnt10++;
                cnt1 = 0;
            } else {
                cnt1 = rem10;
            }

            if (cnt10 * 125 + cnt1 * 15 > 440) {
                cnt60++;
                cnt10 = 0;
                cnt1 = 0;
            }

            System.out.println(cnt1 + " " + cnt10 + " " + cnt60);
        }

        scanner.close();
    }
}
