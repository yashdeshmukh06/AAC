public class StrassenMatrix {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        int a00 = A[0][0], a01 = A[0][1];
        int a10 = A[1][0], a11 = A[1][1];

        int b00 = B[0][0], b01 = B[0][1];
        int b10 = B[1][0], b11 = B[1][1];

        int m1 = (a00 + a11) * (b00 + b11);
        int m2 = (a10 + a11) * b00;
        int m3 = a00 * (b01 - b11);
        int m4 = a11 * (b10 - b00);
        int m5 = (a00 + a01) * b11;
        int m6 = (a10 - a00) * (b00 + b01);
        int m7 = (a01 - a11) * (b10 + b11);

        int c00 = m1 + m4 - m5 + m7;
        int c01 = m3 + m5;
        int c10 = m2 + m4;
        int c11 = m1 - m2 + m3 + m6;

        System.out.println("Result Matrix:");

        System.out.println(c00 + " " + c01);
        System.out.println(c10 + " " + c11);
    }
}