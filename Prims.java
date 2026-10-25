public class Prims {

    public static void main(String[] args) {

        int INF = 999;
        int n = 4;

        int[][] graph = {
                { 0, 1, 4, INF },
                { 1, 0, 2, 5 },
                { 4, 2, 0, 3 },
                { INF, 5, 3, 0 }
        };

        int[] visited = new int[n];
        visited[0] = 1;

        int edges = 0;
        int cost = 0;

        while (edges < n - 1) {
            int min = INF;
            int u = -1, v = -1;
            for (int i = 0; i < n; i++) {
                if (visited[i] == 1) {
                    for (int j = 0; j < n; j++) {
                        if (visited[j] == 0 && graph[i][j] < min) {
                            min = graph[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }
            System.out.println(u + "->" + v + " : " + min);

            visited[v] = 1;
            cost += min;
            edges++;
        }
        System.out.println("Minimum Cost" + cost);
    }
}
