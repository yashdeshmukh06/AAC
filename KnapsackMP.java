import java.util.Scanner;

public class KnapsackMP {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, W, i, w;
        int wt[] = new int[100];
        int profit[] = new int[100];
        int dp[][] = new int[101][101];

        System.out.print("Enter number of items: ");
        n = sc.nextInt();

        System.out.println("Enter weights of items:");
        for (i = 1; i <= n; i++)
            wt[i] = sc.nextInt();

        System.out.println("Enter profits of items:");
        for (i = 1; i <= n; i++)
            profit[i] = sc.nextInt();

        System.out.print("Enter knapsack capacity: ");
        W = sc.nextInt();

        // Dynamic Programming
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {

                if (i == 0 || w == 0)
                    dp[i][w] = 0;

                else if (wt[i] <= w)
                    dp[i][w] = max(
                            profit[i] + dp[i - 1][w - wt[i]],
                            dp[i - 1][w]);

                else
                    dp[i][w] = dp[i -
                            1][w];
            }
        }

        System.out.println("Maximum profit = " + dp[n][W]);

        // Find selected items
        System.out.print("Selected items: ");
        w = W;

        for (i = n; i >= 1; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                System.out.print(i + " ");
                w = w - wt[i];
            }
        }

        sc.close();
    }
}