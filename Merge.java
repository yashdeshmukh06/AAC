
public class merge {

    static int a[] = { 5, 2, 8, 1, 3 };
    static int b[] = new int[a.length];

    public static void merge(int low, int mid, int high) {
        int h = low;
        int i = low;
        int j = mid + 1;

        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h++;
            } else {
                b[i] = a[j];
                j++;
            }
            i++;
        }

        if (h > mid) {
            for (int k = j; k <= high; k++) {
                b[i] = a[k];
                i++;
            }
        } else {
            for (int k = h; k <= mid; k++) {
                b[i] = a[k];
                i++;
            }
        }

        for (int k = low; k <= high; k++) {
            a[k] = b[k];
        }
    }

    public static void mergeSort(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(low, mid);
            mergeSort(mid + 1, high);

            merge(low, mid, high);
        }
    }

    public static void main(String[] args) {
        mergeSort(0, a.length - 1);

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
