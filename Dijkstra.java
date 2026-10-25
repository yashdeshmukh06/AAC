public class Dijkstra {
    public static void main(String[] args) {
        int g[][] = {
                { 0, 4, 1, 0 },
                { 4, 0, 2, 5 },
                { 1, 2, 0, 8 },
                { 0, 5, 8, 0 }
        };

        int n = 4, s = 0;
        int d[] = new int[n];
        int Q[] = new int[n];

        // Initialize
        for (int i = 0; i < n; i++) {
            d[i] = 9999;
            Q[i] = 1;
        }
        d[s] = 0;

        // Repeat for all vertices
        for (int count = 0; count < n; count++) {
            int min = 9999, u = -1;

            // Find minimum distance vertex
            for (int i = 0; i < n; i++) {
                if (Q[i] == 1 && d[i] < min) {
                    min = d[i];
                    u = i;
                }
            }

            if (u == -1)
                break;

            Q[u] = 0;

            // Update distances
            for (int v = 0; v < n; v++) {
                if (Q[v] == 1 && g[u][v] != 0 &&
                        d[u] + g[u][v] < d[v]) {
                    d[v] = d[u] + g[u][v];
                }
            }
        }

        // Print shortest distances
        for (int i = 0; i < n; i++) {
            System.out.println("Distance to " + i + " = " + d[i]);
        }
    }
}