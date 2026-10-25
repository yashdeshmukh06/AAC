import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int i = 0;
        int j = n / 2;
        for (int val = 1; val <= n * n; val++) {
            a[i][j] = val;
            int r = (i - 1 + n) % n;
            int c = (j - 1 + n) % n;
            if (a[r][c] != 0) {
                i = (i + 1) % n;
            } else {
                i = r;
                j = c;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}