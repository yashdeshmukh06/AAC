import java.util.Scanner;

public class primerec

{

    static int count = 0;

    static boolean isPrime(int num, int i) {
        if (i == num) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return isPrime(num, i + 1);
    }

    static int findPrime(int n, int num) {
        if (count == n) {
            return num;
        }

        num++;

        if (isPrime(num, 2)) {
            count++;
        }

        return findPrime(n, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        System.out.println("Nth Prime=" + findPrime(n, 1));
    }
}