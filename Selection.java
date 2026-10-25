import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int max = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[max]) {
                    max = j;
                }
            }

            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
        }

        System.out.println("Descending order : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
