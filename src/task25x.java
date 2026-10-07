import java.util.Scanner;

public class Main {
    static class State {
        long cost = (long) 1e18;
        int trips = 0;
        int[] c = new int[5];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int cnt60 = n / 60;
            int rem = n % 60;

            int[] rides = {1, 5, 10, 20, 60};
            int[] prices = {15, 70, 125, 230, 440};

            int maxTrips = rem + 60;
            State[] dp = new State[maxTrips + 1];
            for (int i = 0; i <= maxTrips; i++) {
                dp[i] = new State();
            }
            dp[0].cost = 0;

            for (int i = 0; i <= maxTrips; i++) {
                if (dp[i].cost == (long) 1e18) continue;

                for (int k = 0; k < 5; k++) {
                    int nxt = i + rides[k];
                    if (nxt <= maxTrips) {
                        long nCost = dp[i].cost + prices[k];
                        int nTrips = dp[i].trips + rides[k];

                        if (nCost < dp[nxt].cost || (nCost == dp[nxt].cost && nTrips > dp[nxt].trips)) {
                            dp[nxt].cost = nCost;
                            dp[nxt].trips = nTrips;
                            for (int j = 0; j < 5; j++) {
                                dp[nxt].c[j] = dp[i].c[j] + (j == k ? 1 : 0);
                            }
                        }
                    }
                }
            }

            State best = new State();
            for (int i = rem; i <= maxTrips; i++) {
                if (dp[i].cost < best.cost || (dp[i].cost == best.cost && dp[i].trips > best.trips)) {
                    best = dp[i];
                }
            }

            System.out.println(best.c[0] + " " + best.c[1] + " " + best.c[2] + " " + best.c[3] + " " + (cnt60 + best.c[4]));
        }

        scanner.close();
    }
}