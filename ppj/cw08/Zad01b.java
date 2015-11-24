public class Zad01b {

    static long[] m  = new long[100];

    static long fib(int n) {
        return n <= 2 ? n
             : m[n] > 0 ? m[n]
             : (m[n] = fib(n-1) + fib(n-2));
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++)
            System.out.format( "%3d:%12d\n", i, fib(i) );

    }

}
