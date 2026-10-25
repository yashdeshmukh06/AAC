
public class Heap {

    static void heapSort(int a[], int n) {
        buildMaxHeap(a, n);

        for (int i = n - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            maxHeapify(a, 0, i);
        }
    }

    static void buildMaxHeap(int a[], int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(a, i, n);
        }
    }

    static void maxHeapify(int a[], int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < n && a[left] > a[largest]) {
            largest = left;
        }

        if (right < n && a[right] > a[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            maxHeapify(a, largest, n);
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 10, 3, 5, 1 };
        int n = a.length;

        heapSort(a, n);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
