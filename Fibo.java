import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        if (n == 0) {
            System.out.println("Fibonacci=" + a);
        } else if (n == 1) {
            System.out.println("Fibonacci=" + b);
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonacci=" + b);
        }
    }
}