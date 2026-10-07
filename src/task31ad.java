import java.util.Scanner;

public class task31ad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int sysAns = sc.nextInt();
            int stdAns = sc.nextInt();

            if ((sysAns == 1 && stdAns == 1) || (sysAns != 1 && stdAns != 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
