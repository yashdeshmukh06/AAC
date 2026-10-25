public class count {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3 };
        int b[] = new int[3];
        count1(a, b, 3, 3);
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }
    }

    public static void count(int a[], int b[], int n, int k) {
        int c[] = new int[k + 1];

        for (int i = 0; i < n; i++) {
            c[a[i]]++;

        }
        for (int i = 1; i <= k; i++) {
            c[i] = c[i] + c[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            b[c[a[i]] - 1] = a[i];
            c[a[i]]--;
        }
    }

    public static void count1(int a[], int b[], int n, int k) {
        int c[] = new int[k + 1];

        for (int i = 0; i < n; i++) {
            c[a[i]]++;

        }
        for (int i = k - 1; i >= 0; i--) {
            c[i] = c[i] + c[i + 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            b[c[a[i]] - 1] = a[i];
            c[a[i]]--;
        }
    }
}
