package package_11to15;

public class P14_Fibonacci {
    //  Fibonacci series-0 1 1 2 3 5 8 13 21 34
    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        int a = 0, b = 1, c;

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}