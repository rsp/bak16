public class Zad01a {

    static long fib(long n) {
        return n <= 2 ? n
             : fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++)
            System.out.format( "%3d:%12d\n", i, fib(i) );

    }

}
