
public class ZadP04 {

    public static void main(String[] args) {

        int n = 32, m = 24;

        int d = 0;
        for (int i = 1; i <= Math.min(m, n); i++)
            if (n % i + m % i == 0) d = i;

        System.out.println(d);

    }

}

