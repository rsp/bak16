
public class ZadP03 {

    public static void main(String[] args) {

        int n = 997;

        double d = 1;
        for (int i = 2; i <= n/2; i++) d *= n % i;

        System.out.println(n > 1 && d != 0 ? "tak" : "nie");

    }

}

