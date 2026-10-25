public class Floydwarshalls {

    public static void allPaths(int cost[][], int n) {
        int a[][] = new int[n][n];

        // Initialize distance matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = cost[i][j];
            }
        }

        // Floyd-Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (a[i][k] != Integer.MAX_VALUE &&
                            a[k][j] != Integer.MAX_VALUE) {

                        a[i][j] = Math.min(
                                a[i][j],
                                a[i][k] + a[k][j]);
                    }
                }
            }

            System.out.println("After vertex " + (k + 1) + ":");
            printMatrix(a, n);
        }

        System.out.println("Final shortest distance matrix:");
        printMatrix(a, n);
    }

    public static void printMatrix(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == Integer.MAX_VALUE) {
                    System.out.print("INF\t");
                } else {
                    System.out.print(a[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE;

        int cost[][] = {
                { 0, 4, 18, 10 },
                { 3, 0, 1, INF }, { INF, 2, 0, 5 }, { 4, 17, 5, 0 } };

        allPaths(cost, 4);
    }
}
