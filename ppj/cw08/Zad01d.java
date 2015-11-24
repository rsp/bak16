public class Zad01d {

    static long[] m  = new long[100];

    static long fib(int n) {

        if (n <= 2)
            return n;

        if (m[n] == 0)
            m[n] = fib(n-1) + fib(n-2);

        return m[n];

    }

    public static void main(String[] args) {

        for (int i = 1; i <= 90; i++)
            System.out.format( "%3d:%20d\n", i, fib(i) );

    }

}
