import java.util.Scanner;

public class radix {

    static int getMax(int a[], int n) {
        int max = a[0];

        for (int i = 1; i < n; i++)
            if (a[i] > max)
                max = a[i];

        return max;
    }

    // Ascending Radix Sort
    static void radixSort(int a[], int n) {
        int output[] = new int[n];
        int max = getMax(a, n);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            int count[] = new int[10];

            for (int i = 0; i < n; i++)
                count[(a[i] / exp) % 10]++;

            for (int i = 1; i < 10; i++)
                count[i] += count[i - 1];

            for (int i = n - 1; i >= 0; i--) {
                int digit = (a[i] / exp) % 10;
                output[--count[digit]] = a[i];
            }

            for (int i = 0; i < n; i++)
                a[i] = output[i];

            display(a, n, exp);
        }
    }

    // Descending Radix Sort
    static void radixSort1(int a[], int n) {
        int output[] = new int[n];
        int max = getMax(a, n);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            int count[] = new int[10];

            for (int i = 0; i < n; i++)
                count[(a[i] / exp) % 10]++;

            // Cumulative count in descending digit order
            for (int i = 8; i >= 0; i--)
                count[i] += count[i + 1];

            for (int i = n - 1; i >= 0; i--) {
                int digit = (a[i] / exp) % 10;
                output[--count[digit]] = a[i];
            }

            for (int i = 0; i < n; i++) {

                a[i] = output[i];
                System.out.println(a[i] + " ");

            }
            System.out.println();
        }
    }

    static void display(int a[], int n, int exp) {
        if (exp == 1)
            System.out.print("Units pass: ");
        else if (exp == 10)
            System.out.print("Tens pass: ");
        else if (exp == 100)
            System.out.print("Hundreds pass: ");
        else
            System.out.print("Pass (exp=" + exp + "): ");

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Enter n between 1 and 100.");
            sc.close();
            return;
        }

        int a[] = new int[n];

        System.out.println("Enter non-negative elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("\n1. Ascending  2. Descending");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            radixSort(a, n);
        } else if (ch == 2) {
            radixSort1(a, n);
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        sc.close();
    }
}