public class Zad02 {

    // element ciagu - rekurencyjnie:

    static int fun1(int a0, int r, int n) {

        if (n == 0)
            return a0;
        else
            return r + fun1(a0, r, n-1);

    }

    // element ciagu - iteracyjnie:

    static int fun2(int a0, int r, int n) {

        int w = a0;
        for (int i = 0; i < n; i++)
            w += r;

        return w;

    }

    // element ciagu - rekurencyjnie ale jak pętla:

    static int fun3(int a0, int r, int n) {

        return fun3(0, a0, r, n);

    }
    static int fun3(int a, int a0, int r, int n) {

        if (n < 1)
            return a+a0;
        else
            return fun3(a+r, a0, r, n-1);

    }

    // element ciagu - bez rekurencji ani iteracji
    // do zweryfikowania pozostałych funkcji:

    static int fun4(int a0, int r, int n) {

        return a0 + r * n;

    }

    public static void main(String[] args) {

        int a0 = 10, r = 2, m = 3;

        System.out.println("fun1:");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%20d\n", i, fun1(a0, r, i) );

        System.out.println("fun2:");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%20d\n", i, fun2(a0, r, i) );

        System.out.println("fun3:");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%20d\n", i, fun3(a0, r, i) );

        System.out.println("fun4:");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%20d\n", i, fun4(a0, r, i) );

    }

}
