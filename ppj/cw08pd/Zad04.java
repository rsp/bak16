public class Zad04 {

    // potegowanie - rekurencyjnie:

    static long fun1(long x, long n) {

        if (n == 0)
            return 1;
        else
            return x * fun1(x, n-1);

    }

    // potegowanie - iteracyjnie:

    static long fun2(long x, long n) {

        long w = 1;
        for (int i = 0; i < n; i++)
            w *= x;

        return w;

    }

    // potegowanie - rekurencyjnie ale jak pętla:

    static long fun3(long x, long n) {

        return fun3(1, x, n);

    }
    static long fun3(long a, long x, long n) {

        if (n < 1)
            return a;
        else
            return fun3(a*x, x, n-1);

    }

    // potegowanie - bez rekurencji ani iteracji
    // do zweryfikowania pozostałych funkcji:

    static long fun4(long x, long n) {

        return (long)Math.pow(x, n);

    }

    public static void main(String[] args) {

        int x = 10, m = 3;

        System.out.println("--------- fun1 ---------");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%20d\n", i, fun1(x, i) );

        System.out.println("--------- fun2 ---------");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%20d\n", i, fun2(x, i) );

        System.out.println("--------- fun3 ---------");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%20d\n", i, fun3(x, i) );

        System.out.println("--------- fun4 ---------");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%20d\n", i, fun4(x, i) );

    }

}
