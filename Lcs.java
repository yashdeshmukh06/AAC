public class LCS {

    public static void main(String[] args) {
        String X = "ACGCTAC";
        String Y = "CTGACA";

        int m = X.length();
        int n = Y.length();

        int c[][] = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = Math.max(c[i - 1][j],
                            c[i][j - 1]);
                }
            }
        }

        System.out.println("LCS Length = " + c[m][n]);

        char lcs[] = new char[c[m][n]];
        int i = m, j = n;
        int index = c[m][n] - 1;

        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcs[index] = X.charAt(i - 1);
                index--;
                i--;
                j--;
            } else if (c[i - 1][j] >= c[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        System.out.print("LCS = ");
        for (int k = 0; k < lcs.length; k++) {
            System.out.print(lcs[k]);
        }
    }
}
