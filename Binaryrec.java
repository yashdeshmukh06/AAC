import java.util.Scanner;

public class Binaryrec {
    static int search(int a[], int low, int high, int key) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (a[mid] == key) {
            return mid;
        } else if (key < a[mid]) {
            return search(a, low, mid - 1, key);
        } else {
            return search(a, mid + 1, high, key);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter sorted elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search : ");
        int key = sc.nextInt();

        int result = search(a, 0, n - 1, key);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position " + (result + 1));
        }
    }
}