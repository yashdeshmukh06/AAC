import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit Of Arrray :");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the Elments :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Elment Search :");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int flag = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                flag = 1;
                System.out.println("Element Found At Position : " + a[mid]);
                break;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (flag == 0) {
            System.out.println("Element Not Found...");
        }
    }
}