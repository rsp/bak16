public class Zad01c {

    static long fib(long n) {

        if (n <= 2)
            return n;

        return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args) {

        for (int i = 1; i <= 90; i++)
            System.out.format( "%3d:%20d\n", i, fib(i) );

    }

}
