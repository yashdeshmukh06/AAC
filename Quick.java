public class quick {
    static void quickSort(int a[], int p, int q) {
        if (p < q) {
            int j = partition(a, p, q);

            quickSort(a, p, j - 1);
            quickSort(a, j + 1, q);
        }

    }

    static int partition(int a[], int m, int p) {
        int v = a[m]; // Pivot
        int i = m;
        int j = p + 1;

        while (true) {
            do {
                i++;
            } while (i <= p && a[i] < v);

            do {
                j--;
            } while (j >= m && a[j] > v);

            if (i >= j) {
                break;
            }

            // Interchange a[i] and a[j]
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        // Place pivot in its correct position
        a[m] = a[j];
        a[j] = v;

        return j;
    }

    public static void main(String[] args) {
        int a[] = { 5, 3, 8, 2, 7, 1, 4 };

        quickSort(a, 0, a.length - 1);

        System.out.println("Sorted array:");
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
