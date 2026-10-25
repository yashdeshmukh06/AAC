import java.util.Scanner;

public class NQueens {
    static int x[] = new int[20];
    static int n;

    static boolean place(int k, int i) {
        for (int j = 1; j < k; j++) {
            if (x[j] == i || Math.abs(x[j] - i) == Math.abs(j - k))
                return false;
        }
        return true;
    }

    static void nQueens(int k) {
        int i, j;

        for (i = 1; i <= n; i++) {
            if (place(k, i)) {
                x[k] = i;

                if (k == n) {
                    System.out.println("\nSolution:");

                    for (i = 1; i <= n; i++) {
                        for (j = 1; j <= n; j++) {
                            if (x[i] == j)
                                System.out.print("Q ");
                            else
                                System.out.print("- ");
                        }
                        System.out.println();
                    }
                } else {
                    nQueens(k + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of queens: ");
        n = sc.nextInt();

        if (n < 1 || n > 19) {
            System.out.println("Enter n between 1 and 19.");
            sc.close();
            return;
        }

        nQueens(1);
        sc.close();
    }
}