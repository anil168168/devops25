public class FibonacciSeries {
    public static void main(String[] args) {
        int x = 20;
        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: " + a + ", " + b);

        for (int i = 2; i < x; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}

