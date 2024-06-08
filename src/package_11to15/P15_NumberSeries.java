package package_11to15;

public class P15_NumberSeries {

    // complete the series- 8, 6, 9, 23, 87, _

    public static void main(String[] args) {
        int n = 5; // Number of terms to print
        int firstNumber = 8;

        System.out.print(firstNumber+" ");
        for (int i = 1; i <= n; i++) {

            int nextNumber = firstNumber * i - (i + 1);
            System.out.print(nextNumber + " ");
            firstNumber = nextNumber;
        }
    }
}