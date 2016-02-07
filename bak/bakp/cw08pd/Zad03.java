public class Zad03 {

    // element ciagu geometrycznego - rekurencyjnie:

    static double fun1(double a0, double q, int n) {

        if (n == 0)
            return a0;
        else
            return q * fun1(a0, q, n-1);

    }

    // element ciagu geometrycznego - iteracyjnie:

    static double fun2(double a0, double q, int n) {

        double w = a0;
        for (int i = 0; i < n; i++)
            w *= q;

        return w;

    }

    // element ciagu geometrycznego - rekurencyjnie ale jak pętla:

    static double fun3(double a0, double q, int n) {

        return fun3(1, a0, q, n);

    }
    static double fun3(double a, double a0, double q, int n) {

        if (n < 1)
            return a*a0;
        else
            return fun3(a*q, a0, q, n-1);

    }

    // element ciagu geometrycznego - bez rekurencji ani iteracji
    // do zweryfikowania pozostałych funkcji:

    static double fun4(double a0, double q, int n) {

        return a0 * Math.pow(q, n);

    }

    public static void main(String[] args) {

        int m = 3;
        double a0 = 100, q = 1.1;

        System.out.println("---- fun1 ---");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%9.3f\n", i, fun1(a0, q, i) );

        System.out.println("---- fun2 ---");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%9.3f\n", i, fun2(a0, q, i) );

        System.out.println("---- fun3 ---");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%9.3f\n", i, fun3(a0, q, i) );

        System.out.println("---- fun4 ---");
        for (int i = 0; i <= m; i++)
            System.out.format( "%3d:%9.3f\n", i, fun4(a0, q, i) );

    }

}
