public class Fractional {
    public static void main(String[] args) {
        int w[] = { 10, 20, 30 };
        int p[] = { 60, 100, 120 };
        int n = 3;
        int m = 50;

        double profit = fractional(n, m, w, p);

        System.out.println("Maximum Profit = " + profit);
    }

    public static double fractional(int n, int m, int w[], int p[]) {
        double[] ans = new double[n];
        for (int i = 0; i < n; i++) {
            ans[i] = (double) p[i] / w[i];

        }
        select1(ans, p, w, n);
        double totalProfit = 0;
        int remaining = m;

        for (int i = 0; i < n; i++) {

            if (w[i] <= remaining) {

                totalProfit += p[i];
                remaining -= w[i];
            } else {

                totalProfit += ans[i] * remaining;
                remaining = 0;
                break;
            }

            if (remaining == 0) {
                break;
            }
        }

        return totalProfit;
    }

    public static void select1(double a[], int pf[], int w[], int n) {
        for (int i = 0; i < n; i++) {
            int p = max(a, i, n);
            double temp = a[p];
            a[p] = a[i];
            a[i] = temp;
            int temp1 = pf[p];
            pf[p] = pf[i];
            pf[i] = temp1;

            int temp2 = w[p];
            w[p] = w[i];
            w[i] = temp2;

        }
    }

    public static int max(double a[], int i, int n) {
        double min = a[i];
        int idx = i;
        for (int j = i; j < n; j++) {
            if (min < a[j]) {
                min = a[j];
                idx = j;

            }
        }
        return idx;
    }
}
