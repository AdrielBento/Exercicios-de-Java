
public class Fibonacci {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {

            System.out.print(fibo(i) + ",");
            if (fibo(i) > n) {
                i = n;
            }
        }

    }

    public static int fibo(int value) {

        return (value < 2) ? value : fibo(value - 1) + fibo(value - 2);
    }
}