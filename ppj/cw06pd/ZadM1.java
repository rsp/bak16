import java.text.DecimalFormat;

public class ZadM1 {

    public static void main(String[] args) {

        solve(1, -2,  1);
        solve(1, -1, -2);
        solve(1,  0,  1);

    }

    static void solve(double a, double b, double c) {

        System.out.format("%sx²%sx%s=0 - ", f(a), g(b), g(c));
        double d = b*b-4*a*c;
        if (Math.abs(d) < 1e-10) {
            System.out.format("jedno rozwiązanie: %s\n",
                f((Math.sqrt(d)-b)/a/2));
        } else if (d > 0) {
            System.out.format("dwa rozwiązania: %s, %s\n",
                f((-Math.sqrt(d)-b)/a/2),
                f((Math.sqrt(d)-b)/a/2));
        } else if (d < 0) {
            System.out.format("dwa rozwiązania: %si, %si\n",
                h(b/a/-2, Math.sqrt(-d)/a/-2),
                h(b/a/-2, Math.sqrt(-d)/a/2));
        }

    }

    static String h(double x, double y) {
        return Math.abs(x) < 1e-10 ? f(y) : f(x)+g(y);
    }

    static String g(double x) {
        return new DecimalFormat("+0.######;-0.######").format(x);
    }

    static String f(double x) {
        return new DecimalFormat("0.######").format(x);
    }

}
