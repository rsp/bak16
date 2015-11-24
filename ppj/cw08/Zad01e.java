public class Zad01e {

    static long fib(int n) {

        return fib(n, 0, 1, 1);

    }

    static long fib(int n, long a, long b, int i) {

        if (n == i)
            return a + b;

        return fib(n, b, a+b, i+1);

    }

    public static void main(String[] args) {

        for (int i = 1; i <= 90; i++)
            System.out.format( "%3d:%20d\n", i, fib(i) );

    }

}
