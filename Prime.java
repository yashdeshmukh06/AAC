import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int num = 1;
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        while (count < n) {
            num++;
            int c = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    c = c + 1;
                }
            }
            if (c == 2) {
                count = count + 1;
            }
        }
        System.out.println("Nth Prime=" + num);
    }
}
