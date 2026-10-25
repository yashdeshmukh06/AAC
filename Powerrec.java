import java.util.Scanner;

public class powerrec {
    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = sc.nextInt();
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Answer=" + power(x, n));
    }
}