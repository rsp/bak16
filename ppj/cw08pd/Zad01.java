public class Zad01 {

    // silnia - rekurencyjnie:
    static long silnia1(int n) {

        if (n == 0)
            return 1;
        else
            return n * silnia1(n-1);

    }

    // silnia - iteracyjnie:
    static long silnia2(int n) {

        long s = 1;
        for (int j = 1; j <= n; j++)
            s *= j;

        return s;

    }

    // silnia - rekurencyjnie ale trochę inaczej:
    static long silnia3(int n) {

        return silnia3(1, n);

    }
    static long silnia3(long a, int n) {

        if (n < 2)
            return a;
        else
            return silnia3(a*n, n-1);

    }

    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++)
            System.out.format( "%3d:%20d\n", i, silnia1(i) );

        for (int i = 0; i <= 20; i++)
            System.out.format( "%3d:%20d\n", i, silnia2(i) );

        for (int i = 0; i <= 20; i++)
            System.out.format( "%3d:%20d\n", i, silnia3(i) );

    }

}
